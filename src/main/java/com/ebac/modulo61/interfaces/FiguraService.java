package com.ebac.modulo61.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FiguraService {
    @Autowired
    Figura cuadrado;

    @Autowired
    Figura triangulo;

    public void imprimirNombre1(){
        cuadrado.nombre();
    }

    public void imprimirNombre2(){
        triangulo.nombre();
    }
}
