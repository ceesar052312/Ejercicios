package POO.Herencia.Vehiculos.App;

import POO.Herencia.Vehiculos.Dominio.*;

import java.net.StandardSocketOptions;

public class AppVehiculo {
    public static void main(String[] args) {

        Avion solid = new Avion("109281","Jumbo", 3, 2, "Avianca");
        Taxi  taxi = new Taxi("067214", "Kia",4,"PLK013",0,0,false);
        Carro carro = new Carro("ZZT89","Hyundai",4,"XTV064","Automatico",250, 0);
        Motocicleta moto = new Motocicleta("CVBMNE1","Honda",2, "XLR829",3,false);
        Barco barco = new Barco("2026", "Rojo",200, 2,"BMAX","Sonic");
        Bicicleta bici = new Bicicleta("BMX","Verde",50,2,2,"Curvo");

        //Avion
        solid.despegar();
        solid.aterrizar();
        solid.girar("Derecha");

        //Taxi
        taxi.recogerPasajero();
        taxi.aumentoTaximetro(5);
        System.out.println(taxi.getTaximetro());
        taxi.recogerPasajero();
        taxi.recogerPasajero();
        System.out.println(taxi.getTaximetro());
        taxi.aumentoTaximetro(5);
        taxi.bajarPasajeros();
        System.out.println(taxi.getTaximetro());
        System.out.println(taxi.getPasajeros());

        //Carro
        carro.pisarAcelerador(0);
        System.out.println(carro.getVelocidad());
        carro.frenoEmergencia();
        System.out.println( carro.getKilometraje());
        carro.kilometrajeTotal(5000);
        System.out.println(carro.getKilometraje());
        carro.kilometrajeTotal(2000);

        //Moto
        moto.prender();
        moto.apagar();
        moto.prender();
        moto.levantarMoto();

        //Barco
        barco.desplegarVelas();
        barco.dirigirRumbo("Norte");
        barco.escanear();

        //Bicicleta
        bici.pedalear();
        bici.frenarConPies();
        System.out.println(bici.getVelocidad());
        bici.soltarManubrio();
        bici.frenarConPies();
        bici.frenarConPies();
        bici.frenarConPies();
        bici.frenarConPies();
        bici.frenarConPies();
        System.out.println(bici.getVelocidad());
        bici.soltarManubrio();











    }

}
