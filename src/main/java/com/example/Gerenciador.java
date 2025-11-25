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

    public void cadNave(Nave n) {
        nave.insert(n);
    }
    public void cadMissaoEspacial(MissaoEspacial m) {
        missao.insert(m);
    }

}
