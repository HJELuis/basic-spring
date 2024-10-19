package com.ebac.modulo61.components;

public class ServicioConstructor {
    private final Model model;

    public ServicioConstructor(Model model) {
        this.model = model;
    }

    public void ejecucion() {
        String elemento = model.getElementById(1);
        System.out.println("Elemento retornado(constructor): " + elemento);
    }
}
