package com.jacobfrancois.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String goesBy;
    private int paygrade;
    private boolean isActive;

    public Employee(){}

    public Employee(String name, String goesBy, int paygrade, boolean isActive) {
        this.name = name;
        this.paygrade = paygrade;
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGoesBy() {
        return goesBy;
    }

    public int getPaygrade() {
        return paygrade;
    }

    public boolean isActive() {
        return isActive;
    }
}
