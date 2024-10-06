
package programas;

import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        //Declarar variable
        double venta, totalVentas, promedioVentas, ventaMayor;
        int mesVentaMayorNum;
        String mesVentaMayor;
        
        //Declarar objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entada de datos
        //System.out.print("Ingresar cantidad de sueldos: ");
        //numSueldo = lectura.nextInt();
        
        //Inicializar variables
        totalVentas = 0;
        ventaMayor = 0;
        mesVentaMayorNum = 0;
        mesVentaMayor = "";
        
        //Proceso de datos
        for (int i = 1; i <= 6; i++) {
            System.out.print("Ingrese la venta de 0" + i + ": ");
            venta = lectura.nextDouble();
            
            // Acumular el total de los sueldos
            totalVentas += venta;
            
            if (venta > ventaMayor) {
                ventaMayor = venta;
                mesVentaMayorNum = i;
            }
            
        }
        
        //Obtener mes
        switch (mesVentaMayorNum) {
            case 1:
                mesVentaMayor = "Enero";
                break;
            case 2:
                mesVentaMayor = "Febrero";
                break;
            case 3:
                mesVentaMayor = "Marzo";
                break;
            case 4:
                mesVentaMayor = "Abril";
                break;
            case 5:
                mesVentaMayor = "Mayo";
                break;
            case 6:
                mesVentaMayor = "Junio";
                break;
            default:
                 break;
        }
        
        // Calcular el promedio
        promedioVentas = totalVentas / 6;
        
        // Salida de datos
        System.out.println("El total de las ventas es: " + totalVentas);
        System.out.println("El promedio de las ventas es: " + promedioVentas);
        System.out.println("El mes con la venta mayor es: " + mesVentaMayor);
        System.out.println("La venta mayor es: " + ventaMayor);
    }
}
