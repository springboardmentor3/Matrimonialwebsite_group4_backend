package com.infosys.MatrimonialWebApplication.entitites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
  private String name;
 private String description;
   private int price;
   @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
private String image;
}