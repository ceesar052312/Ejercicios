package POO.Herencia.Vehiculos.Dominio;

public class Avion extends Vehiculo {

    private int llantas;
    private int alas;
    private String aerolinia;
    private boolean estaVolando;

    public Avion(String serial, String marca, int llantas, int alas, String aerolinia) {
        super(serial, marca);
        this.llantas = llantas;
        this.alas = alas;
        this.aerolinia = aerolinia;
        this.estaVolando = false;
    }

    public void despegar(){

        for (int i = 0; i < 200; i++){
            super.acelerar();
        }

        System.out.println("El avion esta despegando a una velocidad de " + super.getVelocidad() + " km/H");

        estaVolando = true;
    }


    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public String getAerolinia() {
        return aerolinia;
    }

    public void setAerolinia(String aerolinia) {
        this.aerolinia = aerolinia;
    }

    public boolean isEstaVolando() {
        return estaVolando;
    }

    public void setEstaVolando(boolean estaVolando) {
        this.estaVolando = estaVolando;
    }
}
