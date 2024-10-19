package com.ebac.modulo61.components;

public class ServicioSetter {

   private Model model;

   public void ejecucion() {
       String elemento = model.getElementById(1);
       System.out.println("Elemento retornado(setter): " + elemento);
   }

   public void setModel(Model model){
       this.model = model;
   }

}
