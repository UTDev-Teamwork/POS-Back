package mx.edu.utdev.models;

import java.sql.Timestamp;

public class OrdenArticulo {

    // VARIABLES GLOBALES
    private int id_pedido;
    private short no_articulo;
    private String cod_barras;
    private String cod_anexo;
    private double cantidad;
    private double precio_articulo;
    private double por_surtir;
    private double por_surtir_pzas;
    private Timestamp fecha_regsitro;

    // CONSTRUCTORES
    public OrdenArticulo(){}

    public OrdenArticulo(int id_pedido, short no_articulo, String cod_barras, String cod_anexo, double cantidad, double precio_articulo, double por_surtir, double por_surtir_pzas, Timestamp fecha_regsitro) {
        this.id_pedido = id_pedido;
        this.no_articulo = no_articulo;
        this.cod_barras = cod_barras;
        this.cod_anexo = cod_anexo;
        this.cantidad = cantidad;
        this.precio_articulo = precio_articulo;
        this.por_surtir = por_surtir;
        this.por_surtir_pzas = por_surtir_pzas;
        this.fecha_regsitro = fecha_regsitro;
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

    public double getPor_surtir() {
        return por_surtir;
    }

    public void setPor_surtir(double por_surtir) {
        this.por_surtir = por_surtir;
    }

    public double getPor_surtir_pzas() {
        return por_surtir_pzas;
    }

    public void setPor_surtir_pzas(double por_surtir_pzas) {
        this.por_surtir_pzas = por_surtir_pzas;
    }

    public Timestamp getFecha_regsitro() {
        return fecha_regsitro;
    }

    public void setFecha_regsitro(Timestamp fecha_regsitro) {
        this.fecha_regsitro = fecha_regsitro;
    }
}
