package POO.Herencia.Vehiculos.Dominio;

public class Carro extends Vehiculo {

    private int llantas;
    private String placa;
    private String cambios;
    private double velocidadMaxima;
    private double kilometraje;


    public Carro(String serial, String marca, int llantas, String placa, String cambios, int velocidadMaxima, double kilometraje) {
        super(serial, marca);
        this.llantas = llantas;
        this.placa = placa;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.kilometraje = kilometraje;
    }

    public void pisarAcelerador(int velocidadActual){

        for (int i = 0; i < this.velocidadMaxima; i++){
            velocidadActual = i;
            super.acelerar();
        }
        System.out.println(velocidadActual + "km");
    }

    public void frenoEmergencia() {

        for (int i = 0; i < this.velocidadMaxima; i++){
            super.frenar();
            System.out.println("El vehiculo freno correctamente");
        }
    }

    public void kilometrajeTotal(double distanciaRecorrida) {
        if (distanciaRecorrida > 0){
            this.kilometraje += distanciaRecorrida;
        }
        System.out.println("Su kilometraje total es de " + this.kilometraje);
    }

    public int getLlantas() {
        return llantas;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCambios() {
        return cambios;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }


    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
