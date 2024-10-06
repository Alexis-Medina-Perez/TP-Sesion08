package programas;

import java.util.Scanner;

public class Programa03 {
    public static void main(String[] args) {
        // Declarar variable
        double talla, tallaMayorNum;
        int cantPersonas, cantPersM, cantPersF;
        String nombre, sexo, PersonaTM;

        // Declarar objeto
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresar cantidad de personas: ");
        cantPersonas = lectura.nextInt();

        // Inicializar variables
        cantPersM = 0;
        cantPersF = 0;
        tallaMayorNum = 0;
        PersonaTM = "";

        // Proceso de datos
        for (int i = 1; i <= cantPersonas; i++) {
            System.out.print("Ingrese el nombre de la persona " + i + ": ");
            nombre = lectura.next();
            System.out.print("Ingrese el sexo de la persona " + i + " (M/F): ");
            sexo = lectura.next();
            System.out.print("Ingrese la talla de la persona " + i + ": ");
            talla = lectura.nextDouble();

            if (sexo.equals("M")) {
                cantPersM++;
            } else if (sexo.equals("F")) {
                cantPersF++;
            }

            if (talla > tallaMayorNum) {
                tallaMayorNum = talla;
                PersonaTM = nombre;
            }
        }

        // Salida de datos
        System.out.println("La cantidad de personas de sexo masculino son: " + cantPersM);
        System.out.println("La cantidad de personas de sexo femenino son: " + cantPersF);
        System.out.println("La persona con talla mayor es: " + PersonaTM);
        System.out.println("La talla mayor es: " + tallaMayorNum);
        
    }
}
