package com.mycompany.transportes;

public class VehiculoAcuatico extends Vehiculo {
    private String tipoPropulsion;
    
public VehiculoAcuatico(String marca, String modelo, String tipoPropulsion){
    super(marca,modelo);
    this.tipoPropulsion=tipoPropulsion;
}    

public void mostarInfo(){
    super.mostrarInfo();
    System.out.println("Tipo de propulsion: " + tipoPropulsion);
}
}
