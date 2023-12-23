package Practica_Final;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;

    public Persona(){

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setApellido(String apellido){
        this.apellido  = apellido;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setDni(int dni){
        this.dni = dni;
    }

    public int getDni(){
        return dni;
    }
}
