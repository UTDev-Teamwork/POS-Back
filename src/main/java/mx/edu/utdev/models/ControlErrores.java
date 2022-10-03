package mx.edu.utdev.models;

import java.sql.Timestamp;

public class ControlErrores {

    // VARIABLES GLOBALES
    private int id_error;
    private String aplicacion;
    private String host;
    private String tipo;
    private String origen;
    private String mensaje;
    private String usuario;
    private int cod_status;
    private Timestamp time_utc;
    private int secuencia;
    private String all_xml; // DB - NTEXT

    // CONSTRUCTORES
    public ControlErrores(){
    }

    public ControlErrores(int id_error, String aplicacion, String host, String tipo, String origen, String mensaje, String usuario, int cod_status, Timestamp time_utc, int secuencia, String all_xml) {
        this.id_error = id_error;
        this.aplicacion = aplicacion;
        this.host = host;
        this.tipo = tipo;
        this.origen = origen;
        this.mensaje = mensaje;
        this.usuario = usuario;
        this.cod_status = cod_status;
        this.time_utc = time_utc;
        this.secuencia = secuencia;
        this.all_xml = all_xml;
    }


    // SETTERS & GETTERS

    public int getId_error() {
        return id_error;
    }

    public void setId_error(int id_error) {
        this.id_error = id_error;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCod_status() {
        return cod_status;
    }

    public void setCod_status(int cod_status) {
        this.cod_status = cod_status;
    }

    public Timestamp getTime_utc() {
        return time_utc;
    }

    public void setTime_utc(Timestamp time_utc) {
        this.time_utc = time_utc;
    }

    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    public String getAll_xml() {
        return all_xml;
    }

    public void setAll_xml(String all_xml) {
        this.all_xml = all_xml;
    }
}
