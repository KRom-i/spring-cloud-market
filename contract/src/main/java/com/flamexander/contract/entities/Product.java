package com.flamexander.contract.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

//@Entity
//@Table(name = "products")
@Data
@NoArgsConstructor
@ToString
public class Product implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;

//    @ManyToOne
//    @JoinColumn(name="category_id")
    private Category category;

//    @Column(name = "vendor_code")
    private String vendorCode;

//    @Column(name = "title")
    private String title;

//    @Column(name = "short_description")
    private String shortDescription;

//    @Column(name = "full_description")
    private String fullDescription;

//    @Column(name = "price")
    private double price;

//    @Column(name = "create_at")
    public LocalDateTime createAt;

}
