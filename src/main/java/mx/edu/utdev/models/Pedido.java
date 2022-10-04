package mx.edu.utdev.models;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Pedido {

    // VARIABLES GLOBALES
    private int id_pedido;
    private BigInteger num_pedido;
    private Timestamp fecha_pedido;
    private int id_proveedor;
    private String status_pedido;
    private short no_dias;
    private Timestamp fecha_autorizado;
    private String plan;
    private short anio;
    private short mes;

    // CONSTRUCTORES
    public Pedido(){}

    public Pedido(int id_pedido, BigInteger num_pedido, Timestamp fecha_pedido, int id_proveedor, String status_pedido, short no_dias, Timestamp fecha_autorizado, String plan, short anio, short mes) {
        this.id_pedido = id_pedido;
        this.num_pedido = num_pedido;
        this.fecha_pedido = fecha_pedido;
        this.id_proveedor = id_proveedor;
        this.status_pedido = status_pedido;
        this.no_dias = no_dias;
        this.fecha_autorizado = fecha_autorizado;
        this.plan = plan;
        this.anio = anio;
        this.mes = mes;
    }

    // SETTERS & GETTERS

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public BigInteger getNum_pedido() {
        return num_pedido;
    }

    public void setNum_pedido(BigInteger num_pedido) {
        this.num_pedido = num_pedido;
    }

    public Timestamp getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Timestamp fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getStatus_pedido() {
        return status_pedido;
    }

    public void setStatus_pedido(String status_pedido) {
        this.status_pedido = status_pedido;
    }

    public short getNo_dias() {
        return no_dias;
    }

    public void setNo_dias(short no_dias) {
        this.no_dias = no_dias;
    }

    public Timestamp getFecha_autorizado() {
        return fecha_autorizado;
    }

    public void setFecha_autorizado(Timestamp fecha_autorizado) {
        this.fecha_autorizado = fecha_autorizado;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    public short getMes() {
        return mes;
    }

    public void setMes(short mes) {
        this.mes = mes;
    }
}
