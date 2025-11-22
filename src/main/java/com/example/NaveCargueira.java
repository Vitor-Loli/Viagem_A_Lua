package com.example;

public class NaveCargueira extends Nave {
    private double capacidadeCarga;
    private int capacidadeTripulantes;

    public NaveCargueira(){

    }
    public NaveCargueira(String id, String modelo,double capacidadeCarga, int capacidadeTripulantes) {
        super(id, modelo, true);
        this.capacidadeCarga = capacidadeCarga;
        this.capacidadeTripulantes = capacidadeTripulantes;
    }

    @Override
    public String toString(){
        super.toString();
        return "\nCapacidade de Carga " + this.capacidadeCarga + " KG" +
                "\nCapacidade de Tripulantes " + this.capacidadeTripulantes + " Pessoas";
    }
}
