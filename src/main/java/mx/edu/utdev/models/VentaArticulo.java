package mx.edu.utdev.models;

public class VentaArticulo {
    // VARIABLES GLOBALES
    private int id_pos; // en sql es int
    private int id_venta; // en sql es uniqueidentifier
    private long no_articulo; // Puede ser BigInteger ya que en sql es bigint
    private String cod_barras;
    private short user_code_bascula; // Puede ser int ya que en sql es smallint
    private double cantidad;
    private boolean articulo_ofertado; // en sql es bit
    private double precio_regular;
    private boolean cambio_precio; // en sql es bit
    private double iva;
    private double precio_vta;
    private double porcent_desc;
    private double cant_devuelta;
    private String user_name;
    private int id_promo; // en sql es uniqueidentifier
    private short no_promo_aplicado; // Puede ser int ya que en sql es smallint

    // CONSTRUCTORES

    public VentaArticulo() {
    }

    public VentaArticulo(int id_pos, int id_venta, long no_articulo, String cod_barras, short user_code_bascula,
            double cantidad, boolean articulo_ofertado, double precio_regular, boolean cambio_precio, double iva,
            double precio_vta, double porcent_desc, double cant_devuelta, String user_name, int id_promo,
            short no_promo_aplicado) {
        this.id_pos = id_pos;
        this.id_venta = id_venta;
        this.no_articulo = no_articulo;
        this.cod_barras = cod_barras;
        this.user_code_bascula = user_code_bascula;
        this.cantidad = cantidad;
        this.articulo_ofertado = articulo_ofertado;
        this.precio_regular = precio_regular;
        this.cambio_precio = cambio_precio;
        this.iva = iva;
        this.precio_vta = precio_vta;
        this.porcent_desc = porcent_desc;
        this.cant_devuelta = cant_devuelta;
        this.user_name = user_name;
        this.id_promo = id_promo;
        this.no_promo_aplicado = no_promo_aplicado;
    }

    // SETTERS & GETTERS

    public int getId_pos() {
        return id_pos;
    }

    public void setId_pos(int id_pos) {
        this.id_pos = id_pos;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
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

    public short getUser_code_bascula() {
        return user_code_bascula;
    }

    public void setUser_code_bascula(short user_code_bascula) {
        this.user_code_bascula = user_code_bascula;
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

    public double getPorcent_desc() {
        return porcent_desc;
    }

    public void setPorcent_desc(double porcent_desc) {
        this.porcent_desc = porcent_desc;
    }

    public double getCant_devuelta() {
        return cant_devuelta;
    }

    public void setCant_devuelta(double cant_devuelta) {
        this.cant_devuelta = cant_devuelta;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getId_promo() {
        return id_promo;
    }

    public void setId_promo(int id_promo) {
        this.id_promo = id_promo;
    }

    public short getNo_promo_aplicado() {
        return no_promo_aplicado;
    }

    public void setNo_promo_aplicado(short no_promo_aplicado) {
        this.no_promo_aplicado = no_promo_aplicado;
    }
}
