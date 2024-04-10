package com.mycompany.transportes;

public class Transportes {

    public static void main(String[] args) {
        VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre ("Volkswagen", "Jetta", 4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha", "Motor");
        VehiculoAereo vehiculoAereo=new VehiculoAereo ("Airbus","Airbus 737", 4);
        VehiculoEspacial vehiculoEspacial=new VehiculoEspacial ("Blue origin","Apolo 11", "Kaplan");

        System.out.println("Informacion del vehiculo terrestre: "); vehiculoTerrestre.mostarInfo();
        System.out.println("Informacion del vehiculo acuatico: "); vehiculoAcuatico.mostarInfo();
        System.out.println("Informacion del vehiculo aereo: "); vehiculoAereo.mostarInfo();
        System.out.println("Informacion del vehiculo espacial: "); vehiculoEspacial.mostarInfo();


    }
}