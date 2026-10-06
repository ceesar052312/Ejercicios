package POO.Herencia.Vehiculos.Dominio;

public class Motocicleta extends Vehiculo {

    private int llantas;
    private String placa;
    private int luces;
    private boolean estaEncendido;

    public Motocicleta(String serial, String marca, int llantas, String placa, int luces, boolean estaEncendido) {
        super(serial, marca);
        this.llantas = llantas;
        this.placa = placa;
        this.luces = luces;
        this.estaEncendido = estaEncendido;
    }

    public void prender() {
        if (!this.estaEncendido){
            this.estaEncendido = true;
            System.out.println("El vehiculo prendio");
        }
        else {
            System.out.println("El vehiculo ya esta encendido");
        }
    }
    public void apagar() {
        if (this.estaEncendido){
            this.estaEncendido = false;
            System.out.println("El vehiculo se apago");
        }
        else {
            System.out.println("El vehiculo ya esta apagado");
        }
    }
    public void levantarMoto(){
        if (this.estaEncendido && llantas >= 2){
            this.llantas = 1;
            System.out.println("La moto se levanto");
        }
        else {
            System.out.println("No se puede levantar la moto");
        }
        this.llantas = 2;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getLuces() {
        return luces;
    }

    public void setLuces(int luces) {
        this.luces = luces;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }
}
