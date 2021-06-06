package ejLevel1;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int datos = scan.nextInt();

        for (int i = 1; i<=datos; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(j+"   ");   
            }
        System.out.println("");    
        }
        scan.close();
    }
}
