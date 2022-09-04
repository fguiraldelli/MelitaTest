package com.melita.melitatest.order;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.melita.melitatest.customer.Customer;
import com.melita.melitatest.product.Product;
import lombok.Data;

@Data
@Entity
@Table
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Customer customer;
    @OneToMany
    private List<Product> products;
    private LocalDate installationDate;
    private String timeSlotDetails;
    private boolean approved;

}
