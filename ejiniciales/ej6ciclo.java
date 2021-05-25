package ejiniciales;

import java.util.Scanner;

public class ej6ciclo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        while (continuar){
            System.out.println("INGRESE UN VALOR");
            int valor = scan.nextInt();
            System.out.println("El numero ingresado es: "+ valor);
            System.out.println("Desea continuar? '1=SI' / '0=NO'");
            int salida = scan.nextInt();
            if (salida == 0){
                continuar = false;
            } 

        }scan.close();
    }
}
