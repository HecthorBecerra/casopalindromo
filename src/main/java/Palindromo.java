import java.util.Scanner;

public class Palindromo {

    public static boolean verificadorPalindromo(String cadena){
        cadena = cadena.replaceAll("\\s+","").toLowerCase();
        String cadenaInvertida = "";

        for (int i = cadena.length() - 1 ; i >= 0 ; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        return cadena.equals(cadenaInvertida);
    }
    public static void main(String[] args){

        System.out.println(verificadorPalindromo("anita lava la tina"));
        System.out.println(verificadorPalindromo("Anita Lava La Tina"));

    }

}
