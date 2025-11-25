package com.example;

public class NaveCargueira extends Nave {
    private double capacidadeCarga;

    public NaveCargueira(){
    }
    public NaveCargueira(int id, String modelo,double capacidadeCarga) {
        super(id, modelo);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString(){
        super.toString();
        return "Capacidade de Carga " + this.capacidadeCarga + " KG";
    }
}
