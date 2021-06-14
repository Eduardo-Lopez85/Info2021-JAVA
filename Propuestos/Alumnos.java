package Propuestos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Alumnos {
    public static void main(String[] args) {
        try{
            // defino mi archivo entrada
            File entrada = new File("Propuestos/alumnos.txt");
            FileReader lecturaEntrada = new FileReader(entrada);
            BufferedReader lectorBuffer = new BufferedReader(lecturaEntrada);
            String linea;
            // mientras el lectorBuffer tenga contenido, imprimo linea leida 
            while ((linea = lectorBuffer.readLine()) != null){
                System.out.println(linea);
            } lectorBuffer.close();
        } catch (IOException error){
            error.printStackTrace();
        } 

       


        
        /*
        ej 5, calcular edad
        
        private int edad() {
            int diferencia = (int) ChronoUnit.DAYS.between(this.fechaNacimiento, LocalDate.now());
            return diferencia/365;
        }*/

    }
}
