package cn.baron.springboot.mongo.repository;



import cn.baron.springboot.mongo.repository.converter.MoneyReadConverter;
import cn.baron.springboot.mongo.repository.mode.Coffee;
import cn.baron.springboot.mongo.repository.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Slf4j
public class SpringbootMongoDbApplication implements CommandLineRunner {

	@Autowired
	private CoffeeRepository coffeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoDbApplication.class, args);
	}

	@Bean
	public MongoCustomConversions mongoCustomConversions(){
		return new MongoCustomConversions(Arrays.asList(new MoneyReadConverter()));
	}

	@Override
	public void run(String... args) throws Exception {

		Coffee espresso = Coffee.builder()
				.name("espresso")
				.price(Money.of(CurrencyUnit.of("CNY"),20.0))
				.createTime(new Date())
				.updateTime(new Date()).build();

		Coffee latte = Coffee.builder()
				.name("latte")
				.price(Money.of(CurrencyUnit.of("CNY"), 30.0))
				.createTime(new Date())
				.updateTime(new Date()).build();

		coffeeRepository.insert(Arrays.asList(espresso,latte));
		coffeeRepository.findAll(Sort.by("name")).forEach(c -> log.info("save Coffee {}",c));

		Thread.sleep(5000);
		latte.setPrice(Money.of(CurrencyUnit.of("CNY"),25.0));
		latte.setUpdateTime(new Date());
		coffeeRepository.save(latte);
		coffeeRepository.findByName("latte").forEach(c -> log.info("Coffee {}", c));

		coffeeRepository.deleteAll();
	}
}
