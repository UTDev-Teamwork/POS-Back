package mx.edu.utdev.models;

public class TipoComprobante {
    // VARIABLES GLOBALES
    private String id; // EN EL SCRIPT ES VARCHAR
    private String descripcion;
    private String fecha_inicio; // EN EL SCRIPT ES DATE
    private String fecha_fin;

    // CONSTRUCTORES

    public TipoComprobante() {
    }

    public TipoComprobante(String id, String descripcion, String fecha_inicio, String fecha_fin) {
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

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
