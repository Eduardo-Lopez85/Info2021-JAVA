package ejLevel2;
/*Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos 
(3 arrayList) e imprimir dichos cursos.
Ayuda: ArrayList posee un método para particionar en sub-listas?
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();
        
        System.out.println("Ingrese el nombre de los alumnos");
        Scanner ingreso = new Scanner(System.in);
        String dato = "  ";
        //cargo alumnos
        for (int i = 0; i < 12; i++){
            dato = ingreso.nextLine();
            alumnos.add(dato);
            } 
        MostrarAlumnos(alumnos);

        List<String> fisica = alumnos.subList(0, 4);
        List<String> programacion = alumnos.subList(4, 8);
        List<String> calculo = alumnos.subList(8, alumnos.size());
        
        System.out.println("Los Alumnos del curso de fisica son:");
        MostrarAlumnos2(fisica);
        System.out.println();
        System.out.println("Los Alumnos del curso de programacion son:");
        MostrarAlumnos2(programacion);
        System.out.println();
        System.out.println("Los Alumnos del curso de calculo son:");
        MostrarAlumnos2(calculo);

        ingreso.close();
    }

    private static void MostrarAlumnos2(List<String> fisica) {
        for (String i : fisica ){
            System.out.println(i);
        }
    }

    private static void MostrarAlumnos(ArrayList<String> alumnos) {
        for (String i : alumnos ){
            System.out.print(i +" ");
        }
        System.out.println();
    }
}
