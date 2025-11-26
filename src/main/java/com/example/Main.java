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
            System.out.println("\n\n=============== MENU ===============\n" +
			                   "[1] - Cadastrar novo astronauta\n" +
			                   "[2] - Listar astronautas\n" +
                               "[3] - Excluir astronauta\n" +
			                   "------------------------------------\n" +
			                   "[4] - Cadastrar nova nave\n" +
			                   "[5] - Listar todas as naves\n" +
                               "[6] - Excluir nave\n" +
			                   "------------------------------------\n" +
			                   "[7] - Iniciar nova missão espacial\n" +
			                   "[8] - Finalizar missão espacial\n" +
			                   "[9] - Historico de missões espaciais\n" +
			                   "------------------------------------\n" +
			                   "[0] - Sair\n" +
			                   "====================================\n");

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
                    //gerenciador.excluirAstronauta();
                    break;
                case "4":
                    gerenciador.cadNave();
                    break;
                case "5":
                    gerenciador.listarNaves();
                    break;
                case "6":
                    //gerenciador.excluirNave();
                    break;
                case "7":
                    //gerenciador.iniciarMissao();
                    break;
                case "8":
                    //gerenciador.finalizarMissao();
                    break; 
                case "9":
                    //gerenciador.historicoMissoes();
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
