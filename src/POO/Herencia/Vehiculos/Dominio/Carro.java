package POO.Herencia.Vehiculos.Dominio;

public class Carro extends Vehiculo {

    private int llantas;
    private String placa;
    private String cambios;

    public Carro(String serial, String marca, int llantas, String placa, String cambios) {
        super(serial, marca);
        this.llantas = llantas;
        this.placa = placa;
        this.cambios = cambios;
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

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }
}
