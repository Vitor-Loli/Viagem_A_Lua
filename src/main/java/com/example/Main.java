package com.example;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.NitriteCollection;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 * Classe principal que gerencia a persistência de pessoas no banco Nitritegit
 */
public class Main {
    private static final String DB_PATH = "astronauta.db";
    private static Nitrite db;
    private static ObjectRepository<Astronauta> astronautaRepository;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerenciador gerenciador = new Gerenciador(scanner);
        

        boolean continuar = true;

        System.out.println("=== Sistema de Gerenciamento de Pessoas ===");

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar astronauta");
            System.out.println("2 - Listar todas os astronautas");
            System.out.println("3 - Buscar astronauta por ID");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    gerenciador.cadAstronauta();
                    break;
                case "2":
                    gerenciador.listarAstronautas();
                    break;
                case "3":

                    break;
                case "0":
                    continuar = false;
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }}



