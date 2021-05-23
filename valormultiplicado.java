import java.util.Scanner;

public class valormultiplicado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor a multiplicar");
        int valor = scan.nextInt();
        for (int i=1; i<=10; i++){ // solucion for
            System.out.println(valor + "x" + i +"="+ valor*i);
        }
        int valor2 = scan.nextInt();
        int i = 1;
        while(i<=10){// solucion while
            System.out.println(valor2 + "x" + i +"="+ valor2*i);
            i++;
        }  

        scan.close();
    }
}
