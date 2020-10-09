package com.timo.demo;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @Column(nullable = false, columnDefinition = "DECIMAL(6,2) UNSIGNED")
    private Double price;

    @Column(nullable = false, columnDefinition = "DECIMAL(6,2) UNSIGNED")
    @ColumnDefault("1.00")
    private Double cost = 1.00;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        if (cost != null) {
            this.cost = cost;
        }
    }
}
