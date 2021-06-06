package ejLevel1;
//Realizar un Programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas.
// Sin uso de métodos o librerías que realicen toUppercase().

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = dato.nextLine();
        

        System.out.println(frase);
        dato.close();
    }
}
