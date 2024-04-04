import java.util.Scanner;

public class Palindromo {

    public static boolean verificadorPalindromo(String cadena) {
        String resultado = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }

        return cadena.equals(resultado);
    }

    public static void main(String[] args){

        System.out.println(verificadorPalindromo("anita lava la tina"));

    }

}
