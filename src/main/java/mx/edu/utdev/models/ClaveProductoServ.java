package mx.edu.utdev.models;

import java.sql.Timestamp;

public class ClaveProductoServ {

    // VARIABLES GLOBALES
    private String id;
    private String descripcion;
    private String traslado;
    private String ieps_traslado;
    private short franja_fronteriza;
    private String palabras_similares;
    private Timestamp fecha_inicio;
    private Timestamp fecha_fin;

    // CONSTRUCTORES
    public ClaveProductoServ(){
    }

    public ClaveProductoServ(String id, String descripcion, String traslado, String ieps_traslado, short franja_fronteriza, String palabras_similares, Timestamp fecha_inicio, Timestamp fecha_fin) {
        this.id = id;
        this.descripcion = descripcion;
        this.traslado = traslado;
        this.ieps_traslado = ieps_traslado;
        this.franja_fronteriza = franja_fronteriza;
        this.palabras_similares = palabras_similares;
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

    public String getTraslado() {
        return traslado;
    }

    public void setTraslado(String traslado) {
        this.traslado = traslado;
    }

    public String getIeps_traslado() {
        return ieps_traslado;
    }

    public void setIeps_traslado(String ieps_traslado) {
        this.ieps_traslado = ieps_traslado;
    }

    public short getFranja_fronteriza() {
        return franja_fronteriza;
    }

    public void setFranja_fronteriza(short franja_fronteriza) {
        this.franja_fronteriza = franja_fronteriza;
    }

    public String getPalabras_similares() {
        return palabras_similares;
    }

    public void setPalabras_similares(String palabras_similares) {
        this.palabras_similares = palabras_similares;
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
