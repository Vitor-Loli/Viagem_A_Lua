package com.example;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;

public class Banco {

    private static Nitrite db;

    // Abre (ou cria) o banco sempre com usuário e senha
    public static Nitrite conectar() {
        if (db == null) {
            db = Nitrite.builder()
                    .filePath("dados.db")
                    .openOrCreate();
        }
        return db;
    }

    // Retorna um repositório (tabela) baseado na classe
    public static <T> ObjectRepository<T> repositorio(Class<T> classe) {
        return conectar().getRepository(classe);
    }
}