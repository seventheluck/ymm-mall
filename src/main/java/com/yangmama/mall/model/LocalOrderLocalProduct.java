package com.yangmama.mall.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author wenchaoma
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "local_order_local_product_relationship")
@Builder
public class LocalOrderLocalProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade={CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "local_order_id")
    private LocalOrder localOrder;
    @ManyToOne(cascade={CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "local_product_id")
    private LocalProduct localProduct;
    private Long quantity;
    private BigDecimal price;
    private String status;
    private LocalDateTime createdAt;
}
