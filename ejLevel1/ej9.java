package ejLevel1;

import java.util.Scanner;

/*
Dado un String de entrada (frase, texto, etc) calcular la cantidad
 de veces que aparece una letra dada.
*/
public class ej9 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese la frase  a analizar ");
        String entrada = dato.nextLine();
        
        System.out.println("Ingrese la letra a buscar");
        String ingreso = dato.nextLine();
        //se podria mejorar con un try catch
        char  buscado = ingreso.charAt(0);
        int contar = 0;
        
        for (int j=0; j <entrada.length(); j++){
            if (entrada.charAt(j) == buscado){
                contar++;
            }
        }
        System.out.println("El numero de ocurrencias es :  " + contar);
               
        dato.close();
    }
}
