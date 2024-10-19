package com.ebac.modulo61.interfaces;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cuadrado")
public class Cuadrado implements Figura{
    @Override
    public void nombre() {
        System.out.println("Cuadrado");
    }
}
