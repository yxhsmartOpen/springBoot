package com.baron.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Baron
 * @date 2020/9/1 18:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GlobalWethForecast implements Serializable {
    /** 城市 */
    protected String city;
    /** 省 */
    protected String province;
    /** 主键id */

    protected String dateId;
    /** 修改时间 */
    private Date updateDate;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    private String pubDate;

    private String weth;

    @JsonIgnore
    private GloabWethDayBean wethBean;
}
