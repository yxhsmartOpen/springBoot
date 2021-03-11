package cn.baron.springboot.mongo.repository;

import cn.baron.springboot.mongo.mode.Coffee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Baron
 * @date 2020/8/4 23:24
 */
public interface CoffeeRepository extends MongoRepository<Coffee,String> {
    List<Coffee> findByName(String name);
}
