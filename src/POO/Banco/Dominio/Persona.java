package POO.Banco.Dominio;

public class Persona {
    public String nombre;
    public String identificacion;
    public String correo;
    public int edad;

    public Persona(String nombre, String identificacion, String correo, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
        this.edad = edad;
    }
}
