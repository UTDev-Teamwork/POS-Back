package mx.edu.utdev.models;

import java.sql.Timestamp;

public class Permiso {

    // VARIABLES GLOBALES
    private String id_permiso;
    private String descripcion;
    private String tipo_sistema;
    private Timestamp fecha_registro;

    // CONSTRUCTORES
    public Permiso(){}

    public Permiso(String id_permiso, String descripcion, String tipo_sistema, Timestamp fecha_registro) {
        this.id_permiso = id_permiso;
        this.descripcion = descripcion;
        this.tipo_sistema = tipo_sistema;
        this.fecha_registro = fecha_registro;
    }

    // SETTERS & GETTERS

    public String getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(String id_permiso) {
        this.id_permiso = id_permiso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_sistema() {
        return tipo_sistema;
    }

    public void setTipo_sistema(String tipo_sistema) {
        this.tipo_sistema = tipo_sistema;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
