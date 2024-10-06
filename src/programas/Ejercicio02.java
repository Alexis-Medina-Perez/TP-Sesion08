package programas;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Declarar variables
        String texto;
        int contadorVocales, contadorConsonantes;

        // Crear objeto
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese una frase: ");
        texto = lectura.nextLine();

        // Convertir el texto a minúsculas para facilitar la comparación
        texto = texto.toLowerCase();

        //Inicializar variables
        contadorVocales = 0;
        contadorConsonantes = 0;
        
        // Proceso de datos
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            // Verificar si el caracter es una letra
            if (Character.isLetter(caracter)) {
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    contadorVocales++;
                } else {
                    contadorConsonantes++;
                }
            }
        }

        // Salida de datos
        System.out.println("Total de vocales: " + contadorVocales);
        System.out.println("Total de consonantes: " + contadorConsonantes);
    }
}
