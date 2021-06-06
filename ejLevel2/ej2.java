package ejLevel2;
//Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio 
//de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el 
//tamaño de la misma (antes y después de agregar a en la primera y última posición).

import java.util.ArrayList;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros "); 
        int dato = 0;

        for (int i=0; i < 5; i++){
            dato = ingreso.nextInt();
            numeros.add(dato);            
        }
        //lista luego de carga inicial
        System.out.println("Elementos de la lista: " + numeros.size());
        for (int i=0; i<numeros.size(); i++){
            System.out.print(numeros.get(i)+" ");
        } System.out.println();
        //agrego nuevos elementos
        System.out.println("Ingrese el valor a agregar al principio de la lista");
        numeros.add(0,ingreso.nextInt());
        System.out.println("Ingrese el valor a agregar al final de la lista");
        numeros.add(ingreso.nextInt());
        //verifico estado lista
        System.out.println("Elementos de la lista: " + numeros.size());
        for (int i : numeros) {
            System.out.print(i+" ");
        }
        ingreso.close();
    }
    




}
