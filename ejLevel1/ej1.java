package ejLevel1;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese nombre datos");
        String nombre = datos.nextLine();
        System.out.println("HOLA "+ nombre);
        datos.close();
    }    
}
