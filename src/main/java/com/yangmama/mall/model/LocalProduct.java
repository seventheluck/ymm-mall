package com.yangmama.mall.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author wenchaoma
 */
@Entity
@Data
@Table(name = "local_product",
        indexes = {
                @Index(name = "shopifyIdIdx", columnList = "shopifyId"),
                @Index(name = "variantIdIdx", columnList = "variantId")
        }
)
public class LocalProduct {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String shopifyId;
    private String variantId;
    private String name;
    private String vendor;
    private BigDecimal price;
}
