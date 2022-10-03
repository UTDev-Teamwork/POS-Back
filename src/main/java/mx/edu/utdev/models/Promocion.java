package mx.edu.utdev.models;

import java.sql.Timestamp;

public class Promocion {
    // VARIABLES GLOBALES
    private char id_promo; // EN EL SCRIPT ES CHAR
    private String descripcion;
    private char tipo_promo;
    private Timestamp fecha_ini; // EN EL SCRIPT ES TIMESTAMP, PUEDE SER STRING
    private Timestamp fecha_fin;

    // CONSTRUCTORES

    public Promocion() {
    }

    public Promocion(char id_promo, String descripcion, char tipo_promo, Timestamp fecha_ini, Timestamp fecha_fin) {
        this.id_promo = id_promo;
        this.descripcion = descripcion;
        this.tipo_promo = tipo_promo;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
    }

    // SETTERS & GETTERS

    public char getId_promo() {
        return id_promo;
    }

    public void setId_promo(char id_promo) {
        this.id_promo = id_promo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getTipo_promo() {
        return tipo_promo;
    }

    public void setTipo_promo(char tipo_promo) {
        this.tipo_promo = tipo_promo;
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
}
