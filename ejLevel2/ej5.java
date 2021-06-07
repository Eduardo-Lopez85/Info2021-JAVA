package ejLevel2;
/*Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen 
de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y
 luego imprimir el total final a cobrar.
Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]

## Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie.

Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        ArrayList<Integer> horastrabajadas = new ArrayList<>();
        ArrayList<Integer> valorxhora = new ArrayList<>();
        ArrayList<Integer> pagoxdia = new ArrayList<>();
        Scanner dato = new Scanner(System.in);
        int acumulador = 0;
        //CARGA DE DATOS
        System.out.println("Ingrese las horas trabajadas de la semana");
        for (int i=0; i<5; i++){
            horastrabajadas.add(dato.nextInt());
        } System.out.println();
        System.out.println("Ingrese los valores por dia de trabajo");
        for (int i=0; i<5; i++){
            valorxhora.add(dato.nextInt());
        } System.out.println();
        //Procesamiento
        for (int i=0; i<5; i++){
            pagoxdia.add(i,(horastrabajadas.get(i) * valorxhora.get(i)));
        } System.out.println("Los valores parciales son :");
        for(int i : pagoxdia){
            System.out.print(i+"  ");
            acumulador += i;
        } System.out.println();
        System.out.println("El importe a cobrar por la semana calculada es: "+ acumulador);

        dato.close();
    }
}
