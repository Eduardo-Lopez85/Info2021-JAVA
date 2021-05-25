import java.util.Scanner;

public class ej7funciones {
    
    public static void main(String[] args) {
        System.out.println("Ingrese la operacion a realizar");
        System.out.println("1 = 'Ingresar numeros'");
        System.out.println("2 = 'Clasificar Evaluaciones'");
        System.out.println("3 = 'Conocer el dia de la semana'");
        Scanner scan = new Scanner(System.in);
        int funcion = scan.nextInt();
        if (funcion == 1){
            IngresarNumeros();
        }else if (funcion == 2){
            ClasificarEvaluaciones();
        }else if (funcion == 3){
            DiadeSemana();
        }else{System.out.println("ERROR de ingreso, verifique las opciones disponibles");}

        scan.close();
    }


    private static void DiadeSemana() {
        Scanner scan = new Scanner(System.in);
        int cont = 1;
        while (cont != 0){
        System.out.println("Ingrese el día de la semana 1-7");
        int dia = scan.nextInt();

        if (dia == 1 ){ //caso IF ELSE
            System.out.println("El dia es Lunes");
        }else if (dia == 2){
            System.out.println("El dia es Martes");
        }else if (dia == 3 ){
            System.out.println("El dia es Miercoles");
        }else if (dia == 4){
            System.out.println("El dia es Jueves");
        }else if (dia == 5){
            System.out.println("El dia es Viernes");
        }else if (dia == 6 ){
            System.out.println("El dia es Sabado");
        }else {System.out.println("El dia es Domingo");
        }


        System.out.println("Ingrese el día de la semana 1-7");
        int dia2 = scan.nextInt();
        switch (dia2){ //CASO SWITCH
            case 1: {System.out.println("El dia es Lunes");break;}
            case 2: {System.out.println("El dia es Martes");break;}
            case 3: {System.out.println("El dia es Miercoles");break;}
            case 4: {System.out.println("El dia es Jueves");break;}
            case 5: {System.out.println("El dia es Viernes");break;}
            case 6: {System.out.println("El dia es Sabado");break;}
            case 7: {System.out.println("El dia es Domingo");break;}
            default: {System.out.println("El numero ingresado no es valido");}
        }
        System.out.println("Desea continuar? 0=NO / 1=SI ");
        cont = scan.nextInt();}
        scan.close();
    }


    private static void ClasificarEvaluaciones() {
        int cont = 1;
        Scanner scan = new Scanner(System.in);
        while(cont != 0){
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
        System.out.println("Desea continuar? 0=NO / 1=SI ");
        cont = scan.nextInt();}  
        scan.close();
       }
    
    private static void IngresarNumeros() {
        Scanner nro = new Scanner(System.in);
        int cont = 1;
        while (cont != 0){
        int a = nro.nextInt();
        int b = nro.nextInt();
        int c = nro.nextInt();

        System.out.println("El primer valor es: " + a);
        System.out.println("El segundo valor es: " + b);
        System.out.println("El tercer valor es: " + c);
        System.out.println("Desea continuar? 0=NO / 1=SI ");
        cont = nro.nextInt();} nro.close();

    }
}
