package ejLevel1;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int datos = scan.nextInt();
        for (int i=1; i<=datos; i++){
            System.out.println(i);
        }
        scan.close();
    }
}
