public class Main {

    public int[] numbers;
    public String frase;

    public static int contarPalabtas(String frase){
        String[] palabras = frase.split(" ");
            return palabras.length;
    }


    public static int contarLetras(String frase){
        int letras = frase.replace(" ","").length();
            return letras;
    }


    public static int[] numeroMayorConMenor(int[] numbers) {
        int mayor = numbers[0];
        int menor = numbers[0];
        for (int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] > mayor) {
                mayor = numbers[i];
            }
            if (menor > numbers[i]) {
                menor = numbers[i];
            }
        }
        int[] resultado = {mayor,menor};
        return resultado;
    }
    public static int SegundoNumeroMayor(int[] numbers) {
        int mayor = 0;
        int segundo = 0;
        for (int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] > mayor) {
                mayor = numbers[i];
            }
            else if (mayor > segundo && segundo < numbers[i]) {
                segundo = numbers[i];

            }
        }
        return segundo;
    }

    public static int numeroMenor(int[] numbers) {
        int menor = numbers[0];
        for (int i = 0; i < numbers.length; i++ ) {
            if (menor > numbers[i]) {
                menor = numbers[i];
            }
        }
        return menor;
    }


    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(numeroMayorConMenor(new int[]{1, 89, 25, 12, 45, 8, 9, 1, 2, 3, 5})));

        System.out.println(SegundoNumeroMayor(new int[]{1, 89, 25, 12, 45, 8, 9, 1, 2, 3, 5}));

        System.out.println(numeroMenor(new int[]{1, 89, 25, 12, 45, 8, 9, 1, 2, 3, 5}));

        System.out.println(contarLetras("Pepito juega futbol"));

        System.out.println(contarPalabtas("Pepito juega futbol"));
    }


}





