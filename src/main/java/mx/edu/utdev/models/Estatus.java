package mx.edu.utdev.models;

public class Estatus {

    // VARIABLES GLOBALES
    private short id_estatus;
    private String descripcion;

    // CONSTRUCTORES
    public Estatus(){}

    public Estatus(short id_estatus, String descripcion) {
        this.id_estatus = id_estatus;
        this.descripcion = descripcion;
    }

    // SETTERS & GETTERS

    public short getId_estatus() {
        return id_estatus;
    }

    public void setId_estatus(short id_estatus) {
        this.id_estatus = id_estatus;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
