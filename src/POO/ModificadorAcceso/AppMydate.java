package POO.ModificadorAcceso;

public class AppMydate {

    public static void main(String[] args) {

        Mydate myBirthday = new Mydate(5, 11,2007);

        System.out.println(myBirthday.getDay() + "/" +  myBirthday.getMonth() + "/" + myBirthday.getYear());

        System.out.println(myBirthday.imprimirFecha());
    }


}
