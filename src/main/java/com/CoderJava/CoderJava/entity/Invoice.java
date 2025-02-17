package com.CoderJava.CoderJava.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "invoice")
public class Invoice {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "client_id", nullable = false)
  private Client client;

  private LocalDateTime createdAt;
  private Double total;

  @OneToMany(mappedBy = "invoice")
  private List<InvoiceDetail> details;
}
