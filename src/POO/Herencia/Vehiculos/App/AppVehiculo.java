package POO.Herencia.Vehiculos.App;

import POO.Herencia.Vehiculos.Dominio.Avion;

public class AppVehiculo {
    public static void main(String[] args) {

        Avion solid = new Avion("109281","Jumbo", 3, 2, "Avianca");

        solid.despegar();

    }

}
