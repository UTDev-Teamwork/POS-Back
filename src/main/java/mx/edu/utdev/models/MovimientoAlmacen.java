package mx.edu.utdev.models;

import java.math.BigInteger;

public class MovimientoAlmacen {

    // VARIABLES GLOBALES
    private BigInteger id_movto;
    private String descripcion;
    private String tipo_movto;

    // CONSTRUCTORES
    public MovimientoAlmacen(){}

    public MovimientoAlmacen(BigInteger id_movto, String descripcion, String tipo_movto) {
        this.id_movto = id_movto;
        this.descripcion = descripcion;
        this.tipo_movto = tipo_movto;
    }

    // SETTERS & GETTERS

    public BigInteger getId_movto() {
        return id_movto;
    }

    public void setId_movto(BigInteger id_movto) {
        this.id_movto = id_movto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_movto() {
        return tipo_movto;
    }

    public void setTipo_movto(String tipo_movto) {
        this.tipo_movto = tipo_movto;
    }
}
