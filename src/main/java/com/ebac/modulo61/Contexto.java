package com.ebac.modulo61;

import com.ebac.modulo61.interfaces.FiguraService;
import com.ebac.modulo61.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Contexto {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.ebac.modulo61");
        context.refresh();

        Service service = context.getBean(Service.class);
        String byId = service.getById(15);
        System.out.println(byId);

        FiguraService figuraService = context.getBean(FiguraService.class);
        figuraService.imprimirNombre1();
        figuraService.imprimirNombre2();
    }
}
