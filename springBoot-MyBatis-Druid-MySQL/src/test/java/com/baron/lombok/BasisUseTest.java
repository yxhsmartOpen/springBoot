package com.baron.lombok;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Baron
 * @date 2020/9/23 13:48
 */
public class BasisUseTest {
    @Test
    public void testLambda() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(c -> System.out.println(c));  // @3

        List<Integer> list2 = new ArrayList<>();
        // list.forEach(e->list2.add(e));  @1

        list.forEach(list2::add);//     @2 等价于 @1
        list2.forEach(System.out::println); // @4 等价于 @3
        //Map<Integer,Integer> map = list.stream().collect(Collectors.toMap(list::get, list::get,(k1, k2) -> k1)); // 目的是list 转 map，但是内部实现没整明白。

    }
}
