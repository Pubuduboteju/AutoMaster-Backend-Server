package com.ragul.car.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carRecommenderBodyType")
public class CarRecommenderBodyType {
    @Id
    @GeneratedValue
    private Long id;
    private String sedan;
    private String saloon;
    private String hatchback;
    private String suv;
    private String coupe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSedan() {
        return sedan;
    }

    public void setSedan(String sedan) {
        this.sedan = sedan;
    }

    public String getSaloon() {
        return saloon;
    }

    public void setSaloon(String saloon) {
        this.saloon = saloon;
    }

    public String getHatchback() {
        return hatchback;
    }

    public void setHatchback(String hatchback) {
        this.hatchback = hatchback;
    }

    public String getSuv() {
        return suv;
    }

    public void setSuv(String suv) {
        this.suv = suv;
    }

    public String getCoupe() {
        return coupe;
    }

    public void setCoupe(String coupe) {
        this.coupe = coupe;
    }
}
