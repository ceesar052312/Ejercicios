package POO.Herencia.Vehiculos.Dominio;

public class Bicicleta extends Vehiculo {

    private int llantas;
    private int pedales;
    private String manubrio;

    public Bicicleta(String modelo, String color, int velocidad, int llantas, int pedales, String manubrio) {
        super(modelo, color, velocidad);
        this.llantas = llantas;
        this.pedales = pedales;
        this.manubrio = manubrio;
    }

    public void pedalear() {
        if (this.pedales >= 2){
            for (int i = 0; i < 10; i++){
                super.acelerar();
            }
            System.out.println("Pedaleando con mas fuerza");
        }
        else {
            System.out.println("No se pudo pedalear");
        }
    }

    public void soltarManubrio() {
        if (this.getVelocidad() > 0){
            System.out.println("Manejando sin manos");
        }
        else {
            System.out.println("No se puede mantener el equilibrio");
        }
    }

    public void frenarConPies(){
            for (int i = 0; i < 10; i++){
                if (this.getVelocidad() > 0){
                    super.frenar();
                }
                else {
                    break;
                }
        }
        System.out.println("Frenando con los zapatos");
    }


    public int getLlantas() {
        return llantas;
    }

    public int getPedales() {
        return pedales;
    }

    public String getManubrio() {
        return manubrio;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public void setPedales(int pedales) {
        this.pedales = pedales;
    }

    public void setManubrio(String manubrio) {
        this.manubrio = manubrio;
    }
}
