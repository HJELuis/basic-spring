package com.ebac.modulo61.service;

import org.springframework.beans.factory.annotation.Value;

public class DataBase {

    @Value("${db.dev.url}")
    String dbUrl;

    @Value("root")
    String user;

    @Value("${VARIABLE_AMBIENTE}")
    String variableDeAmbiente;

    public String getById(int id) {
        System.out.println("Url a base de datos: " + dbUrl);
        System.out.println("Usuario por defecto: " + user);
        System.out.println("Valor de variable de ambiente: " + variableDeAmbiente);
        return "Elemento con id " + id + " encontrado";
    }
}
