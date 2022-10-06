package mx.edu.utdev.models;

import java.math.BigInteger;
import java.sql.Timestamp;

public class FacturaVenta {

    // VARIABLES GLOBALES
    private int id_pos;
    private int id_venta;
    private BigInteger id_factura;
    private Timestamp fecha_registro;

    // CONSTRUCTORES
    public FacturaVenta(){}

    public FacturaVenta(int id_pos, int id_venta, BigInteger id_factura, Timestamp fecha_registro) {
        this.id_pos = id_pos;
        this.id_venta = id_venta;
        this.id_factura = id_factura;
        this.fecha_registro = fecha_registro;
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

    public BigInteger getId_factura() {
        return id_factura;
    }

    public void setId_factura(BigInteger id_factura) {
        this.id_factura = id_factura;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
