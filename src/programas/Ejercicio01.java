package programas;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Declarar variables
        double peso, altura, imc;
        int cantPersonas, bajoPeso, pesoNormal, sobrepeso, obesidad;

        // Declarar objeto
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresar cantidad de personas: ");
        cantPersonas = lectura.nextInt();

        // Inicializar contadores
        bajoPeso = 0;
        pesoNormal = 0;
        sobrepeso = 0;
        obesidad = 0;

        // Proceso de datos
        for (int i = 1; i <= cantPersonas; i++) {
            System.out.print("Ingrese el peso de la persona " + i + " (kg): ");
            peso = lectura.nextDouble();
            System.out.print("Ingrese la altura de la persona " + i + " (m): ");
            altura = lectura.nextDouble();

            // Calcular IMC
            imc = peso / (altura * altura);

            // Clasificar según IMC
            if (imc < 18.5) {
                bajoPeso++;
            } else if (imc >= 18.5 && imc < 24.9) {
                pesoNormal++;
            } else if (imc >= 25 && imc < 29.9) {
                sobrepeso++;
            } else {
                obesidad++;
            }
        }

        // Salida de datos
        System.out.println("Personas con bajo peso: " + bajoPeso);
        System.out.println("Personas con peso normal: " + pesoNormal);
        System.out.println("Personas con sobrepeso: " + sobrepeso);
        System.out.println("Personas con obesidad: " + obesidad);
    }
}
