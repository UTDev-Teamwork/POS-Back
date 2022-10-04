package mx.edu.utdev.models;

import java.sql.Timestamp;

public class Empresa {

    // VARIABLES GLOBALES
    private String rfc;
    private String razon_social;
    private String representante;
    private String calle;
    private String no_ext;
    private String no_int;
    private String colonia;
    private String municipio;
    private String estado;
    private String pais;
    private String codigo_postal;
    private String tel_principal;
    private String e_mail;
    private byte[] imagen;
    private Timestamp fecha_registro;

    // CONSTRUCTORES
    public Empresa(){}

    public Empresa(String rfc, String razon_social, String representante, String calle, String no_ext, String no_int, String colonia, String municipio, String estado, String pais, String codigo_postal, String tel_principal, String e_mail, byte[] imagen, Timestamp fecha_registro) {
        this.rfc = rfc;
        this.razon_social = razon_social;
        this.representante = representante;
        this.calle = calle;
        this.no_ext = no_ext;
        this.no_int = no_int;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
        this.pais = pais;
        this.codigo_postal = codigo_postal;
        this.tel_principal = tel_principal;
        this.e_mail = e_mail;
        this.imagen = imagen;
        this.fecha_registro = fecha_registro;
    }


    // SETTERS & GETTERS

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNo_ext() {
        return no_ext;
    }

    public void setNo_ext(String no_ext) {
        this.no_ext = no_ext;
    }

    public String getNo_int() {
        return no_int;
    }

    public void setNo_int(String no_int) {
        this.no_int = no_int;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getTel_principal() {
        return tel_principal;
    }

    public void setTel_principal(String tel_principal) {
        this.tel_principal = tel_principal;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
