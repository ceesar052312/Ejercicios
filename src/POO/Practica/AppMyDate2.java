package POO.Practica;

public class AppMyDate2 {

    public static void main(String[] args) {


        MyDate2 mycumple = new MyDate2(5, 11, 2007);
        System.out.println(mycumple.imprimirfecha());

        System.out.println(mycumple.getDay2() + "/" + mycumple.getMonth2() + "/" + mycumple.getYear2());


    }
}
