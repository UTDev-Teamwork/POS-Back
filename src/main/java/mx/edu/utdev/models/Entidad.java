package mx.edu.utdev.models;

public class Entidad {

    // VARIABLES GLOBALES
    private int id_entidad;
    private String nombre;

    // CONSTRUCTORES
    public Entidad(){}

    public Entidad(int id_entidad, String nombre) {
        this.id_entidad = id_entidad;
        this.nombre = nombre;
    }

    // SETTERS & GETTERS
    public int getId_entidad() {
        return id_entidad;
    }

    public void setId_entidad(int id_entidad) {
        this.id_entidad = id_entidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
