package cn.baron.spring.springbucks.repository;


import cn.baron.spring.springbucks.model.CoffeeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Baron
 * @date 2020/8/5 5:12
 */
public interface CoffeeOrderRepository extends JpaRepository<CoffeeOrder, Long> {
}
