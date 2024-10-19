package com.ebac.modulo61.components;

import org.springframework.beans.factory.annotation.Autowired;

public class ServicioAnotacion {

    @Autowired
    Model model;

    public void ejecucion() {
        String elemento = model.getElementById(1);
        System.out.println("Elemento retornado(anotación): " + elemento);
    }
}
