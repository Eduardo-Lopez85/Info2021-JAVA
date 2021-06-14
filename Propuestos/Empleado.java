package Propuestos;

import java.time.LocalDate;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private String sueldo;

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return this.nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }


   

    public Empleado (String nombre, String apellido, String nacimiento, String sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sueldo = Float.parseFloat(sueldo);
    }
   
    
    


}
