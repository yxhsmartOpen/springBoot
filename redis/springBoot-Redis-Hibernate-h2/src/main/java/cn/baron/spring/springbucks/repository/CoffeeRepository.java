package cn.baron.spring.springbucks.repository;

import cn.baron.spring.springbucks.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Baron
 * @date 2020/8/5 5:11
 */
public interface  CoffeeRepository extends JpaRepository<Coffee, Long> {
}
