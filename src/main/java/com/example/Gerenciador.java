package com.example;
import org.dizitart.no2.filters.Filters;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Gerenciador {
    private Scanner scanner;
    ObjectRepository<Astronauta> astronauta = Banco.repositorio(Astronauta.class);
    ObjectRepository<NaveTripulada> naveTripulada = Banco.repositorio(NaveTripulada.class);
    ObjectRepository<NaveCargueira> naveCargueira = Banco.repositorio(NaveCargueira.class);
    ObjectRepository<MissaoEspacial> missao = Banco.repositorio(MissaoEspacial.class);


    public Gerenciador(Scanner scanner) {
        this.scanner = scanner;
    }

    public void cadAstronauta() {
        System.out.println("Informe o nome do Astronauta: ");
        String nome =scanner.nextLine();
        System.out.println("Informe a idade do Astronauta: ");
        int idade =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe a especialidade do Astronauta: ");
        String especialidade =scanner.nextLine();
        int id = 0;

        for (Astronauta a : astronauta.find()) {
            if (a.getId() > id) {
                id = a.getId();
            }
        }

        id += 1;

        astronauta.insert(new Astronauta(id, nome,idade,especialidade));
    }
    public void listarAstronautas() {
        System.out.println("============= ASTRONAUTAS =============\n\n");
        for (Astronauta a : astronauta.find()) {
            System.out.println("---------------------------------------\n" + a.toString());
        }
        System.out.println("---------------------------------------\n\n");
        System.out.println("=======================================");
    }

    public boolean listarAstronautasDispiniveis(){
        boolean flag = false;
        for (Astronauta a : astronauta.find()) {
            if(a.isDisponivel()){
                System.out.println(a.toString());
                flag = true;
            }

        }
        return flag;
    }

    public void cadNave() {
        boolean flag = true;
        do{
            System.out.println("Informe o tipo da nave: \n[1] - Nave de Tripulantes\n[2] - Nave Cargueira");
            int opc = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Informe o modelo da nave: ");
            String modelo = scanner.nextLine();

            int id = 0;

            for (Nave n : naveCargueira.find()) {
                if (n.getId() > id) {
                    id = n.getId();
                }
            }
            for (Nave n : naveTripulada.find()) {
                if (n.getId() > id) {
                    id = n.getId();
                }
            }

            id += 1;

            switch (opc){
                case 1:
                    System.out.println("Informe a capacidade máxima de tripulantes: ");
                    int capacidadeTripulantes =scanner.nextInt();
                    scanner.nextLine();
                    naveTripulada.insert(new NaveTripulada(id , modelo, capacidadeTripulantes));
                    flag = false;
                    break;
                case 2:
                    System.out.println("Informe a capacidade máxima de carga (em KG): ");
                    double capacidadeCarga =scanner.nextDouble();
                    scanner.nextLine();
                    naveCargueira.insert(new NaveCargueira(id , modelo, capacidadeCarga));
                    flag = false;
                    break;
                    default:
                        System.out.println("Opção invalida");
            }
        }while(flag);
    }
    public void listarNaves(){
        System.out.println("=============== NAVES ===============\n\n");


        System.out.println("------------ [Tripulada] ------------");
        for (Nave n : naveTripulada.find()) {
            System.out.println(n.toString());
            System.out.println("-------------------------------------");
        }

        System.out.println("\n\n\n------------ [Cargueira] ------------");
        for (Nave n : naveCargueira.find()) {
            System.out.println(n.toString());
            System.out.println("-------------------------------------");
        }
        System.out.println("\n\n=====================================");
    }

    public boolean listarNavesTripuladasDisponiveis(){
        boolean flag = false;
        for (Nave n : naveTripulada.find()) {
            if(n.isDisponivel()){
                System.out.println(n.toString());
                flag = true;
            }
        }
        return flag;
    }
    public boolean listarNavescargueirasDisponiveis(){
        boolean flag = false;
        for (Nave n : naveCargueira.find()) {
            if(n.isDisponivel()){
                System.out.println(n.toString());
                flag = true;
            }
        }
        return flag;
    }

    public void cadMissaoEspacial() {
        if(astronauta.find().size() == 0){
            System.out.println("Nenhum Astronauta cadastrado!");
            return;
        }
        if(naveTripulada.find().size() == 0 && naveCargueira.find().size() == 0){
            System.out.println("Nenhuma Nave cadastrada!");
            return;
        }

        if(!listarAstronautasDispiniveis()){
            System.out.println("Nenhum astronauta disponível para a missão!");
            return;
        }

        System.out.println("Informe o nome da missão: ");
        String nome =scanner.nextLine();
        System.out.println("Informe a data de lançamento: ");
        String dataLancamento =scanner.nextLine();
        System.out.println("Informe o destino da nave: ");
        String destino =scanner.nextLine();
        System.out.println("Informe o objetivo da missão: ");
        String objetivo =scanner.nextLine();
        System.out.println("Informe o tipo da nave utilizada: \n[1]- Nave de Tripulantes\n[2]- Nave Cargueira");
        int opc = scanner.nextInt();
        scanner.nextLine();
        boolean flag = true;
        do{
            switch (opc){
                case 1:
                    if(!listarNavesTripuladasDisponiveis()){
                        System.out.println("Nenhuma Nave Disponível para a missão!");
                        return;
                    }else{
                        flag = false;
                    }
                    break;
                case 2:
                    if(!listarNavescargueirasDisponiveis()){
                        System.out.println("Nenhuma Nave Disponível para a missão!");
                        return;
                    }else{
                        flag = false;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(flag);
        System.out.println("Informe a nave utilizada para a missão: ");
        int nave = scanner.nextInt();
        scanner.nextLine();
        List<Astronauta> tripulacao = new ArrayList<>();
        for(int i = 0; i<3; i++){
            if (i == 0){
                listarAstronautasDispiniveis();
            }
            if(i > 2){
                break;
            }
            if(i >= 1){
                System.out.println("Deseja informar mais um astronauta? \n[1] - Sim\n[2] - Não");
                int resposta = scanner.nextInt();
                scanner.nextLine();
                if(resposta == 2){
                    break;
                }else{
                    listarAstronautasDispiniveis();
                }
            }
            System.out.println("Informe o " + (i+1) + "º astronauta: ");
            int astronautaid = scanner.nextInt();
            Astronauta a = astronauta.find(ObjectFilters.eq("id", astronautaid)).firstOrDefault();
            tripulacao.add(a);
            a.setDisponivel(false);
            astronauta.update(a);
            scanner.nextLine();
        }

        if(opc == 1){
            missao.insert(new MissaoEspacial(naveTripulada.find(ObjectFilters.eq("id", nave)).firstOrDefault(), nome, dataLancamento, destino , objetivo ,"", tripulacao));
        }else{
            missao.insert(new MissaoEspacial(naveCargueira.find(ObjectFilters.eq("id", nave)).firstOrDefault(), nome, dataLancamento, destino , objetivo ,"", tripulacao));
        }


    }

    public void listarMissoes(){
        for(MissaoEspacial m : missao.find()){
            System.out.println(m.toString());
        }
    }

}
