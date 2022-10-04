package mx.edu.utdev.models;

import java.math.BigInteger;

public class Clasificacion {

    // VARIABLES GLOBALES
    private BigInteger id_clasificacion;
    private BigInteger id_clasificacion_dep;
    private String descripcion;
    private short nivel_clasificacion;

    // CONSTRUCTORES
    public Clasificacion(){
    }

    public Clasificacion(BigInteger id_clasificacion, BigInteger id_clasificacion_dep, String descripcion, short nivel_clasificacion) {
        this.id_clasificacion = id_clasificacion;
        this.id_clasificacion_dep = id_clasificacion_dep;
        this.descripcion = descripcion;
        this.nivel_clasificacion = nivel_clasificacion;
    }

    // SETTERS & GETTERS
    public BigInteger getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(BigInteger id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    public BigInteger getId_clasificacion_dep() {
        return id_clasificacion_dep;
    }

    public void setId_clasificacion_dep(BigInteger id_clasificacion_dep) {
        this.id_clasificacion_dep = id_clasificacion_dep;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getNivel_clasificacion() {
        return nivel_clasificacion;
    }

    public void setNivel_clasificacion(short nivel_clasificacion) {
        this.nivel_clasificacion = nivel_clasificacion;
    }
}
