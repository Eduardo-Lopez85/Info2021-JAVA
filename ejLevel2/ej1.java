package ejLevel2;
//Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por 
//pantalla el ranking

import java.util.ArrayList;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        Scanner ingreso = new Scanner(System.in); 
        System.out.println("Ingrese el nombre de la ciudad / fin para finalizar ejecucion");
        String condicion = ingreso.nextLine();
        boolean fin = true;
        //carga de ciudades
        while (fin){
            if (condicion.equals("fin")){
                fin = false;}
            else {
                ciudades.add(condicion);
                condicion = ingreso.nextLine();}
        }
        //impresion de lista
        
        System.out.println("Sus ciudades son");
        for (int i=0; i < ciudades.size(); i++){
            System.out.println((i+1) +"  "+ ciudades.get(i));
        }
        ingreso.close();
    }
}
