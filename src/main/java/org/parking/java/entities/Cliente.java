package org.parking.java.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombres;
    public String apellidos;
    public long numeroIdentificacion;
    public List <Vehiculo> misVehiculos =
                new ArrayList<Vehiculo>();
    


    //definir metodo de clase
    //addCar: nombre del metodo va en misnucula si son nombre compuestos si.
    // -vincular un carrito al cliente

   
    public Cliente() {
    }
    


    public Cliente(String nombres,
                    String apellidos,
                    long numeroIdentificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
    }



    public void addVehicle(Vehiculo vehiculo){
        //añadir el carrito a la lista
        //this:para accerder a atributos
        //y metodo al interior del objeto
        this.misVehiculos.add(vehiculo);
    }
    //otra sobrecarga del metodo
    //addvehicle:
    public void addVehicle(String placa,
                            TipoVehiculo tv){
            Vehiculo v = new Vehiculo();
            v.placa = placa;
            v.tipoVehiculo = tv;
            this.misVehiculos.add(v);

                            }

}
