package Practica_Final;

public class Cliente extends Persona {
    private int nro_cliente;
    private String compra;

    public Cliente(){
        
    }

    public Cliente(String n, String a, int d){
        setNombre(n);
        setApellido(a);
        setDni(d);
    }
}
