package ejLevel2;
/*Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa 
(solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en 
orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
Ayuda: ArrayList implementa la interface Collection, existe algún método que me permita hacer la 
operación sort (mezclar) aleatoriamente? Idem para el reverso
*/

import java.util.ArrayList;
import java.util.Collections;

public class ej3 {
    public static void main(String[] args) {
        ArrayList<Integer> baraja = new ArrayList<>();
        //cargo baraja
        for (int i = 0; i < 13; i++){
            baraja.add(i+1);
        } 
        MostrarBaraja(baraja);
        ImprimirInverso(baraja);
        DesordenarBaraja(baraja);
    }

    private static void MostrarBaraja(ArrayList<Integer> baraja) {
        for (int carta : baraja ){
            System.out.print(carta+" ");
        }
    }

    private static void DesordenarBaraja(ArrayList<Integer> baraja) {
        Collections.reverse(baraja);
        System.out.println("");
        MostrarBaraja(baraja);
    }

    private static void ImprimirInverso(ArrayList<Integer> baraja) {
        Collections.shuffle(baraja);
        System.out.println("");
        MostrarBaraja(baraja);

    }   
}
