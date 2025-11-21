package com.example;
import java.io.Serializable;

public abstract class Nave implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String modelo;
    private boolean disponivel;

    public Nave(){

    }

    public Nave(String id, String modelo, boolean disponivel) {
        this.id = id;
        this.modelo = modelo;
        this.disponivel = disponivel;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public String toString() {
        return "[" + id + "] " + this.modelo + "\n disponivel" + (this.disponivel ? "DISPONIVEL" : "INDISPONIVEL") ;
    }
}
