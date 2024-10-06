
package programas;

/**
 *
 * @author bmedina
 */
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        //Declarar variable
        double sueldo, totalSueldo, promedioSueldo;
        int numSueldo;
        //Declarar objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entada de datos
        System.out.print("Ingresar cantidad de sueldos: ");
        numSueldo = lectura.nextInt();
        
        //Inicializar variables
        totalSueldo = 0;
        
        //Proceso de datos
        for (int i = 1; i <= numSueldo; i++) {
            System.out.print("Ingrese el sueldo " + i + ": ");
            sueldo = lectura.nextDouble();
            
            // Acumular el total de los sueldos
            totalSueldo += sueldo; 
        }
        
        // Calcular el promedio
        promedioSueldo = totalSueldo / numSueldo;
        
        // Salida de datos
        System.out.println("El total de los sueldos es: " + totalSueldo);
        System.out.println("El promedio de los sueldos es: " + promedioSueldo);
    }
}
