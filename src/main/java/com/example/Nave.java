package com.example;

import java.io.Serializable;

import org.dizitart.no2.objects.Id;

public abstract class Nave implements Serializable {
    // =========== ATRIBUTOS ===========
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String modelo;
    private boolean disponivel = true;

    // =========== CONSTRUTORES ===========
    public Nave() {
    }
    public Nave(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
        this.disponivel = true;
    }

    // =========== GETTERS E SETTERS ===========
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // ========== TO STRING ==========
    @Override
    public String toString() {
        return this.getModelo() + " | " + (this.disponivel ? "DISPONIVEL" : "INDISPONIVEL") + "\n";
    }
}
