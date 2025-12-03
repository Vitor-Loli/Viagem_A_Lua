package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // inicializando scanner e gerenciador
        Scanner scanner = new Scanner(System.in);
        Gerenciador gerenciador = new Gerenciador(scanner);
        // variavel de controle do loop do menu
        boolean continuar = true;

        // ======================================= LOOP DO MENU =======================================
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
			                   "[8] - Listar missões espaciais\n" +
                               "[9] - Finalizar missão espacial\n" +
                               "[10] - Listar resultados de missões\n" +
			                   "------------------------------------\n" +
			                   "[0] - Sair\n" +
			                   "====================================\n");

            // lendo a opcao do usuario
            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            // executando a opcao escolhida
            switch (opcao) {
                case "1":
                    gerenciador.cadAstronauta();
                    break;
                case "2":
                    if(gerenciador.listarAstronautas() == false){
                        System.out.println("Nenhum astronauta cadastrado!");
                    }
                    break;
                case "3":
                    //gerenciador.excluirAstronauta();
                    break;
                case "4":
                    gerenciador.cadNave();
                    break;
                case "5":
                    if(gerenciador.listarNaves() == false){
                        System.out.println("Nenhuma nave cadastrada!");
                    }
                    break;
                case "6":
                    //gerenciador.excluirNave();
                    break;
                case "7":
                    gerenciador.cadMissaoEspacial();
                    break;
                case "8":
                    if(gerenciador.listarMissoes() == false){
                        System.out.println("Nenhuma missão espacial cadastrada!");
                    }
                    break; 
                case "9":
                    gerenciador.finalizarMissao();
                    break;
                case "10":
                    if(gerenciador.listarResultados() == false){
                        System.out.println("Nenhum resultado de missão disponível!");
                    }
                    break;
                case "0":
                    continuar = false;
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        // fechando scanner e banco
        scanner.close();
        Banco.fecharBanco();
    }
}
