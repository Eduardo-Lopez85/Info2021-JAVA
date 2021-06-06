package ejLevel1;

import java.util.Scanner;

/*Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/
public class ej8 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        //Solicitud de datos entrada
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Nombre y Apellido");
        String apynom = dato.nextLine();
        System.out.println("Edad");
        String edad = dato.nextLine();
        System.out.println("Direccion ");
        String direccion = dato.nextLine();
        System.out.println("Ciudad");
        String ciudad = dato.nextLine();
        
        Persona humano = new Persona(apynom, edad, direccion, ciudad);
        System.out.println("{ "+ humano.ciudad +" } - { "+ humano.direccion +" } - { "+ humano.edad +" } - { "+ humano.apynom +" }");
        
        dato.close();
    }

    
}
class Persona{
    String apynom;
    String edad;
    String direccion;
    String ciudad;

    public Persona(String apynom, String edad, String direccion, String ciudad){
        this.apynom= apynom;
        this.edad= edad;
        this.direccion= direccion;
        this.ciudad = ciudad;
    } 

}
