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
@ToString
@Document(collection = "inventory")
public class Inventory {
    @Id
    private int id;
    private String description;
    private String sku;
    private int instock;
}
