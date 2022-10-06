package mx.edu.utdev.models;

public class PedidoArticulo {

    // VARIABLES GLOBALES
    private int id_pedido;
    private short no_articulo;
    private String cod_barras;
    private String cod_anexo;
    private double cant_original;
    private double cantidad;
    private double precio_articulo;
    private double sugerido;

    // CONSTRUCTORES
    public PedidoArticulo(){}

    public PedidoArticulo(int id_pedido, short no_articulo, String cod_barras, String cod_anexo, double cant_original, double cantidad, double precio_articulo, double sugerido) {
        this.id_pedido = id_pedido;
        this.no_articulo = no_articulo;
        this.cod_barras = cod_barras;
        this.cod_anexo = cod_anexo;
        this.cant_original = cant_original;
        this.cantidad = cantidad;
        this.precio_articulo = precio_articulo;
        this.sugerido = sugerido;
    }

    // SETTERS & GETTERS

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public short getNo_articulo() {
        return no_articulo;
    }

    public void setNo_articulo(short no_articulo) {
        this.no_articulo = no_articulo;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getCod_anexo() {
        return cod_anexo;
    }

    public void setCod_anexo(String cod_anexo) {
        this.cod_anexo = cod_anexo;
    }

    public double getCant_original() {
        return cant_original;
    }

    public void setCant_original(double cant_original) {
        this.cant_original = cant_original;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_articulo() {
        return precio_articulo;
    }

    public void setPrecio_articulo(double precio_articulo) {
        this.precio_articulo = precio_articulo;
    }

    public double getSugerido() {
        return sugerido;
    }

    public void setSugerido(double sugerido) {
        this.sugerido = sugerido;
    }
}
