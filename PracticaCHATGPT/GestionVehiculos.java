package Practica_Final.PracticaCHATGPT;
import java.util.ArrayList;

public class GestionVehiculos {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public void agregarVehiculo(Vehiculo e){
        vehiculos.add(e);
        System.out.println("Vehiculo agregado\n");
    }

    public void mostrarInformacion(){
        for(Vehiculo e : vehiculos){
            System.out.println(e.mostrarInformacion());
        }
    }
}
