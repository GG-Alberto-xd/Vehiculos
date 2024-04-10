package com.mycompany.transportes;

public class VehiculoAereo extends Vehiculo {
    private int numAlas;
    
public VehiculoAereo (String marca, String modelo, int numAlas){
    super(marca,modelo);
    this.numAlas=numAlas;
}

public void mostarInfo(){
    super.mostrarInfo();
    System.out.println("Numero de Alas: " + numAlas);
}
}

