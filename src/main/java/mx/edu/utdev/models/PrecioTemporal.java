package mx.edu.utdev.models;

public class PrecioTemporal {
    // VARIABLES GLOBALES
    private String cod_barras;
    private double precio_compra;
    private double utilidad;
    private double precio_venta;
    private double iva;

    // CONSTRUCTORES

    public PrecioTemporal() {
    }

    public PrecioTemporal(String cod_barras, double precio_compra, double utilidad, double precio_venta, double iva) {
        this.cod_barras = cod_barras;
        this.precio_compra = precio_compra;
        this.utilidad = utilidad;
        this.precio_venta = precio_venta;
        this.iva = iva;
    }

    // SETTERS & GETTERS

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}
