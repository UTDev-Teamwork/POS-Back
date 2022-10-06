package mx.edu.utdev.models;

public class Pais {

    // VARIABLES GLOBALES
    private String id;
    private String descripcion;
    private String agrupacion;

    // CONSTRUCTORES
    public Pais(){}

    public Pais(String id, String descripcion, String agrupacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.agrupacion = agrupacion;
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

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }
}
