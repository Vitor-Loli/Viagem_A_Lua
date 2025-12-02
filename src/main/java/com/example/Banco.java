package com.example;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;

public class Banco {
    // ========== ATRIBUTOS ==========
    private static Nitrite db;

    // ========== CONSTRUTOR ==========
    public Banco(){
        Banco.conectar();
    }

    // ========== MÉTODOS DE BANCO DE DADOS ==========
    public static Nitrite conectar() {
        if (db == null) {
            db = Nitrite.builder()
                    .filePath("dados.db")
                    .openOrCreate();
        }
        return db;
    }

    public static <T> ObjectRepository<T> repositorio(Class<T> classe) {
        return conectar().getRepository(classe);
    }

    public static void fecharBanco() {
        if (db != null && !db.isClosed()) {
            try {
                db.close();
                System.out.println("Banco Nitrite encerrado com sucesso.");
            } catch (Exception e) {
                System.out.println("Falha ao encerrar banco Nitrite: " + e.getMessage());
            }
        }
    }
}