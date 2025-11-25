package com.example;
import org.dizitart.no2.objects.ObjectRepository;

import java.util.Scanner;

public class Gerenciador {
    private Scanner scanner;
    ObjectRepository<Astronauta> astronauta = Banco.repositorio(Astronauta.class);
    ObjectRepository<Nave> nave = Banco.repositorio(Nave.class);
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
        for (Astronauta a : astronauta.find()) {
            System.out.println(a.toString());
        }
    }

    public void cadNave() {
        int opc = 0;
        do{
            System.out.println("Informe o tipo da nave: \n[1] - Nave de Tripulantes\n[2] - Nave Cargueira");
            opc = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Informe o modelo da nave: ");
            String modelo = scanner.nextLine();

            switch (opc){
                case 1:
                    System.out.println("Informe a capacidade máxima de tripulantes: ");
                    int capacidadeTripulantes =scanner.nextInt();
                    scanner.nextLine();

                    int id = 0;

                    for (Nave n : nave.find()) {
                        if (n.getId() > id) {
                            id = n.getId();
                        }
                    }

                    id += 1;

                    nave.insert(new NaveTripulada(id , modelo, capacidadeTripulantes));
                    break;
                case 2:
                    System.out.println("Informe a capacidade máxima de carga: ");
                    double capacidadeCarga =scanner.nextInt();
                    scanner.nextLine();

                     id = 0;

                    for (Nave n : nave.find()) {
                        if (n.getId() > id) {
                            id = n.getId();
                        }
                    }

                    id += 1;

                    nave.insert(new NaveCargueira(id , modelo, capacidadeCarga));
                    break;
                    default:
                        System.out.println("Opção invalida");
            }
        }while(opc == 1 || opc == 2);
    }
    public void listarNaves(){
        for (Nave n : nave.find()) {
            System.out.println(n.toString());
        }
    }

    public void cadMissaoEspacial(MissaoEspacial m) {
        missao.insert(m);
    }

}
