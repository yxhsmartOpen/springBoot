package com.baron.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户实体类
 * @author Baron
 * @date 2020/07/23 23:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class AliUser implements Serializable {

    private Integer id;
    private String name;
    private Integer phone;
    private String idCard;
    private Integer age;
    private Integer sex;
    private String address;

}
