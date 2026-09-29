package POO.Herencia.Vehiculos.Dominio;

public class Motocicleta extends Vehiculo {

    private int llantas;
    private String placa;
    private int luces;

    public Motocicleta(String serial, String marca, int llantas, String placa, int luces) {
        super(serial, marca);
        this.llantas = llantas;
        this.placa = placa;
        this.luces = luces;
    }

    public int getLlantas() {
        return llantas;
    }

    public String getPlaca() {
        return placa;
    }

    public int getLuces() {
        return luces;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setLuces(int luces) {
        this.luces = luces;
    }
}
