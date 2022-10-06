package mx.edu.utdev.models;

import java.sql.Timestamp;

public class CtrlErrores {

    // VARIABLES GLOBALES
    private int id_error;
    private Timestamp fecha_log;
    private String descripcion; // BD - NTEXT

    // CONSTRUCTORES
    public CtrlErrores() {
    }

    public CtrlErrores(int id_error, Timestamp fecha_log, String descripcion) {
        this.id_error = id_error;
        this.fecha_log = fecha_log;
        this.descripcion = descripcion;
    }

    // SETTERS & GETTERS

    public int getId_error() {
        return id_error;
    }

    public void setId_error(int id_error) {
        this.id_error = id_error;
    }

    public Timestamp getFecha_log() {
        return fecha_log;
    }

    public void setFecha_log(Timestamp fecha_log) {
        this.fecha_log = fecha_log;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
