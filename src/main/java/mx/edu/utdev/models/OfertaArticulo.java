package mx.edu.utdev.models;

import java.sql.Timestamp;

public class OfertaArticulo {

    // VARIABLES GLOBALES
    private int id_oferta;
    private String cod_barras;
    private double precio_oferta;
    private String status_oferta;
    private Timestamp fecha_cancelacion;
    private Timestamp fecha_registro;

    // CONSTRUCTORES
    public OfertaArticulo(){}

    public OfertaArticulo(int id_oferta, String cod_barras, double precio_oferta, String status_oferta, Timestamp fecha_cancelacion, Timestamp fecha_registro) {
        this.id_oferta = id_oferta;
        this.cod_barras = cod_barras;
        this.precio_oferta = precio_oferta;
        this.status_oferta = status_oferta;
        this.fecha_cancelacion = fecha_cancelacion;
        this.fecha_registro = fecha_registro;
    }

    // SETTERS & GETTERS

    public int getId_oferta() {
        return id_oferta;
    }

    public void setId_oferta(int id_oferta) {
        this.id_oferta = id_oferta;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getPrecio_oferta() {
        return precio_oferta;
    }

    public void setPrecio_oferta(double precio_oferta) {
        this.precio_oferta = precio_oferta;
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

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
