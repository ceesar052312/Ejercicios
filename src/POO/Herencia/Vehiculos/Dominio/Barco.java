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

    public void desplegarVelas() {
        if (velero <= 1){
            this.velero++;
            super.acelerar();
        }
        System.out.println("Velas desplegadas");
    }

    public void dirigirRumbo(String rumbo){
        if (!this.brujula.isEmpty()){
            System.out.println("nuevo rumbo hacia " + rumbo);
        }
        else {
            System.out.println("No hay brujula");
        }
    }

    public void escanear(){
        if (!this.radar.isEmpty()){
            System.out.println("No se detectan amenazas");
        }
        else {
            System.out.println("No hay escaner");
        }
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
