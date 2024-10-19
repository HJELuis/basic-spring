package com.ebac.modulo61.components;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Contexto {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ServicioSetter servicioSetter = (ServicioSetter) context.getBean("servicioSetter");

        ServicioConstructor servicioConstructor = (ServicioConstructor) context.getBean("servicioConstructor");

        ServicioAnotacion servicioAnotacion = (ServicioAnotacion) context.getBean("servicioAnotacion");

        servicioSetter.ejecucion();
        servicioConstructor.ejecucion();
        servicioAnotacion.ejecucion();
    }

}
