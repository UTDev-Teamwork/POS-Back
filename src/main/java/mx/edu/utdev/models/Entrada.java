package mx.edu.utdev.models;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Entrada {

    // VARIABLES GLOBALES
    private int id_entrada;
    private BigInteger num_entrada;
    private Timestamp fecha_entrada;
    private String observacion;
    private BigInteger id_movto;
    private String user_name;
    private boolean cancelada;
    private Timestamp fecha_cancelacion;

    // CONSTRUCTORES
    public Entrada(){}

    public Entrada(int id_entrada, BigInteger num_entrada, Timestamp fecha_entrada, String observacion, BigInteger id_movto, String user_name, boolean cancelada, Timestamp fecha_cancelacion) {
        this.id_entrada = id_entrada;
        this.num_entrada = num_entrada;
        this.fecha_entrada = fecha_entrada;
        this.observacion = observacion;
        this.id_movto = id_movto;
        this.user_name = user_name;
        this.cancelada = cancelada;
        this.fecha_cancelacion = fecha_cancelacion;
    }


    // SETTERS & GETTERS

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public BigInteger getNum_entrada() {
        return num_entrada;
    }

    public void setNum_entrada(BigInteger num_entrada) {
        this.num_entrada = num_entrada;
    }

    public Timestamp getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Timestamp fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
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
