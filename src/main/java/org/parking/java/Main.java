package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;

public class Main {
    public static void main(String[] args) {
    //Sistema de gestion de E/S
    //de vehiculos en un parking
    //1. dos carritos:
    //Objetos(instancias)
    //1. Tipo de clase
    //2. NOmbre del objeto
    //3. asignacion y new
    //4. constructor del objeto
    Vehiculo carrito1 = new Vehiculo("ASD 789",
                        TipoVehiculo.PARTICULAR );


    Vehiculo carrito2 = new Vehiculo("SDF 34S", TipoVehiculo.MOTO);

    //crear(instaciar) un cliente
    Cliente cliente1 = new Cliente("Laura",
                            "Albarracin",
                            1014198965L);
    //invocar el metodo addCar
    cliente1.addVehicle(carrito1);
    cliente1.addVehicle(carrito2);
    cliente1.addVehicle("WWW ERT",
            TipoVehiculo.MOTO);
    //recorrer lista de vehiculos del cliente
    for(Vehiculo v :cliente1.misVehiculos){
        System.out.println(v.placa);
        System.out.println(v.tipoVehiculo);
        System.out.println("---------");
    }





    }
}