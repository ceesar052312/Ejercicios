package POO.Practica;

public class MyDate2 {
    private int day2;
    private int month2;
    private int year2;

    public MyDate2(int day2, int month2, int year2) {
        this.day2 = day2;
        this.month2 = month2;
        this.year2 = year2;
    }

    public int getDay2() {
        return day2;
    }

    public int getMonth2() {
        return month2;
    }

    public int getYear2() {
        return year2;
    }

    public String rellenarceros(int value){

        if (value < 10){
            return "0" + value;
        }
        return String.valueOf(value);
    }

    public String imprimirfecha(){
        if (day2 > 31 || day2 <= 0){
            return "Error de dia";
        } else if (month2 > 12 || month2 <= 0){
            return "Error de mes";
        } else if (this.year2 <= 0 ) {
            return "Error de año";
        }
        String day = rellenarceros(this.day2);
        String month = rellenarceros(this.month2);
        return day + "/" + month + "/" + this.year2;
    }

    public void setDay2(int day2) {
        this.day2 = day2;
    }

    public void setMonth2(int month2) {
        this.month2 = month2;
    }

    public void setYear2(int year2) {
        this.year2 = year2;
    }
}
