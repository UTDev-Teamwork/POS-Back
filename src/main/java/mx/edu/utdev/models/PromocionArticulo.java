package mx.edu.utdev.models;

public class PromocionArticulo {
    // VARIABLES GLOBALES
    private char id_promo; // EN EL SCRIPT ES CHAR
    private String cod_barras;
    private double cantidad_lleva;
    private double cantidad_paga;
    private double prcent_desc;

    // CONSTRUCTORES

    public PromocionArticulo() {
    }

    public PromocionArticulo(char id_promo, String cod_barras, double cantidad_lleva, double cantidad_paga,
            double prcent_desc) {
        this.id_promo = id_promo;
        this.cod_barras = cod_barras;
        this.cantidad_lleva = cantidad_lleva;
        this.cantidad_paga = cantidad_paga;
        this.prcent_desc = prcent_desc;
    }

    // SETTERS & GETTERS

    public char getId_promo() {
        return id_promo;
    }

    public void setId_promo(char id_promo) {
        this.id_promo = id_promo;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getCantidad_lleva() {
        return cantidad_lleva;
    }

    public void setCantidad_lleva(double cantidad_lleva) {
        this.cantidad_lleva = cantidad_lleva;
    }

    public double getCantidad_paga() {
        return cantidad_paga;
    }

    public void setCantidad_paga(double cantidad_paga) {
        this.cantidad_paga = cantidad_paga;
    }

    public double getPrcent_desc() {
        return prcent_desc;
    }

    public void setPrcent_desc(double prcent_desc) {
        this.prcent_desc = prcent_desc;
    }
}
