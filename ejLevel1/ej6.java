package ejLevel1;

import java.util.Scanner;

//Se desea una aplicación que solicite 
//2 números enteros y realice la operación de potencia (sin uso de librerías).
public class ej6 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese los valores a potenciar, base , potencia");
        int base = dato.nextInt();
        int potencia = dato.nextInt();
        int resultado = 1;
        for (int i=0; i<potencia; i++){
            resultado = resultado * base;
        }
        System.out.println("El resultado es :  "+ resultado);  
        dato.close();
    }
}
