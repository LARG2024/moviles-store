package com.univer.store.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "PRODUCTOS")
public class ProductoEntity {

    @Id
    @Column(name="ID")
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="SKU")
    private String sku;

    @Column
    private Integer cantidad;

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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}