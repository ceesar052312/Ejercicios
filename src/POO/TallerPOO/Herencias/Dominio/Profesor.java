package POO.TallerPOO.Herencias.Dominio;

public class Profesor extends Persona{
    private String Asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        Asignatura = asignatura;
    }

    @Override
    public void presentarse(){
        System.out.println("Hola mi nombre es " + getNombre() + " y tengo " + getEdad() + " Y doy clases de " + this.Asignatura);
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }
}
