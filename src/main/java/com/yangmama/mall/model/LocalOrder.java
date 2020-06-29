package com.yangmama.mall.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Entity
@Data
@Table(name = "local_order",
        indexes = {
        @Index(name = "shopifyIdx", columnList = "shopifyId", unique = true),
        @Index(name = "displayIdx", columnList = "displayId", unique = true),
        @Index(name = "shippingMethod", columnList = "shippingMethod")
})
public class LocalOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String shopifyId;
    private String displayId;
    private String shippingMethod;
    private String name;
    private String phone;
    private String email;
    private BigDecimal totalPrice;
    private BigDecimal subtotalPrice;
    private String note;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private String status;
    private String sysNote;
    @OneToMany(mappedBy = "localOrder")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonIgnoreProperties("localOrder")
    private Set<LocalOrderLocalProduct> localOrderLocalProducts = new HashSet<>();
}
