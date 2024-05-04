package org.hibernate.bugs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pie {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String taste;

  public Integer getId() {
    return id;
  }
  public Pie setId(Integer id) {
    this.id = id;
    return this;
  }
  public String getTaste() {
    return taste;
  }
  public Pie setTaste(String taste) {
    this.taste = taste;
    return this;
  }
}
