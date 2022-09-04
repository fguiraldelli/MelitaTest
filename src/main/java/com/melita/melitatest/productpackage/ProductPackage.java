package com.melita.melitatest.productpackage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.melita.melitatest.product.Product;
import lombok.Data;

//To use the @Data annotation you should add the Lombok dependency.
@Data
@Entity
@Table
public class ProductPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
}