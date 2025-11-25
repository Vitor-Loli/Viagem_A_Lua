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
    private static Nitrite db;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerenciador gerenciador = new Gerenciador(scanner);
        Banco banco = new Banco();

        boolean continuar = true;

        System.out.println("=== Sistema de Gerenciamento de Pessoas ===");

        while (continuar) {
            System.out.println("\n============ MENU ============\n" +
			                   "[1] - Cadastrar novo astronauta\n" +
			                   "[2] - Listar astronautas\n" +
			                   "------------------------------\n" +
			                   "[3] - Cadastrar nova nava\n" +
			                   "[4] - Listar todas as naves\n" +
			                   "------------------------------\n" +
			                   "[5] - Realizar locacao\n" +
			                   "[6] - Devolucao de midia\n" +
			                   "[7] - Listar historico de locacoes\n" +
			                   "------------------------------\n" +
			                   "[8] - Mostrar total arrecadado\n" +
			                   "[0] - Sair\n" +
			                   "==============================");

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
                    gerenciador.cadNave();
                    break;
                case "4":
                    gerenciador.listarNaves();
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
        banco.fecharBanco();
    }
}
