package ejLevel1;

import java.util.Scanner;

public class ej2 {
   public static void main(String[] args) {
       Scanner dato = new Scanner(System.in);
       System.out.println("Ingrese 2 numeros");
       int num1 = dato.nextInt();
       int num2 = dato.nextInt();
                
       System.out.println("Los numeros ingresados son: "+ num1 + "  " + num2 ); 
       System.out.println("Operaciones");
       System.out.println("Suma = " + (num1+num2));
       System.out.println("Resta = " + (num1-num2));
       System.out.println("Multiplicaion = " + (num1*num2));
       System.out.println("Division  = " + (num1/num2));
       System.out.println("Modulo  = " + (num1%num2));
       dato.close();
   } 
}
