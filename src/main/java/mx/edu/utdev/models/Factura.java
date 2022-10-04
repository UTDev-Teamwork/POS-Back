package mx.edu.utdev.models;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Factura {

    // VARIABLES GLOBALES
    private BigInteger id_factura;
    private int id_cliente;
    private Timestamp fecha_remision;
    private String uso_cfdi;
    private String forma_pago;
    private String metodo_pago;
    private String tipo_comprobante;
    private String exportaciones;
    private short id_estatus;
    private String factura_xml;
    private int uuid_sat;

    // CONSTRUCTORES
    public Factura(){}

    public Factura(BigInteger id_factura, int id_cliente, Timestamp fecha_remision, String uso_cfdi, String forma_pago, String metodo_pago, String tipo_comprobante, String exportaciones, short id_estatus, String factura_xml, int uuid_sat) {
        this.id_factura = id_factura;
        this.id_cliente = id_cliente;
        this.fecha_remision = fecha_remision;
        this.uso_cfdi = uso_cfdi;
        this.forma_pago = forma_pago;
        this.metodo_pago = metodo_pago;
        this.tipo_comprobante = tipo_comprobante;
        this.exportaciones = exportaciones;
        this.id_estatus = id_estatus;
        this.factura_xml = factura_xml;
        this.uuid_sat = uuid_sat;
    }

    // SETTERS & GETTERS

    public BigInteger getId_factura() {
        return id_factura;
    }

    public void setId_factura(BigInteger id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Timestamp getFecha_remision() {
        return fecha_remision;
    }

    public void setFecha_remision(Timestamp fecha_remision) {
        this.fecha_remision = fecha_remision;
    }

    public String getUso_cfdi() {
        return uso_cfdi;
    }

    public void setUso_cfdi(String uso_cfdi) {
        this.uso_cfdi = uso_cfdi;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String getExportaciones() {
        return exportaciones;
    }

    public void setExportaciones(String exportaciones) {
        this.exportaciones = exportaciones;
    }

    public short getId_estatus() {
        return id_estatus;
    }

    public void setId_estatus(short id_estatus) {
        this.id_estatus = id_estatus;
    }

    public String getFactura_xml() {
        return factura_xml;
    }

    public void setFactura_xml(String factura_xml) {
        this.factura_xml = factura_xml;
    }

    public int getUuid_sat() {
        return uuid_sat;
    }

    public void setUuid_sat(int uuid_sat) {
        this.uuid_sat = uuid_sat;
    }
}
