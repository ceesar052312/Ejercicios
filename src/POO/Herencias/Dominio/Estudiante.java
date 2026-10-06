package POO.Herencias.Dominio;

public class Estudiante extends Persona{
    private String programa;


    public Estudiante(String nombre, int edad, String programa) {
        super(nombre, edad);
        this.programa = programa;
    }

    @Override
    public void presentarse(){
        System.out.println("Hola mi nombre es " + getNombre() + " y tengo " + getEdad() + " Y estudio " + this.programa);
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
