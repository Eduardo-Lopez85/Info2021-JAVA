package ejLevel2;
/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un 
array de Strings. Con la secuencia de números enteros de principio a final. Pero si el número es 
multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de
 ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué 
valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
Input (Entrada):
fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)

Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, 5]
[“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]
*/


import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String[] calculo;  

        System.out.println("Ingrese 2 numeros ");
        System.out.println("El primer numero debe ser menor al segundo");
        int num1 = dato.nextInt();
        int num2 = dato.nextInt();

        if (num1 < num2){
            calculo = funcionFizzBuzz(num1,num2);  
            for(String st : calculo){
                System.out.print(st + "  -  ");
            }  
        } else {
            System.out.println("ERROR en el ingreso de los datos");}
        dato.close();
    }

    
    private static String[] funcionFizzBuzz(int num1, int num2) {
        String[] procesamiento = new String[num2 - 1];
        procesamiento[0] = String.valueOf(num1);
        for (int i = 1 ; i < procesamiento.length; i++){
            if ( (((num1 + i) % 2) == 0) && ( (num1 + i) % 3 == 0) ) {
                procesamiento[i] = "FizzBuzz";
            } else if ( ((num1 + i) % 2) == 0 ) {
                procesamiento[i] = "Fizz";
            } else if (((num1 + i) %3) == 0 ){
                procesamiento[i] = "Buzz";
            } else { procesamiento[i] = String.valueOf(num1 + i);  }
        }
        return procesamiento;
    }
}
