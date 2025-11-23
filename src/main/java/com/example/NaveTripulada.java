package com.example;

public class NaveTripulada extends Nave {
    private int capacidadeTripulantes;

    public NaveTripulada() {
    }
    public NaveTripulada(String id, String modelo,int capacidadeTripulantes) {
        super(id, modelo, true);
        this.capacidadeTripulantes = capacidadeTripulantes;
    }

    public int getCapacidade() {
        return capacidadeTripulantes;
    }
    public void setCapacidade(int capacidade) {
        this.capacidadeTripulantes = capacidade;
    }

    @Override
    public String toString(){
        super.toString();
        return  "Capacidade de Tripulantes" + this.capacidadeTripulantes + " Pessoas";
    }
}
