package com.flamexander.contract.entities;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;


//@Entity
//@Table(name = "categories")
@Data
@ToString
public class Category implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;

//    @Column(name = "title")
    private String title;

}
