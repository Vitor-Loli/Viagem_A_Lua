package com.example;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import org.dizitart.no2.objects.Id;


public class MissaoEspacial implements Serializable {
    @Id
    private int id;
    private List<Astronauta> tripulacao = new ArrayList<>();
    private int naveId;
    private String tipoNave; // "Tripulada" ou "Cargueira"
    private String nomeNave; // nome do modelo da nave
    private String nome;
    private String dataDeLancamento;
    private String destino;
    private String objetivo;
    private String resultado;
    private boolean concluida = false;

    public MissaoEspacial() {}

    public MissaoEspacial(Nave nave, String nome, String dataDeLancamento, String destino, String objetivo, String resultado, List<Astronauta> tripulacao) {
        this.tripulacao = tripulacao;
        this.naveId = nave.getId();
        this.nomeNave = nave.getModelo();
        this.tipoNave = nave instanceof NaveTripulada ? "Tripulada" : "Cargueira";
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
    public int getNaveId() {
        return naveId;
    }
    public void setNaveId(int naveId) {
        this.naveId = naveId;
    }
    public String getTipoNave() {
        return tipoNave;
    }
    public void setTipoNave(String tipoNave) {
        this.tipoNave = tipoNave;
    }
    public String getNomeNave() {
        return nomeNave;
    }
    public void setNomeNave(String nomeNave) {
        this.nomeNave = nomeNave;
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== MISSÃO ESPACIAL ===\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Data de Lançamento: ").append(dataDeLancamento).append("\n");
        sb.append("Destino: ").append(destino).append("\n");
        sb.append("Objetivo: ").append(objetivo).append("\n");
        sb.append("Nave: ").append(nomeNave).append(" (").append(tipoNave).append(")\n");
        sb.append("Status: ").append(concluida ? "CONCLUÍDA" : "EM ANDAMENTO").append("\n");
        sb.append("Resultado: ").append(resultado.isEmpty() ? "Pendente" : resultado).append("\n");
        sb.append("Tripulação (").append(tripulacao.size()).append(" astronautas):\n");
        for (Astronauta a : tripulacao) {
            sb.append("  - ").append(a.getNome()).append(" (ID: ").append(a.getId()).append(", Especialidade: ").append(a.getEspecialidade()).append(")\n");
        }
        sb.append("========================\n");
        return sb.toString();
    }
}
