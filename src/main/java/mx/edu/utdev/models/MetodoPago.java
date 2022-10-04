package mx.edu.utdev.models;

import java.sql.Timestamp;

public class MetodoPago {

    // VARIABLES GLOBALES
    private String id;
    private String descripcion;
    private Timestamp fecha_inicio;
    private Timestamp fecha_fin;

    // CONSTRUCTORES
    public MetodoPago(){}

    public MetodoPago(String id, String descripcion, Timestamp fecha_inicio, Timestamp fecha_fin) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    // SETTERS & GETTERS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Timestamp fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Timestamp getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Timestamp fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
