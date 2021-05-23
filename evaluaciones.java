import java.util.Scanner;

public class evaluaciones {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor de la calificacion");
        int nota = scan.nextInt();

        if (nota > 92) {
            System.out.println("El resultado es 'Excelente' "+ nota);
        }else if (nota >84) {
            System.out.println("El resultado es 'Sobresaliente' "+ nota);
        }else if (nota>74){
            System.out.println("El resultado es 'Distinguido' "+ nota);
        }else if (nota > 59){
            System.out.println("El resultado es 'Bueno' "+ nota);
        } else {System.out.println("El resultado es 'Desaprobado' "+ nota);}
        scan.close();
       }
    
}
