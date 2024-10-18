package com.rassul.simpleWebApplication.Models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

@Setter
@Getter
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

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
@Getter
@Column(name = "price", precision = 10, scale = 2) // Указание для числового типа
private BigDecimal price;

@Setter
@Getter
private LocalDate releaseDate;
@Setter
@Getter
private String Category;

@Setter
@Getter
@Column(name = "available", nullable = true, columnDefinition = "boolean default true")
private boolean available;

@Setter
@Getter
@Column(nullable = false, columnDefinition = "int default 1")
private int quantity;
}
