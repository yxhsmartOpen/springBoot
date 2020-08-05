package com.baron.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单实体类
 * @author Baron
 * @date 2020/7/23 23:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class AliOrder implements Serializable {

    private Integer id;
    private Integer userId;
    private Date createDate;
    private Date updateDate;
    private Integer status;
    private String orderDetail;
    private String remarks;
    private String name;
    private Integer groupId;
}
