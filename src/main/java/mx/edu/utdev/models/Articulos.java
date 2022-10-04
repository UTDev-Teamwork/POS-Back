package mx.edu.utdev.models;

import java.sql.Timestamp;

public class Articulos {

    // VARIABLES GLOBALES
    private String cod_barras;
    private String cod_asociado;
    private String cod_interno;
    private String descripcion_corta;
    private double cantidad_um;
    private int id_unidad;
    private int id_proveedor;
    private double precio_compra;
    private double utilidad;
    private double precio_venta;
    private String tipo_articulo;
    private double iva;
    private boolean articulo_disponible;
    private Timestamp fecha_registro;

    // CONSTRUCTORES
    public Articulos(){
    }

    public Articulos(String cod_barras, String cod_asociado, String cod_interno, String descripcion_corta, double cantidad_um, int id_unidad, int id_proveedor, double precio_compra, double utilidad, double precio_venta, String tipo_articulo, double iva, boolean articulo_disponible, Timestamp fecha_registro) {
        this.cod_barras = cod_barras;
        this.cod_asociado = cod_asociado;
        this.cod_interno = cod_interno;
        this.descripcion_corta = descripcion_corta;
        this.cantidad_um = cantidad_um;
        this.id_unidad = id_unidad;
        this.id_proveedor = id_proveedor;
        this.precio_compra = precio_compra;
        this.utilidad = utilidad;
        this.precio_venta = precio_venta;
        this.tipo_articulo = tipo_articulo;
        this.iva = iva;
        this.articulo_disponible = articulo_disponible;
        this.fecha_registro = fecha_registro;
    }

    // SETTERS & GETTERS
    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getCod_asociado() {
        return cod_asociado;
    }

    public void setCod_asociado(String cod_asociado) {
        this.cod_asociado = cod_asociado;
    }

    public String getCod_interno() {
        return cod_interno;
    }

    public void setCod_interno(String cod_interno) {
        this.cod_interno = cod_interno;
    }

    public String getDescripcion_corta() {
        return descripcion_corta;
    }

    public void setDescripcion_corta(String descripcion_corta) {
        this.descripcion_corta = descripcion_corta;
    }

    public double getCantidad_um() {
        return cantidad_um;
    }

    public void setCantidad_um(double cantidad_um) {
        this.cantidad_um = cantidad_um;
    }

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
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

    public String getTipo_articulo() {
        return tipo_articulo;
    }

    public void setTipo_articulo(String tipo_articulo) {
        this.tipo_articulo = tipo_articulo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public boolean isArticulo_disponible() {
        return articulo_disponible;
    }

    public void setArticulo_disponible(boolean articulo_disponible) {
        this.articulo_disponible = articulo_disponible;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
