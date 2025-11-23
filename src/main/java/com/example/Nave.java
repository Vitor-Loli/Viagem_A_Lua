package com.example;
import java.io.Serializable;

public abstract class Nave implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String modelo;
    private boolean disponivel = true;

    public Nave(){
    }
    public Nave(String id, String modelo) {
        this.id = id;
        this.modelo = modelo;
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
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + this.getModelo() + "\n" + (this.disponivel ? "DISPONIVEL" : "INDISPONIVEL") + "\n";
    }
}
