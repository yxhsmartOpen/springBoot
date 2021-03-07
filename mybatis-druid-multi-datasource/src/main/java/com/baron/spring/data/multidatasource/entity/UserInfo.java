package com.baron.spring.data.multidatasource.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员信息实体类
 *
 * @author yangxuanhua
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 自增主键id */
    private Integer id;
    /** 人员id */
    private String userId;
    /** 用户名 */
    private String userName;
    /** 密码 */
    private String userPassword;
    /** 真实姓名 */
    private String realName;
    /** 手机号 */
    private String mobile;
    /** 创建时间 */
    private Date createTime;
    /** 修改时间 */
    private Date updateTime;
    /** 删除标记 */
    private Integer delFlag;
    /** remark */
    private String remark;
}
