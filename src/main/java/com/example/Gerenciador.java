package com.example;
import org.dizitart.no2.objects.ObjectRepository;

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

    public void cadNave() {
        boolean flag = true;
        do{
            System.out.println("Informe o tipo da nave: \n[1] - Nave de Tripulantes\n[2] - Nave Cargueira");
            int opc = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Informe o modelo da nave: ");
            String modelo = scanner.nextLine();

            switch (opc){
                case 1:
                    System.out.println("Informe a capacidade máxima de tripulantes: ");
                    int capacidadeTripulantes =scanner.nextInt();
                    scanner.nextLine();

                    int id = 0;

                    for (Nave n : naveTripulada.find()) {
                        if (n.getId() > id) {
                            id = n.getId();
                        }
                    }

                    id += 1;

                    naveTripulada.insert(new NaveTripulada(id , modelo, capacidadeTripulantes));
                    flag = false;
                    break;
                case 2:
                    System.out.println("Informe a capacidade máxima de carga (em KG): ");
                    double capacidadeCarga =scanner.nextDouble();
                    scanner.nextLine();

                     id = 0;

                    for (Nave n : naveCargueira.find()) {
                        if (n.getId() > id) {
                            id = n.getId();
                        }
                    }

                    id += 1;

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

    public void cadMissaoEspacial() {
        
    }

}
