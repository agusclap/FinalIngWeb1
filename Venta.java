package Practica_Final;

public class Venta {
    private Producto producto;
    private Cliente cliente;

    public Venta(Producto p, Cliente c){
        producto = p;
        cliente = c;
    }

    public Venta(){

    }

    public String toString(){
        return producto.getNombre() + "\n\nImporte: " + producto.getImporte() + "\n\nCliente:\n\nNombre: " + cliente.getNombre() + "\n\nApellido: " + cliente.getApellido() + "\n";
    }

}
