package Practica_Final.PracticaCHATGPT;

public class Automovil extends Vehiculo{
    private int numeroDePuertas;


    public Automovil(String marca, String modelo, int anio, int numeroDePuertas){
        super(marca,modelo,anio);
        this.numeroDePuertas = numeroDePuertas;
    }


    public void setNumeroDePuertas(int numeroDePuertas){
        this.numeroDePuertas = numeroDePuertas;

    }

    public int getNumeroDePuertas(){
        return this.numeroDePuertas;
    }
    
    public String mostrarInformacion(){
        return super.mostrarInformacion() + "Cantidad De Puertas: " + numeroDePuertas + "\n";
    }
}
