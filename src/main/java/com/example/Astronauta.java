package com.example;

import java.io.Serializable;
import org.dizitart.no2.objects.Id;

public class Astronauta implements Serializable {
    // =========== ATRIBUTOS ===========
    @Id
    private int id;
    private String nome;
    private int idade;
    private String especialidade;
    private String horasDeVoo;
    private boolean disponivel;

    // =========== CONSTRUTORES ===========
    public Astronauta() {
    }

    public Astronauta(int id, String nome, int idade, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
        this.horasDeVoo = "Nenhum";
        if (idade >= 21) {
            this.disponivel = true;
        } else {
            this.disponivel = false;
        }
    }

    // =========== GETTERS E SETTERS ===========
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getHorasDeVoo() {
        return horasDeVoo;
    }
    public void setHorasDeVoo(String horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // =========== TO STRING ===========
    @Override
    public String toString() {
        return "[" + id + "] " + nome + " | Idade: " + idade + "\n" +
                "Especialidade: " + especialidade + "\n" +
                "Horas de voo: " + horasDeVoo + "\n" +
                (this.disponivel ? "DISPONIVEL" : "INDISPONIVEL");
    }
}
