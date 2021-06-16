package Propuestos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private float sueldo;
    //CONSTRUCTOR
    public Empleado (String nombre, String apellido, String nacimiento, String sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = LocalDate.parse(nacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.sueldo = Float.parseFloat(sueldo);
    }
    // SETERS AND GETERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public LocalDate getNacimiento() {
        return nacimiento;
    }
    public void setNacimiento(String nacimiento) {
        this.nacimiento = LocalDate.parse(nacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    public float getSueldo() {
        return sueldo;
    }
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    //Calcular edad
    public int calcularEdad() {
        Period edad = Period.between(this.nacimiento, LocalDate.now()); 
        return edad.getYears();
    }
   
    @Override
    public String toString(){
        return ("Nombre: "+ nombre +" - Apellido: "+ apellido + " - Nacimiento: "+ nacimiento.toString() +" Sueldo: "+ sueldo);
    }
}
