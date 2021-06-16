package Propuestos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Propuesto5{

public static void main(String[] args) {
    //CARGAR EMPLEADOS
    System.out.println("");
    List<Empleado> nominaEmp = cargarEmpleados();
    for (Empleado emp : nominaEmp) {
        System.out.println(emp.toString());        
    }

    System.out.println("");
    System.out.println("Empleados con una letra dada del apellido");
    for (Empleado emp : primerLetraApellido(nominaEmp, "G")){
        System.out.println(emp);
    }

    System.out.println("");
    System.out.println("Empleado mas y menos jovial");



    System.out.println("");
    System.out.println("Empleado mejor y peor pagado");
    
    }



public static List<Empleado> cargarEmpleados() {
    String[] empleado;
    List<Empleado> listaEmp = new ArrayList<>();
       
    try {
        File entrada = new File("Propuestos/empleados.txt");
        FileReader lecturaEntrada = new FileReader(entrada);
        BufferedReader lectorBuffer = new BufferedReader(lecturaEntrada);
        String dato;
        while ( (dato = lectorBuffer.readLine()) != null ) {
            empleado = dato.split(",");
            listaEmp.add(new Empleado(empleado[0], empleado[1], empleado[2], empleado[3]));
        } lectorBuffer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }    
    return listaEmp;
}
//metodo 1ra letra del apellido
public static List<Empleado> primerLetraApellido(List<Empleado> lista, String letra) {
    List<Empleado> listaFiltrada = new ArrayList<>();
    for (Empleado e : lista){
        if(letra.equalsIgnoreCase(String.valueOf(e.getApellido().charAt(0))))
        listaFiltrada.add(e);
    } return listaFiltrada;
}


}