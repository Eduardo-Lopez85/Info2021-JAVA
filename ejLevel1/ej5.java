package ejLevel1;
//Se desea una aplicación que solicite 2 números enteros y realice la
// operación de multiplicación por sumas sucesivas (sin uso de librerías).

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        System.out.println("Ingrese los numeros a multiplicar");
        Scanner datos = new Scanner(System.in);
        int numero1 = datos.nextInt();
        int numero2 = datos.nextInt();
        int suma = 0;
        for (int i = 0; i<numero2; i++){
            suma += numero1 ;
        }

        System.out.println("Los numeros son: " + numero1 + " y "+ numero2);
        System.out.println("El resultado es:  " + suma);
        datos.close();
    }
}

