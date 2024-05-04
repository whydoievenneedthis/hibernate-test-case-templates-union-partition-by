package org.hibernate.bugs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Apple {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private LocalDate bakedOn;
  @ManyToOne
  private Pie bakedPie;

  public Integer getId() {
    return id;
  }
  public Apple setId(Integer id) {
    this.id = id;
    return this;
  }
  public LocalDate getBakedOn() {
    return bakedOn;
  }
  public Apple setBakedOn(LocalDate bakedOn) {
    this.bakedOn = bakedOn;
    return this;
  }
  public Pie getBakedPie() {
    return bakedPie;
  }
  public Apple setBakedPie(Pie bakedPie) {
    this.bakedPie = bakedPie;
    return this;
  }
}
