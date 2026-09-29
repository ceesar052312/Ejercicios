package POO.Herencia.Vehiculos.Dominio;

public class Taxi extends Vehiculo { // Extends es heredar

    private int llantas;
    private String placa;
    private double taximetro;
    private int pasajeros;
    private int puestos;

    public Taxi(String serial, String marca, int llantas, String placa, double taximetro, int pasajeros) {
        super(serial, marca);
        this.llantas = llantas;
        this.placa = placa;
        this.taximetro = taximetro;
        this.pasajeros = pasajeros;
        this.puestos = puestos;
    }


    public void recogerPasajero(){

        if(this.pasajeros > 0){
        }

    }


}
