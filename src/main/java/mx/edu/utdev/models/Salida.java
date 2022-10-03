package mx.edu.utdev.models;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Salida {
    // VARIABLES GLOBALES
    private char id_salida; // EN EL SCRIPT ES CHAR
    private BigInteger num_salida; // EN EL SCRIPT ES BIGINT, PUEDE SER LONG
    private Timestamp fecha_salida; // EN EL SCRIP ES TIMESTAMP, PUEDE SER STRING
    private String observacion; // EN EL SCRIPT ES TEXT
    private BigInteger id_movto;
    private String user_name;
    private boolean cancelada; // EN EL SCRIPT ES BOOLEAN
    private Timestamp fecha_cancelacion;

    // CONSTRUCTORES

    public Salida() {
    }

    public Salida(char id_salida, BigInteger num_salida, Timestamp fecha_salida, String observacion,
            BigInteger id_movto, String user_name, boolean cancelada, Timestamp fecha_cancelacion) {
        this.id_salida = id_salida;
        this.num_salida = num_salida;
        this.fecha_salida = fecha_salida;
        this.observacion = observacion;
        this.id_movto = id_movto;
        this.user_name = user_name;
        this.cancelada = cancelada;
        this.fecha_cancelacion = fecha_cancelacion;
    }

    // SETTERS & GETTERS

    public char getId_salida() {
        return id_salida;
    }

    public void setId_salida(char id_salida) {
        this.id_salida = id_salida;
    }

    public BigInteger getNum_salida() {
        return num_salida;
    }

    public void setNum_salida(BigInteger num_salida) {
        this.num_salida = num_salida;
    }

    public Timestamp getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Timestamp fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigInteger getId_movto() {
        return id_movto;
    }

    public void setId_movto(BigInteger id_movto) {
        this.id_movto = id_movto;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    public Timestamp getFecha_cancelacion() {
        return fecha_cancelacion;
    }

    public void setFecha_cancelacion(Timestamp fecha_cancelacion) {
        this.fecha_cancelacion = fecha_cancelacion;
    }
}
