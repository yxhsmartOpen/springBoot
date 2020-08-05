package cn.baron.springbootMongoDBRepository.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import cn.baron.springbootMongoDBRepository.mode.Coffee;

import java.util.List;

/**
 * @author Baron
 * @date 2020/8/4 23:24
 */
public interface CoffeeRepository extends MongoRepository<Coffee,String> {

    List<Coffee> findByName(String name);
}
