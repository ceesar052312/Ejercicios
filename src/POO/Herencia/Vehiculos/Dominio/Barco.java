package POO.Herencia.Vehiculos.Dominio;

public class Barco extends Vehiculo {

    private int velero;
    private String brujula;
    private String radar;

    public Barco(String modelo, String color, int velocidad, int velero, String brujula, String radar) {
        super(modelo, color, velocidad);
        this.velero = velero;
        this.brujula = brujula;
        this.radar = radar;
    }

    public int getVelero() {
        return velero;
    }

    public void setVelero(int velero) {
        this.velero = velero;
    }

    public String getBrujula() {
        return brujula;
    }

    public void setBrujula(String brujula) {
        this.brujula = brujula;
    }

    public String getRadar() {
        return radar;
    }

    public void setRadar(String radar) {
        this.radar = radar;
    }
}
