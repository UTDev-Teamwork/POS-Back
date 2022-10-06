package mx.edu.utdev.models;

import java.math.BigInteger;

public class FacturaArticulo {

    // VARIABLES GLOBALES
    private int id_factura_articulo;
    private BigInteger id_factura;
    private String cod_barras;
    private String descripcion;
    private int id_unidad;
    private double cantidad;
    private double iva;
    private double precio_vta;

    // CONSTRUCTORES
    public FacturaArticulo(){}

    public FacturaArticulo(int id_factura_articulo, BigInteger id_factura, String cod_barras, String descripcion, int id_unidad, double cantidad, double iva, double precio_vta) {
        this.id_factura_articulo = id_factura_articulo;
        this.id_factura = id_factura;
        this.cod_barras = cod_barras;
        this.descripcion = descripcion;
        this.id_unidad = id_unidad;
        this.cantidad = cantidad;
        this.iva = iva;
        this.precio_vta = precio_vta;
    }

    // SETTERS & GETTERS

    public int getId_factura_articulo() {
        return id_factura_articulo;
    }

    public void setId_factura_articulo(int id_factura_articulo) {
        this.id_factura_articulo = id_factura_articulo;
    }

    public BigInteger getId_factura() {
        return id_factura;
    }

    public void setId_factura(BigInteger id_factura) {
        this.id_factura = id_factura;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecio_vta() {
        return precio_vta;
    }

    public void setPrecio_vta(double precio_vta) {
        this.precio_vta = precio_vta;
    }
}
