package Practica_Final.PracticaCHATGPT1;

public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;


    public EmpleadoPorHora(String nombre, double salario, int horasTrabajadas){
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario(){
        return horasTrabajadas * 500;
    }

    public String mostrarInformacion(){
        return super.mostrarInformacion() + "Horas Trabajadas: " + horasTrabajadas + "\n";
    }
}
