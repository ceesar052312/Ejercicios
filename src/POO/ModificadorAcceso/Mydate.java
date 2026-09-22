package POO.ModificadorAcceso;

public class Mydate {
    private int day;
    private int month;
    private int year;

    public Mydate(int day, int month, int year) { // se identifica porq tiene el mismo nombre de la clase
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String rellenarCeros (int value) {

        if (value < 10) {
            return "0" +value;
        }
        return String.valueOf(value);
    }

    public String imprimirFecha() {
        String day = rellenarCeros(this.day);
        String month = rellenarCeros(this.month);

        return day + "/" + month + "/" + this.year;
    }


    public void setDay(int day) {
        this.day = day;

    }

    public void setMonth(int month) {
        this.month = month;

    }

    public void setYear(int year) {
        this.year = year;
    }
}
