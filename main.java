package Practica_Final;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Venta> ventas = new ArrayList<Venta>();
        ArrayList<Producto> lista = new ArrayList<Producto>();
        char seguir = ' ';
        int opcion = 0;
        lista = load(lista);
        Scanner console = new Scanner(System.in);
        do{
            System.out.println("BIENVENIDOS A NUESTRO SISTEMA FARMACIA");
            System.out.println("Que desea hacer ? (Ingrese una opcion)");
            System.out.println("1) Cargar Venta");
            System.out.println("2) Listar todas las ventas");
            System.out.println("3) Listar todos los productos");
            System.out.println("4) Terminar venta");
            opcion = console.nextInt();
            switch(opcion){
                case 1:
                    add(clientes,ventas,lista);
                    break;
                case 2:
                    show_sales(ventas);
                    break;
                case 3:
                    show_products(lista);
                    break;
                case 4:
                    System.out.println("Adios");
                    System.exit(0);
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
            }
            System.out.println("Desea continuar con el programa ? y/n");
            seguir = console.next().charAt(0);
        }while(seguir == 'y' || seguir == 'Y');
    }

    public static ArrayList<Producto> load(ArrayList<Producto> lista){
        Producto producto = new Producto("Ibuprofeno", 100);
        lista.add(producto);
        producto = new Producto("Paracetamol",200);
        lista.add(producto);
        producto = new Producto("Aspirina",300);
        lista.add(producto);
        producto = new Producto("Omeoprazol",400);
        lista.add(producto);
        producto = new Producto("Rivotril",500);
        lista.add(producto);
        return lista;
    }

    public static void add(ArrayList<Cliente> clientes , ArrayList<Venta> ventas, ArrayList<Producto> lista ){
        int opcion = 0;
        String nombre = "";
        String apellido = "";
        int dni = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Los productos disponibles son: ");
        show_products(lista);
        System.out.println("Seleccione su producto");
        opcion = input.nextInt();

        System.out.println("Ingrese el nombre del cliente");

        nombre = input.next();
        System.out.println("Ingrese el apellido del cliente");
        apellido = input.next();
        System.out.println("Ingrese el DNI del cliente");
        dni = input.nextInt();
        Cliente cliente = new Cliente(nombre,apellido,dni);
        clientes.add(cliente);
        Venta venta = new Venta(lista.get(opcion-1), cliente);
        ventas.add(venta);
        System.out.println("Su venta es: ");
        System.out.println(venta.toString());
    }

    public static void show_sales(ArrayList<Venta> ventas){
        System.out.println("Sus ventas hasta el momento son: ");
        int contador = 0;
        for(Venta venta : ventas){
            System.out.println("Venta nº: " + ++contador);
            System.out.println(venta.toString());
        }
    }

    public static void show_products(ArrayList<Producto> productos){
        int contador = 0;
        for(Producto producto : productos){
            System.out.println(++contador + "- " + producto.getNombre());
        }
    }
}