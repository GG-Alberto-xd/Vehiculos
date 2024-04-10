package com.mycompany.transportes;

public class VehiculoEspacial extends Vehiculo{
    private String Turbina;
    
    public VehiculoEspacial(String marca, String modelo, String Turbina){
    super(marca,modelo);
    this.Turbina=Turbina;
}    

public void mostarInfo(){
    super.mostrarInfo();
    System.out.println("Modelo de Turbinna: " + Turbina);
}
}

