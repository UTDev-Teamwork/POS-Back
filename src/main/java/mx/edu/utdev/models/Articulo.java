package mx.edu.utdev.models;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Articulo {

    // VARIABLES GLOBALES
    private String cod_barras;
    private String cod_asociado;
    private BigInteger id_clasificacion;
    private String cod_interno;
    private String descripcion;
    private String descripcion_corta;
    private double cantidad_um;
    private int id_unidad;
    private int id_proveedor;
    private double precio_compra;
    private double utilidad;
    private double precio_venta;
    private String tipo_articulo;
    private double stock;
    private double stock_min;
    private double stock_max;
    private double iva;
    private Timestamp kit_fecha_ini;
    private Timestamp kit_fecha_fin;
    private boolean articulo_disponible;
    private boolean kit;
    private Timestamp fecha_registro;
    private boolean visible;
    private short puntos;
    private Timestamp last_update_inventory;
    private String cve_producto;
    private String imagen;

    // CONSTRUCTORES
    public Articulo() {
    }

    public Articulo(String cod_barras, int id_clasificacion, String descripcion, String descripcion_corta,
            double precio_venta, double stock, double iva, boolean articulo_disponible, String imagen) {
        this.cod_barras = cod_barras;
        this.id_clasificacion = BigInteger.valueOf(id_clasificacion);
        this.descripcion = descripcion;
        this.descripcion_corta = descripcion_corta;
        this.precio_venta = precio_venta;
        this.stock = stock;
        this.iva = iva;
        this.articulo_disponible = articulo_disponible;
        this.imagen = imagen;
    }

    public Articulo(String cod_barras, String cod_asociado, BigInteger id_clasificacion, String cod_interno,
            String descripcion, String descripcion_corta, double cantidad_um, int id_unidad, int id_proveedor,
            double precio_compra, double utilidad, double precio_venta, String tipo_articulo, double stock,
            double stock_min, double stock_max, double iva, Timestamp kit_fecha_ini, Timestamp kit_fecha_fin,
            boolean articulo_disponible, boolean kit, Timestamp fecha_registro, boolean visible, short puntos,
            Timestamp last_update_inventory, String cve_producto) {
        this.cod_barras = cod_barras;
        this.cod_asociado = cod_asociado;
        this.id_clasificacion = id_clasificacion;
        this.cod_interno = cod_interno;
        this.descripcion = descripcion;
        this.descripcion_corta = descripcion_corta;
        this.cantidad_um = cantidad_um;
        this.id_unidad = id_unidad;
        this.id_proveedor = id_proveedor;
        this.precio_compra = precio_compra;
        this.utilidad = utilidad;
        this.precio_venta = precio_venta;
        this.tipo_articulo = tipo_articulo;
        this.stock = stock;
        this.stock_min = stock_min;
        this.stock_max = stock_max;
        this.iva = iva;
        this.kit_fecha_ini = kit_fecha_ini;
        this.kit_fecha_fin = kit_fecha_fin;
        this.articulo_disponible = articulo_disponible;
        this.kit = kit;
        this.fecha_registro = fecha_registro;
        this.visible = visible;
        this.puntos = puntos;
        this.last_update_inventory = last_update_inventory;
        this.cve_producto = cve_producto;
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

    public BigInteger getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(BigInteger id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    public String getCod_interno() {
        return cod_interno;
    }

    public void setCod_interno(String cod_interno) {
        this.cod_interno = cod_interno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getStock_min() {
        return stock_min;
    }

    public void setStock_min(double stock_min) {
        this.stock_min = stock_min;
    }

    public double getStock_max() {
        return stock_max;
    }

    public void setStock_max(double stock_max) {
        this.stock_max = stock_max;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public Timestamp getKit_fecha_ini() {
        return kit_fecha_ini;
    }

    public void setKit_fecha_ini(Timestamp kit_fecha_ini) {
        this.kit_fecha_ini = kit_fecha_ini;
    }

    public Timestamp getKit_fecha_fin() {
        return kit_fecha_fin;
    }

    public void setKit_fecha_fin(Timestamp kit_fecha_fin) {
        this.kit_fecha_fin = kit_fecha_fin;
    }

    public boolean isArticulo_disponible() {
        return articulo_disponible;
    }

    public void setArticulo_disponible(boolean articulo_disponible) {
        this.articulo_disponible = articulo_disponible;
    }

    public boolean isKit() {
        return kit;
    }

    public void setKit(boolean kit) {
        this.kit = kit;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public short getPuntos() {
        return puntos;
    }

    public void setPuntos(short puntos) {
        this.puntos = puntos;
    }

    public Timestamp getLast_update_inventory() {
        return last_update_inventory;
    }

    public void setLast_update_inventory(Timestamp last_update_inventory) {
        this.last_update_inventory = last_update_inventory;
    }

    public String getCve_producto() {
        return cve_producto;
    }

    public void setCve_producto(String cve_producto) {
        this.cve_producto = cve_producto;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
