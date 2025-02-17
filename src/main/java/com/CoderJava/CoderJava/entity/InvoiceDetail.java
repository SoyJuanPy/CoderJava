package com.CoderJava.CoderJava.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "invoice_details")
public class InvoiceDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer invoiceDetailId;

  @ManyToOne
  @JoinColumn(name = "invoice_id", nullable = false)
  private Invoice invoice;

  private Integer amount;

  @ManyToOne
  @JoinColumn(name = "product_id", nullable = false)
  private Product product;

  private Double price;
}
