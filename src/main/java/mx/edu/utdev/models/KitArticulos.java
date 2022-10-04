package mx.edu.utdev.models;

public class KitArticulos {

    // VARIABLES GLOBALES
    private String cod_barras;
    private String cod_barras_pro;
    private double cantidad;

    // CONSTRUCTORES
    public KitArticulos(){}

    public KitArticulos(String cod_barras, String cod_barras_pro, double cantidad) {
        this.cod_barras = cod_barras;
        this.cod_barras_pro = cod_barras_pro;
        this.cantidad = cantidad;
    }

    // SETTERS & GETTERS

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getCod_barras_pro() {
        return cod_barras_pro;
    }

    public void setCod_barras_pro(String cod_barras_pro) {
        this.cod_barras_pro = cod_barras_pro;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
