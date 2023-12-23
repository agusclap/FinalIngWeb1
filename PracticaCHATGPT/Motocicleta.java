package Practica_Final.PracticaCHATGPT;

public class Motocicleta extends Vehiculo {
    private int cilindrada;


    public Motocicleta(String marca, String modelo, int anio, int cilindrada){
        super(marca,modelo,anio);
        this.cilindrada = cilindrada;
    }

    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return this.cilindrada;
    }

    public String mostrarInformacion(){
        return super.mostrarInformacion() + "Cilindrada: " + cilindrada + "\n";
    }
}
