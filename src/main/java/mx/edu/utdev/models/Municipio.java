package mx.edu.utdev.models;

public class Municipio {

    // VARIABLES GLOBALES
    private short id_entidad;
    private short id_municipio;
    private String nombre;

    // CONSTRUCTORES
    public Municipio(){}

    public Municipio(short id_entidad, short id_municipio, String nombre) {
        this.id_entidad = id_entidad;
        this.id_municipio = id_municipio;
        this.nombre = nombre;
    }

    // SETTERS & GETTERS

    public short getId_entidad() {
        return id_entidad;
    }

    public void setId_entidad(short id_entidad) {
        this.id_entidad = id_entidad;
    }

    public short getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(short id_municipio) {
        this.id_municipio = id_municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
