package POO.TallerPOO.Herencias.Dominio;

public abstract class Persona {
    private String Nombre;
    private int Edad;

    public Persona(String nombre, int edad) {
        this.Nombre = nombre;
        setEdad(edad);
    }

    public abstract void presentarse();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0){
            this.Edad = edad;
        }
        else {
            System.out.println("La Edad no puede ser negativa, se pondra 0 por defecto");
        }
    }

}
