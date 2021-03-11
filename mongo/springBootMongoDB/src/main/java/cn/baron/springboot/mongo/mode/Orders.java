package cn.baron.springboot.mongo.mode;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author yangxuanhua
 * @since v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "orders")
@ToString
public class Orders {
    @Id
    private int id ;
    private String  item;
    private int price;
    private int quantity;
}
