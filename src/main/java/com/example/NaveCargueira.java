package com.example;

public class NaveCargueira extends Nave {
    // ========== ATRIBUTOS ==========
    private double capacidadeCarga;

    // ========== CONSTRUTORES ==========
    public NaveCargueira(){
    }
    public NaveCargueira(int id, String modelo,double capacidadeCarga) {
        super(id, modelo);
        this.capacidadeCarga = capacidadeCarga;
    }

    // ========== GETTERS E SETTERS ==========
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    // ========== TO STRING ==========
    @Override
    public String toString(){
        return super.toString() + " Capacidade de carga " + this.capacidadeCarga + "KG";
    }
}
