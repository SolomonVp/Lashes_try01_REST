package com.lashes.spring.rest.entity;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "sizeLash")
    private double sizeLash;
    @Column(name = "countVisits")
    private int countVisits;
    @Column(name = "discount")
    private int discount;

    public Client() {
    }

    public Client(int id, String name, String surname, double sizeLash, int countVisits, int discount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.sizeLash = sizeLash;
        this.countVisits = countVisits;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public double getSizeLash() {
        return sizeLash;
    }
    public void setSizeLash(double sizeLash) {
        this.sizeLash = sizeLash;
    }
    public int getCountVisits() {
        return countVisits;
    }
    public void setCountVisits(int countVisits) {
        this.countVisits = countVisits;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
