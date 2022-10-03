package mx.edu.utdev.models;

import java.math.BigInteger;

public class VentaDevolucionArticulo {
    // VARIABLES GLOBALES
    private char id_devolucion; // EN EL SCRIPT ES CHAR
    private BigInteger no_articulo;
    private String cod_barras;
    private double cantidad;

    // CONSTRUCTORES

    public VentaDevolucionArticulo() {
    }

    public VentaDevolucionArticulo(char id_devolucion, BigInteger no_articulo, String cod_barras, double cantidad) {
        this.id_devolucion = id_devolucion;
        this.no_articulo = no_articulo;
        this.cod_barras = cod_barras;
        this.cantidad = cantidad;
    }

    // SETTERS & GETTERS

    public char getId_devolucion() {
        return id_devolucion;
    }

    public void setId_devolucion(char id_devolucion) {
        this.id_devolucion = id_devolucion;
    }

    public BigInteger getNo_articulo() {
        return no_articulo;
    }

    public void setNo_articulo(BigInteger no_articulo) {
        this.no_articulo = no_articulo;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
