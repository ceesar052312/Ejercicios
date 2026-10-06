package POO.Herencia.Vehiculos.Dominio;

public class Taxi extends Vehiculo { // Extends es heredar

    private int llantas;
    private String placa;
    private double taximetro;
    private int pasajeros;
    private int puestos;
    private boolean llegoDestino;

    public Taxi(String serial, String marca, int llantas, String placa, double taximetro, int pasajeros, boolean llegoDestino) {
        super(serial, marca);
        this.llantas = llantas;
        this.placa = placa;
        this.taximetro = taximetro;
        this.pasajeros = pasajeros;
        this.puestos = puestos;
        this.llegoDestino = false;
    }


    public void recogerPasajero(){

        if(this.pasajeros >= 4){
            System.out.println("El taxi esta lleno");
        }
        else{
            System.out.println("Suba por favor");
            this.pasajeros ++;
            this.taximetro = 4000;
        }
    }

    public void bajarPasajeros(){
        if (this.pasajeros > 0) {
            llegoDestino = true;
            System.out.println("Llegamos a su destino");
            this.pasajeros --;
            this.taximetro = 0;
        }else{
            System.out.println("No hay pasajeros en el taxi");
        }
    }
    public void aumentoTaximetro(int tramosRecorridos){
        double valorTramo = 500;
        double costoMovimiento = tramosRecorridos * valorTramo;
        this.taximetro += costoMovimiento;
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

    public double getTaximetro() {
        return taximetro;
    }

    public void setTaximetro(double taximetro) {
        this.taximetro = taximetro;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public boolean isLlegoDestino() {
        return llegoDestino;
    }

    public void setLlegoDestino(boolean llegoDestino) {
        this.llegoDestino = llegoDestino;
    }
}
