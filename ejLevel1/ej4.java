package ejLevel1;
//Realizar un programa que calcule el factorial de un número:
//n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
//Sin hacer uso de librerías.

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero a calcular el factorial");
        Scanner datos = new Scanner(System.in);
        int numero = datos.nextInt();
        System.out.println("El factorial es: " + Factorial(numero));
        datos.close();
    }

    private static int Factorial(int numero) {
        if (numero == 0)
        {return 1;}
        else {return numero*Factorial(numero-1);} 
        }
}
