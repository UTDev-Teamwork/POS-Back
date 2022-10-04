package mx.edu.utdev.models;

import java.sql.Timestamp;

public class Compra {

    // VARIABLES GLOBALES
    private int id_compra;
    private int id_proveedor;
    private String no_factura;
    private Timestamp fecha_compra;
    private int id_pedido;
    private boolean cancelada;
    private Timestamp fecha_cancelacion;
    private short no_entrada;
    private String observaciones;

    // CONSTRUCTORES
    public Compra(){
    }

    public Compra(int id_compra, int id_proveedor, String no_factura, Timestamp fecha_compra, int id_pedido, boolean cancelada, Timestamp fecha_cancelacion, short no_entrada, String observaciones) {
        this.id_compra = id_compra;
        this.id_proveedor = id_proveedor;
        this.no_factura = no_factura;
        this.fecha_compra = fecha_compra;
        this.id_pedido = id_pedido;
        this.cancelada = cancelada;
        this.fecha_cancelacion = fecha_cancelacion;
        this.no_entrada = no_entrada;
        this.observaciones = observaciones;
    }


    // SETTERS & GETTERS
    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNo_factura() {
        return no_factura;
    }

    public void setNo_factura(String no_factura) {
        this.no_factura = no_factura;
    }

    public Timestamp getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Timestamp fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    public Timestamp getFecha_cancelacion() {
        return fecha_cancelacion;
    }

    public void setFecha_cancelacion(Timestamp fecha_cancelacion) {
        this.fecha_cancelacion = fecha_cancelacion;
    }

    public short getNo_entrada() {
        return no_entrada;
    }

    public void setNo_entrada(short no_entrada) {
        this.no_entrada = no_entrada;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
