package com.alexanderfuentesmedina.system.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Person {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column
  private String nombres;

  @Column
  private String apellidos;
}
