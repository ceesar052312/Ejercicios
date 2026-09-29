package POO.Herencia.Vehiculos.Dominio;

public class Bicicleta extends Vehiculo {

    private int llantas;
    private int pedales;
    private String Manubrio;

    public Bicicleta(String modelo, String color, int velocidad, int llantas, int pedales, String manubrio) {
        super(modelo, color, velocidad);
        this.llantas = llantas;
        this.pedales = pedales;
        Manubrio = manubrio;
    }

    public int getLlantas() {
        return llantas;
    }

    public int getPedales() {
        return pedales;
    }

    public String getManubrio() {
        return Manubrio;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public void setPedales(int pedales) {
        this.pedales = pedales;
    }

    public void setManubrio(String manubrio) {
        Manubrio = manubrio;
    }
}
