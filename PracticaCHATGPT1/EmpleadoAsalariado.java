package Practica_Final.PracticaCHATGPT1;

public class EmpleadoAsalariado extends Empleado {
    private int antiguedad;


    public EmpleadoAsalariado(String nombre, double salario, int antiguedad){
        super(nombre, salario);
        this.antiguedad = antiguedad;
    }


    public double calcularSalario(){
        return  antiguedad * 3000;
    }

    public String mostrarInformacion(){
        return super.mostrarInformacion() + "Antiguedad: " + antiguedad + "\n";
    }
}
