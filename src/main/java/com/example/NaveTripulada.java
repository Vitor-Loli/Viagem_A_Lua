package com.example;

import org.dizitart.no2.objects.Id;

public class NaveTripulada extends Nave {
    // ========== ATRIBUTOS ==========
    @Id
    private int id;
    private int capacidadeTripulantes;

    // ========== CONSTRUTORES ==========
    public NaveTripulada() {
    }
    public NaveTripulada(int id, String modelo, int capacidadeTripulantes) {
        super(id, modelo);
        this.id = id;
        this.capacidadeTripulantes = capacidadeTripulantes;
    }

    // ========== GETTERS E SETTERS ==========
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCapacidade() {
        return capacidadeTripulantes;
    }
    public void setCapacidade(int capacidade) {
        this.capacidadeTripulantes = capacidade;
    }

    // ========== TO STRING ==========
    @Override
    public String toString() {
        return "[" + id + "] " + super.toString() + " Capacidade de tripulantes:" + this.capacidadeTripulantes;
    }
}
