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
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

		Coffee espresso = Coffee.builder()
				.name("espresso")
				.price(Money.ofMajor(CurrencyUnit.of("CNY"), 20L))
				.createTime(new Date())
				.updateTime(new Date()).build();

		Coffee save = mongoTemplate.save(espresso);
		log.info("Coffee {}",save);

//		List<Coffee> list11 = mongoTemplate.findAll(Coffee.class);
//		log.info("Find {} Coffee", list11.size());
//		list11.forEach(c -> log.info("Coffee {}", c));

		List<Coffee> list = mongoTemplate.find(Query.query(Criteria.where("name").is("espresso").
				andOperator(Criteria.where("price.money.amount").is("30.00"))),Coffee.class);
		log.info("Find {} Coffee", list.size());
		list.forEach(c -> log.info("Coffee {}", c));

        // 为了看更新时间
		Thread.sleep(1000);
		UpdateResult result = mongoTemplate.updateFirst(Query.query(Criteria.where("name").is("espresso")),
				new Update().set("price",Money.ofMajor(CurrencyUnit.of("CNY"), 30)).currentDate("updateTime"),
				Coffee.class);
		log.info("Update result {}",result.getModifiedCount());
		Coffee updateOne = mongoTemplate.findById(save.getId(),Coffee.class);
		log.info("Update result {}",updateOne);

		mongoTemplate.remove(updateOne);
	}
}
