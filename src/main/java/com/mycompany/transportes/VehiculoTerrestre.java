package com.mycompany.transportes;

public class VehiculoTerrestre extends Vehiculo{
    private int numRuedas; 

public VehiculoTerrestre(String marca, String modelo, int numRuedas){
    super(marca,modelo);
    this.numRuedas=numRuedas;
}    

public void mostarInfo(){
    super.mostrarInfo();
    System.out.println("Numero de Ruedas: " + numRuedas);
}
}
