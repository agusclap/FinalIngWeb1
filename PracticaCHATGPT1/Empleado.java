package Practica_Final.PracticaCHATGPT1;

public abstract class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public abstract double calcularSalario();

    public String mostrarInformacion(){
        return "Nombre: " + nombre + "\n Salario: " + salario + "\n";
    }
}
