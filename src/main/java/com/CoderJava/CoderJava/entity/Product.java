
package com.CoderJava.CoderJava.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String description;
  private String code;
  private Integer stock;
  private Double price;
}
