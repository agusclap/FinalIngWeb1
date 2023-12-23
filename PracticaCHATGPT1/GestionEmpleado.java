package Practica_Final.PracticaCHATGPT1;

import java.util.HashMap;

public class GestionEmpleado {
    private HashMap<String,Empleado> lista = new HashMap<>();


    public void agregarEmpleado(Empleado e){
        lista.put(e.getNombre(), e);
    }

    public void mostrarEmpleados(){
        for(Empleado e : lista.values()){
            System.out.println(e.mostrarInformacion());
        }
    }
}
