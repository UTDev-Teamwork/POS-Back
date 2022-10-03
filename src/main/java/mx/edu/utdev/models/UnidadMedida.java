package mx.edu.utdev.models;

public class UnidadMedida {
    // VARIABLES GLOBALES
    private int id_unidad; // en sql es uniqueidentifier
    private String descripcion;
    private String fecha_registro;
    private String cve_sat;

    // CONSTRUCTORES

    public UnidadMedida() {
    }

    public UnidadMedida(int id_unidad, String descripcion, String fecha_registro, String cve_sat) {
        this.id_unidad = id_unidad;
        this.descripcion = descripcion;
        this.fecha_registro = fecha_registro;
        this.cve_sat = cve_sat;
    }

    // SETTERS & GETTERS

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getCve_sat() {
        return cve_sat;
    }

    public void setCve_sat(String cve_sat) {
        this.cve_sat = cve_sat;
    }
}
