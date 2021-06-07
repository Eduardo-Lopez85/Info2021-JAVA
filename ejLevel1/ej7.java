package ejLevel1;
//Realizar un Programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas.
// Sin uso de métodos o librerías que realicen toUppercase().

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = dato.nextLine();
        String recorrido = "";
        
        for (int i =0; i<frase.length(); i++){
            int valor = frase.charAt(i);
            if ( valor > 96 && valor < 123){
                valor -= 32;
            } recorrido += (char)valor; 
        }
        System.out.println(recorrido);




        //Metodo UpperCase 
        //System.out.println(frase.toUpperCase());
        dato.close();
    }
}
