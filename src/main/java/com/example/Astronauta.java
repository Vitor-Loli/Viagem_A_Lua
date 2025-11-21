package com.example;

public class Astronauta {
    private String id;
    private String nome;
    private int idade;
    private String especialidade;
    private String horasDeVoo;


    public Astronauta() {
    }
    public Astronauta(String id, String nome, int idade, String especialidade, String horasDeVoo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
        this.horasDeVoo = horasDeVoo;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
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
    
    @Override
    public String toString() {
        return "Astronauta{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especialidade='" + especialidade + '\'' +
                ", horasDeVoo='" + horasDeVoo + '\'' +
                '}';
    }

}
