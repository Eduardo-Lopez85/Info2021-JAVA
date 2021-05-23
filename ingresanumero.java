import java.util.Scanner;

public class ingresanumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("El primer valor es: " + a);
        System.out.println("El segundo valor es: " + b);
        System.out.println("El tercer valor es: " + c);
        scan.close();
    }     
}
