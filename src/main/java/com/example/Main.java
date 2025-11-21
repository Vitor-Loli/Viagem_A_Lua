package com.example;

import java.util.List;
import java.util.Scanner;

/**
 * Classe principal que gerencia a persistência de pessoas no banco Nitritegit
 */
public class Main {
    private static PersonService personService;

    public static void main(String[] args) {
        try {
            personService = new PersonService();
            System.out.println("=== Sistema de Gerenciamento de Pessoas ===");
            System.out.println("Banco de dados inicializado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao inicializar o sistema: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Listar todas as pessoas");
            System.out.println("3 - Buscar pessoa por ID");
            System.out.println("4 - Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    adicionarPessoa(scanner);
                    break;
                case "2":
                    listarPessoas();
                    break;
                case "3":
                    buscarPessoaPorId(scanner);
                    break;
                case "4":
                    continuar = false;
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
        closeDatabase();
    }

    /**
     * Adiciona uma nova pessoa ao banco de dados
     */
    private static void adicionarPessoa(Scanner scanner) {
        try {
            System.out.println("\n=== Adicionar Nova Pessoa ===");
            
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Idade: ");
            int idade = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Email: ");
            String email = scanner.nextLine();

            Person person = new Person(null, nome, idade, email);
            Person pessoaCriada = personService.create(person);
            
            System.out.println("Pessoa adicionada com sucesso! ID: " + pessoaCriada.getId());
        } catch (NumberFormatException e) {
            System.err.println("Erro: Idade deve ser um número válido!");
        } catch (Exception e) {
            System.err.println("Erro ao adicionar pessoa: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Lista todas as pessoas do banco de dados
     */
    private static void listarPessoas() {
        try {
            System.out.println("\n=== Lista de Pessoas ===");
            List<Person> pessoas = personService.findAll();
            
            if (pessoas.isEmpty()) {
                System.out.println("Nenhuma pessoa cadastrada.");
            } else {
                System.out.println("Total de pessoas: " + pessoas.size());
                for (Person person : pessoas) {
                    System.out.println(person);
                }
            }
        } catch (Exception e) {
            System.err.println("Erro ao listar pessoas: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Busca uma pessoa por ID
     */
    private static void buscarPessoaPorId(Scanner scanner) {
        try {
            System.out.println("\n=== Buscar Pessoa por ID ===");
            System.out.print("Digite o ID: ");
            String id = scanner.nextLine();

            Person person = personService.findById(id);
            
            if (person != null) {
                System.out.println("Pessoa encontrada:");
                System.out.println(person);
            } else {
                System.out.println("Pessoa não encontrada com ID: " + id);
            }
        } catch (Exception e) {
            System.err.println("Erro ao buscar pessoa: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Fecha o banco de dados
     */
    private static void closeDatabase() {
        try {
            if (personService != null) {
                personService.close();
                System.out.println("Banco de dados fechado com sucesso!");
            }
        } catch (Exception e) {
            System.err.println("Erro ao fechar o banco de dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

