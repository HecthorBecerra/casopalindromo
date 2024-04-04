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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra: ");
        String respuesta = scanner.nextLine();
        boolean esPalindromo = verificadorPalindromo(respuesta);
        System.out.println("La cadena " + respuesta + " ¿Es un palindromo?: " + esPalindromo);

    }

}
