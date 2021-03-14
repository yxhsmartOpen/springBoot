package cn.baron.reactive.redisdemon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveStringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@Slf4j
@EnableCaching
@ComponentScan("cn.baron.reactive.redisdemon.schedule")
public class RedisDemoApplication implements ApplicationRunner {
    private static final String KEY = "COFFEE_MENU";

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Qualifier("reactiveStringRedisTemplate")
    @Autowired
    private ReactiveStringRedisTemplate redisTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RedisDemoApplication.class, args);
    }

    @Bean
    ReactiveStringRedisTemplate reactiveRedisTemplate(ReactiveRedisConnectionFactory factory) {
        return new ReactiveStringRedisTemplate(factory);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        ReactiveHashOperations<String, String, String> hashOps = redisTemplate.opsForHash();
//        CountDownLatch cdl = new CountDownLatch(1);
//
//        List<Coffee> list = jdbcTemplate.query(
//                "select * from t_coffee", (rs, i) ->
//                Coffee.builder()
//                        .id(rs.getLong("id"))
//                        .name(rs.getString("name"))
//                        .price(rs.getLong("price"))
//                        .build()
//        );
//
//        Flux.fromIterable(list)
//                .publishOn(Schedulers.single())
//                .doOnComplete(() -> log.info("list ok"))
//                .flatMap(c -> {
//                    log.info("try to put {},{}", c.getName(), c.getPrice());
//                    return hashOps.put(KEY, c.getName(), c.getPrice().toString());
//                })
//                .doOnComplete(() -> log.info("set ok"))
//                .concatWith(redisTemplate.expire(KEY, Duration.ofMinutes(1)))
//                .doOnComplete(() -> log.info("expire ok"))
//                .onErrorResume(e -> {
//                    log.error("exception {}", e.getMessage());
//                    return Mono.just(false);
//                })
//                .subscribe(b -> log.info("Boolean: {}", b),
//                        e -> log.error("Exception {}", e.getMessage()),
//                        () -> cdl.countDown());
//        log.info("Waiting");
//        cdl.await();
    }
}
