package com.example;

public class NaveTripulada extends Nave {
    private int capacidadeTripulantes;

    public NaveTripulada() {
    }

    public NaveTripulada(String id, String modelo,int capacidade) {
        super(id, modelo, true);
        this.capacidadeTripulantes = capacidade;
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
        return  "\nCapacidade de Tripulantes" + this.capacidadeTripulantes + " Pessoas";
    }
}
