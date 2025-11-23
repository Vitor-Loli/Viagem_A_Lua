package com.example;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;


public class MissaoEspacial implements Serializable {
    private List<Astronauta> tripulacao;
    private Nave nave;
    private String nome;
    private String dataDeLancamento;
    private String destino;
    private String objetivo;
    private String resultado;
    private boolean concluida = false;

    public MissaoEspacial(Nave nave, String nome, String dataDeLancamento, String destino, String objetivo, String resultado) {
        this.tripulacao = new ArrayList<>();
        this.nave = nave;
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
        this.destino = destino;
        this.objetivo = objetivo;
        this.resultado = resultado;
    }

    public List<Astronauta> getTripulacao() {
        return tripulacao;
    }
    public void setTripulacao(List<Astronauta> tripulacao) {
        this.tripulacao = tripulacao;
    }
    public Nave getNave() {
        return nave;
    }
    public void setNave(Nave nave) {
        this.nave = nave;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataDeLancamento() {
        return dataDeLancamento;
    }
    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public boolean isConcluida() {
        return concluida;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void adicionarAstronauta(Astronauta a) {
        this.tripulacao.add(a);
    }
    public void removerAstronauta(Astronauta a) {
        this.tripulacao.remove(a);
    }
}
