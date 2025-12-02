package com.example;

import org.dizitart.no2.objects.Id;

public class NaveTripulada extends Nave {
    @Id
    private int id;
    private int capacidadeTripulantes;

    public NaveTripulada() {
    }
    public NaveTripulada(int id, String modelo,int capacidadeTripulantes) {
        super(id, modelo);
        this.id = id;
        this.capacidadeTripulantes = capacidadeTripulantes;
    }

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

    @Override
    public String toString(){

        return super.toString() +  " Capacidade de tripulantes:" + this.capacidadeTripulantes;
    }
}
