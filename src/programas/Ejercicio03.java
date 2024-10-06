package programas;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Declarar variables
        int n, sumaPares;

        // Crear objeto Scanner
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese un número: ");
        n = lectura.nextInt();

        //Inicializar variables
        sumaPares= 0;
        
        // Proceso de datos
        for (int i = 1; i <= n; i++) {
            // Verificar si el número es par
            if (i % 2 == 0) {
                sumaPares += i; // Sumar el número par
            }
        }

        // Salida de datos
        System.out.println("Resultados:");
        System.out.println("La suma de los números pares hasta " + n + " es: " + sumaPares);
    }
}
