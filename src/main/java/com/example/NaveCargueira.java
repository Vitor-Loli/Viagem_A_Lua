package com.example;

public class NaveCargueira extends Nave {
    @Id
    private int id;
    private double capacidadeCarga;

    public NaveCargueira(){
    }
    public NaveCargueira(int id, String modelo,double capacidadeCarga) {
        super(id, modelo);
        this.id = id;
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString(){
        return super.toString() + " Capacidade de carga " + this.capacidadeCarga + "KG";
    }
}
