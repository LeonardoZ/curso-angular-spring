package com.leonardoz.crudspring.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name = "courses")
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonProperty("_id")
  private Long id;

  @Column(name = "name", nullable = false, length = 200)
  private String name;

  @Column(name = "category", nullable = false, length = 10)
  private String category;

}
