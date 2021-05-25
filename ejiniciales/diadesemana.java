package ejiniciales;

import java.util.Scanner;

public class diadesemana {
    public static void main(String[] args) {
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
}
