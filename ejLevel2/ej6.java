package ejLevel2;
/*Se dispone de una lista de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo 
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map 
(o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 

*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;




class Empleado {
    String ApyNom;
    int dni;
    double horastrabajadas;
    int valorxhora; 

    public Empleado(String ApyNom, int dni, double horastrabajadas, int valorxhora){
        this.ApyNom = ApyNom;
        this.dni = dni;
        this.horastrabajadas = horastrabajadas;
        this.valorxhora = valorxhora;
    }

    public int buscardni(){
        return dni;
    }

    public double calcularsalario(){
        return (horastrabajadas * valorxhora);
    }
    

}


public class ej6 {
    public static void main(String[] args) {

        Set<Empleado> Empleados = new HashSet<>();
        Map<Integer, Double> PagoNomina = new HashMap<>();

        Empleado empleado1 = new Empleado("Puente Tito", 11222333, 8.5, 100);
        Empleado empleado2 = new Empleado("Garcia Juan", 22333444, 7.8, 120);
        Empleado empleado3 = new Empleado("Gonzalez Teresa", 33444555, 10.2, 150);

        Empleados.add(empleado1);
        Empleados.add(empleado2);
        Empleados.add(empleado3);

        for (Empleado emp : Empleados) {
            PagoNomina.put(emp.buscardni(), emp.calcularsalario());
        }

        for(Map.Entry<Integer, Double> emp : PagoNomina.entrySet()){
            System.out.println(emp.getKey() + " : " + emp.getValue());
        }
        

        


    }
}
