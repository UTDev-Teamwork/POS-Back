package mx.edu.utdev.models;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Oferta {

    // VARIABLES GLOBALES
    private int id_oferta;
    private BigInteger num_oferta;
    private String descripcion;
    private Timestamp fecha_oferta;
    private Timestamp fecha_ini;
    private Timestamp fecha_fin;
    private String status_oferta;
    private Timestamp fecha_cancelacion;
    private String user_name;

    // CONSTRUCTORES
    public Oferta(){}

    public Oferta(int id_oferta, BigInteger num_oferta, String descripcion, Timestamp fecha_oferta, Timestamp fecha_ini, Timestamp fecha_fin, String status_oferta, Timestamp fecha_cancelacion, String user_name) {
        this.id_oferta = id_oferta;
        this.num_oferta = num_oferta;
        this.descripcion = descripcion;
        this.fecha_oferta = fecha_oferta;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
        this.status_oferta = status_oferta;
        this.fecha_cancelacion = fecha_cancelacion;
        this.user_name = user_name;
    }

    // SETTERS & GETTERS

    public int getId_oferta() {
        return id_oferta;
    }

    public void setId_oferta(int id_oferta) {
        this.id_oferta = id_oferta;
    }

    public BigInteger getNum_oferta() {
        return num_oferta;
    }

    public void setNum_oferta(BigInteger num_oferta) {
        this.num_oferta = num_oferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFecha_oferta() {
        return fecha_oferta;
    }

    public void setFecha_oferta(Timestamp fecha_oferta) {
        this.fecha_oferta = fecha_oferta;
    }

    public Timestamp getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Timestamp fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Timestamp getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Timestamp fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getStatus_oferta() {
        return status_oferta;
    }

    public void setStatus_oferta(String status_oferta) {
        this.status_oferta = status_oferta;
    }

    public Timestamp getFecha_cancelacion() {
        return fecha_cancelacion;
    }

    public void setFecha_cancelacion(Timestamp fecha_cancelacion) {
        this.fecha_cancelacion = fecha_cancelacion;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}