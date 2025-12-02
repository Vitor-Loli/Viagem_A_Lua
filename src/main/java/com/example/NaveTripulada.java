package com.example;

public class NaveTripulada extends Nave {
    // ========== ATRIBUTOS ==========
    private int capacidadeTripulantes;

    // ========== CONSTRUTORES ==========
    public NaveTripulada() {
    }
    public NaveTripulada(int id, String modelo,int capacidadeTripulantes) {
        super(id, modelo);
        this.capacidadeTripulantes = capacidadeTripulantes;
    }

    // ========== GETTERS E SETTERS ==========
    public int getCapacidade() {
        return capacidadeTripulantes;
    }
    public void setCapacidade(int capacidade) {
        this.capacidadeTripulantes = capacidade;
    }

    // ========== TO STRING ==========
    @Override
    public String toString(){

        return super.toString() +  " Capacidade de tripulantes:" + this.capacidadeTripulantes;
    }
}
