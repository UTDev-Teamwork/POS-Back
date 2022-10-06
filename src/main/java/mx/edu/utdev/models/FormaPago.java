package mx.edu.utdev.models;

import java.sql.Timestamp;

public class FormaPago {

    // VARIABLES GLOBALES
    private String id;
    private String descripcion;
    private String bancarizado;
    private String num_operacion;
    private String rfc_ordenante;
    private String cuenta_ordenante;
    private String rfc_beneficiario;
    private String cuenta_beneficiario;
    private String tipo_pago;
    private Timestamp fecha_inicio;
    private Timestamp fecha_fin;

    // CONSTRUCTORES
    public FormaPago(){}

    public FormaPago(String id, String descripcion, String bancarizado, String num_operacion, String rfc_ordenante, String cuenta_ordenante, String rfc_beneficiario, String cuenta_beneficiario, String tipo_pago, Timestamp fecha_inicio, Timestamp fecha_fin) {
        this.id = id;
        this.descripcion = descripcion;
        this.bancarizado = bancarizado;
        this.num_operacion = num_operacion;
        this.rfc_ordenante = rfc_ordenante;
        this.cuenta_ordenante = cuenta_ordenante;
        this.rfc_beneficiario = rfc_beneficiario;
        this.cuenta_beneficiario = cuenta_beneficiario;
        this.tipo_pago = tipo_pago;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    // SETTERS & GETTERS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBancarizado() {
        return bancarizado;
    }

    public void setBancarizado(String bancarizado) {
        this.bancarizado = bancarizado;
    }

    public String getNum_operacion() {
        return num_operacion;
    }

    public void setNum_operacion(String num_operacion) {
        this.num_operacion = num_operacion;
    }

    public String getRfc_ordenante() {
        return rfc_ordenante;
    }

    public void setRfc_ordenante(String rfc_ordenante) {
        this.rfc_ordenante = rfc_ordenante;
    }

    public String getCuenta_ordenante() {
        return cuenta_ordenante;
    }

    public void setCuenta_ordenante(String cuenta_ordenante) {
        this.cuenta_ordenante = cuenta_ordenante;
    }

    public String getRfc_beneficiario() {
        return rfc_beneficiario;
    }

    public void setRfc_beneficiario(String rfc_beneficiario) {
        this.rfc_beneficiario = rfc_beneficiario;
    }

    public String getCuenta_beneficiario() {
        return cuenta_beneficiario;
    }

    public void setCuenta_beneficiario(String cuenta_beneficiario) {
        this.cuenta_beneficiario = cuenta_beneficiario;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public Timestamp getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Timestamp fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Timestamp getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Timestamp fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
