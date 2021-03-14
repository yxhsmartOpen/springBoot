package cn.baron.springboot.mongo;


import cn.baron.springboot.mongo.converter.MoneyReadConverter;
import cn.baron.springboot.mongo.mode.Coffee;
import com.mongodb.client.result.UpdateResult;
import lombok.extern.slf4j.Slf4j;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author yangxuanhua
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@Slf4j
public class SpringbootMongoDbApplication implements ApplicationRunner {

	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoDbApplication.class, args);
	}

	@Bean
	public MongoCustomConversions mongoCustomConversions(){
		return new MongoCustomConversions(Arrays.asList(new MoneyReadConverter()));
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		test();
		test1();
		test2();
	}

	/**
	 * 双表关联查询
	 */
	private void test2() {
		LookupOperation lookupToLots = LookupOperation.newLookup().
				//关联表名 inventory
				from("inventory").
				//关联字段 item
				localField("item").
				//主表关联字段对应的次表字段
				foreignField("sku").
				//查询结果集合名
				as("inventory_docs");
		List<Map> results =  mongoTemplate.aggregate(Aggregation.newAggregation(lookupToLots),
				"orders",Map.class).getMappedResults();
		results.forEach(map -> {log.info("map : {}",map.keySet());});
		results.forEach(map -> {log.info("map : {}",map.toString());});
	}

	/**
	 * 双表关联查询
	 */
	private void test1() {
		LookupOperation lookupOperation = LookupOperation.newLookup()
				.from("inventory")
				.localField("item")
				.foreignField("sku")
				.as("inventory_docs");
		Aggregation aggregation = Aggregation.newAggregation(lookupOperation);
		List<Map> results =  mongoTemplate.aggregate(aggregation,"orders",Map.class).getMappedResults();
		log.info(results.size()+"");
		for (Map map : results) {
			log.info("map : {}", map);
		}
		for (Map result : results) {
			log.info("key = {} , value = {} ",result.keySet(),result.values());
		}
	}

	private void test() throws Exception {
		Coffee espresso = Coffee.builder()
				.name("espresso")
				.price(Money.ofMajor(CurrencyUnit.of("CNY"), 20L))
				.createTime(new Date())
				.updateTime(new Date()).build();

		Coffee save = mongoTemplate.save(espresso);
		log.info("Coffee {}",save);

		List<Coffee> list11 = mongoTemplate.findAll(Coffee.class);
		log.info("Find {} Coffee", list11.size());
		list11.forEach(c -> log.info("Coffee {}", c));

		List<Coffee> list = mongoTemplate.find(Query.query(Criteria.where("name").is("espresso").
				andOperator(Criteria.where("price.money.amount").is("30.00"))),Coffee.class);
		log.info("Find {} Coffee", list.size());
		list.forEach(c -> log.info("Coffee {}", c));

		// 为了看更新时间
		Thread.sleep(1000);
		UpdateResult result = mongoTemplate.updateFirst(Query.query(Criteria.where("name").is("espresso")),
				new Update().set("price", Money.ofMajor(CurrencyUnit.of("CNY"), 30)).currentDate("updateTime"),
				Coffee.class);
		log.info("Update result {}",result.getModifiedCount());
		Coffee updateOne = mongoTemplate.findById(save.getId(),Coffee.class);
		log.info("Update result {}",updateOne);

		mongoTemplate.remove(updateOne);
	}
}
