package Propuestos;

import java.util.Scanner;

public class sumayfacto{
public static void main(String[] args) {
    Scanner dato = new Scanner(System.in);
    System.out.println("Ingrese dos numeros a sumar");
    int num, num1 , num2 = 0;
    num1 = dato.nextInt();
    num2 = dato.nextInt();
    System.out.println("El resultado de la suma es:  "+ Suma(num1,num2));
    System.out.println("");
    System.out.println("Ingrese el numero a calcular el factorial"); 
    num = dato.nextInt();
    System.out.println("El resultado de la suma es:  "+ Factorial(num));

    dato.close(); 
}

private static int Factorial(int numero) {
    if (numero == 0)
    {return 1;}
    else {return numero*Factorial(numero-1);} 
    }

private static int Suma(int num1, int num2) {
    return (num1 + num2);
}

}