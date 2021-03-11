package com.baron.springmongo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yangxuanhua
 * @since v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "user_info")
@ToString
public class UserInfo implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 主键使用此注解*/
    @Id
    private String id;

    /** 字段使用此注解*/
    private String name;

    /** 字段还可以用自定义名称*/
    private int age;

    /** 还可以生成索引*/
    @Indexed(name = "index_birth", direction = IndexDirection.DESCENDING)
    private Date birth;
}
