package com.luv2code.ecommerce.entity;


import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


    @Column(name = "sku") private String sku;
    @Column(name = "name") private String name;
    @Column(name = "description") private String description;
    @Column(name = "unit_price") private BigDecimal unit_price;
    @Column(name = "image_url") private String image_url;
    @Column(name = "active") private boolean active;
    @Column(name = "units_in_stock") private int units_in_stock;

    @CreationTimestamp
    @Column(name = "date_created") private Date date_created;

    @UpdateTimestamp
    @Column(name = "last_updated") private Date last_updated;

    @ManyToOne @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
