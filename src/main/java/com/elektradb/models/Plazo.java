package com.elektradb.models;

import jakarta.persistence.*;

@Entity
public class Plazo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int semanas;
    @Column(name = "tasa_normal")
    private double tasaNormal;
    @Column(name = "tasa_puntual")
    private double tasaPuntual;

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public double getTasaNormal() {
        return tasaNormal;
    }

    public void setTasaNormal(double tasaNormal) {
        this.tasaNormal = tasaNormal;
    }

    public double getTasaPuntual() {
        return tasaPuntual;
    }

    public void setTasaPuntual(double tasaPuntual) {
        this.tasaPuntual = tasaPuntual;
    }

}
