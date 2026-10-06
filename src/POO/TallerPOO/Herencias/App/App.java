package POO.TallerPOO.Herencias.App;

import POO.TallerPOO.Herencias.Dominio.Estudiante;
import POO.TallerPOO.Herencias.Dominio.Profesor;

public class App {

    public static void main(String[] args) {

        Estudiante cesar = new Estudiante("Cesar", 18, "Desarrollo de software");
        Profesor profesor = new Profesor("Harby",34,"Desarrollo de software II");

        cesar.presentarse();
        profesor.presentarse();
    }
}
