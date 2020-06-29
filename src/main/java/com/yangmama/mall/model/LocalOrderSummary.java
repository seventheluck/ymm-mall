package com.yangmama.mall.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(
        indexes = {
                @Index(name = "shippingMethodIdx", columnList = "shippingMethod")
        }
)
@NoArgsConstructor
@AllArgsConstructor
public class LocalOrderSummary {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private LocalProduct localProduct;
    private String shippingMethod;
    private Integer total;
    private BigDecimal amount;
}
