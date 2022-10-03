package mx.edu.utdev.models;

public class VentaCanceladaArticulo {
    // VARIABLES GLOBALES
    private int id_post;
    private int id_venta_cancel; // en sql es uniqueidentifier
    private long no_articulo; // Puede ser BigInteger ya que en sql es bigint
    private String cod_barras;
    private double cantidad;
    private boolean articulo_ofertado;
    private double precio_regular;
    private boolean cambio_precio;
    private double precio_vta;
    private double porcent_desc;
    private String user_name;

    // CONSTRUCTORES

    public VentaCanceladaArticulo() {
    }

    public VentaCanceladaArticulo(int id_post, int id_venta_cancel, long no_articulo, String cod_barras,
            double cantidad, boolean articulo_ofertado, double precio_regular, boolean cambio_precio, double precio_vta,
            double porcent_desc, String user_name) {
        this.id_post = id_post;
        this.id_venta_cancel = id_venta_cancel;
        this.no_articulo = no_articulo;
        this.cod_barras = cod_barras;
        this.cantidad = cantidad;
        this.articulo_ofertado = articulo_ofertado;
        this.precio_regular = precio_regular;
        this.cambio_precio = cambio_precio;
        this.precio_vta = precio_vta;
        this.porcent_desc = porcent_desc;
        this.user_name = user_name;
    }

    // SETTERS & GETTERS

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public int getId_venta_cancel() {
        return id_venta_cancel;
    }

    public void setId_venta_cancel(int id_venta_cancel) {
        this.id_venta_cancel = id_venta_cancel;
    }

    public long getNo_articulo() {
        return no_articulo;
    }

    public void setNo_articulo(long no_articulo) {
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

    public boolean isArticulo_ofertado() {
        return articulo_ofertado;
    }

    public void setArticulo_ofertado(boolean articulo_ofertado) {
        this.articulo_ofertado = articulo_ofertado;
    }

    public double getPrecio_regular() {
        return precio_regular;
    }

    public void setPrecio_regular(double precio_regular) {
        this.precio_regular = precio_regular;
    }

    public boolean isCambio_precio() {
        return cambio_precio;
    }

    public void setCambio_precio(boolean cambio_precio) {
        this.cambio_precio = cambio_precio;
    }

    public double getPrecio_vta() {
        return precio_vta;
    }

    public void setPrecio_vta(double precio_vta) {
        this.precio_vta = precio_vta;
    }

    public double getPorcent_desc() {
        return porcent_desc;
    }

    public void setPorcent_desc(double porcent_desc) {
        this.porcent_desc = porcent_desc;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
