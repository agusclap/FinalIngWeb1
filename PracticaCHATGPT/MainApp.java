package Practica_Final.PracticaCHATGPT;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Automovil auto = new Automovil("BMW","M5",2021,4);
        Automovil auto1 = new Automovil("BMW","M4",2022,2);
        Motocicleta moto = new Motocicleta("Yamaha","R1",2023,500);
        Motocicleta moto1 = new Motocicleta("Kawasaki","Ninja",2020,550);
        GestionVehiculos vehiculos = new GestionVehiculos();
        vehiculos.agregarVehiculo(auto);
        vehiculos.agregarVehiculo(auto1);
        vehiculos.agregarVehiculo(moto);
        vehiculos.agregarVehiculo(moto1);
        vehiculos.mostrarInformacion();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la marca del auto a agregar");
        String marca = input.next();
        System.out.println("Ingrese el modelo del auto a agregar");
        String modelo = input.next();
        System.out.println("Ingrese el año del auto a agregar");
        int anio = Integer.parseInt(input.next());
        System.out.println("Ingrese la cantidad de puertas del vehiculo a agregar");
        int cantidad = Integer.parseInt(input.next());
        Automovil nuevoAuto = new Automovil(marca, modelo, anio, cantidad);
        vehiculos.agregarVehiculo(nuevoAuto);
        System.out.println("La lista actualizada con el nuevo vehiculo es la siguiente: ");
        vehiculos.mostrarInformacion();
        
    }
}
