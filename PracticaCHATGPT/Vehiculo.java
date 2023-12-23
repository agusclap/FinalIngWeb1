package Practica_Final.PracticaCHATGPT;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }


    public String mostrarInformacion(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio + "\n";
    }
}
