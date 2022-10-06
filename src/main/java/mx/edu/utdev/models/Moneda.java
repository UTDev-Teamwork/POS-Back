package mx.edu.utdev.models;

import java.sql.Timestamp;

public class Moneda {

    // VARIABLES GLOBALES
    private String id;
    private String descripcion;
    private String decimales;
    private String porcentaje;
    private Timestamp fecha_inicio;
    private Timestamp fecha_fin;

    // CONSTRUCTORES
    public Moneda(){}

    public Moneda(String id, String descripcion, String decimales, String porcentaje, Timestamp fecha_inicio, Timestamp fecha_fin) {
        this.id = id;
        this.descripcion = descripcion;
        this.decimales = decimales;
        this.porcentaje = porcentaje;
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

    public String getDecimales() {
        return decimales;
    }

    public void setDecimales(String decimales) {
        this.decimales = decimales;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
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
