package Practica_Final;

public class Producto {
    private String nombre;
    private int importe;

    public Producto(String n, int i){
        nombre = n;
        importe = i;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setImporte(int importe){
        this.importe = importe;
    }

    public int getImporte(){
        return importe;
    }

    public String toString(){
        return nombre + "\n" + importe;
    }
}
