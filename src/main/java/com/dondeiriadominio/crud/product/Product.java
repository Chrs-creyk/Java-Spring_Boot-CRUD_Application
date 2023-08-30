package com.dondeiriadominio.crud.product;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private float price;
    private LocalDate fecha;
    @Transient
    private int antiguedad;
    @Column(columnDefinition = "text")
    private String contenido;

    public Product() {
    }


    public Product(Long id, String name, float price, LocalDate fecha, String contenido) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public Product(String name, float price, LocalDate fecha, String contenido) {
        this.name = name;
        this.price = price;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getAntiguedad() {
        return Period.between(this.fecha,LocalDate.now()).getYears();
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
