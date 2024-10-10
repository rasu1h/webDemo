package com.rassul.simpleWebApplication.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
public class Product {

@Setter
@Getter
@Id private int id;
    @Setter
    @Getter
    @Column(name = "prod_name", length = 100) // Указание длины для строки
    private String name;
    @Setter
    @Getter
    private String description ;
    @Setter
    @Getter
    private String brand;
    @Setter
    @Column(name = "price", precision = 10, scale = 2) // Указание для числового типа
    private BigDecimal price;

    public Product(){

    }
    public Product(int id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", prodName='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
