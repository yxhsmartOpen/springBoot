package com.baron.lombok;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Baron
 * @date 2020/8/28 17:00
 */
@Data
public class TestGetSetter {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String id;
    private Integer age;

    public void testgetset(){
        System.out.println(new TestGetSetter().age);
    }
}
