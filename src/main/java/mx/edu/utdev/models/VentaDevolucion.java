package mx.edu.utdev.models;

import java.math.BigInteger;
import java.sql.Timestamp;

public class VentaDevolucion {
    // VARIABLES GLOBALES
    private char id_devolucion; // EN EL SCRIPT ES CHAR
    private BigInteger folio; // EN EL SCRIPT ES BIGINT
    private int id_post;
    private char id_venta; // EN EL SCRIPT ES CHAR
    private Timestamp fecha_dev; // EN EL SCRIPT ES TIMESTAMP
    private String vendedor;
    private String supervisor;
    private double cant_dev;
    private boolean upload; // EN EL SCRIPT ES BOOLEAN

    // CONSTRUCTORES

    public VentaDevolucion() {
    }

    public VentaDevolucion(char id_devolucion, BigInteger folio, int id_post, char id_venta, Timestamp fecha_dev,
            String vendedor, String supervisor, double cant_dev, boolean upload) {
        this.id_devolucion = id_devolucion;
        this.folio = folio;
        this.id_post = id_post;
        this.id_venta = id_venta;
        this.fecha_dev = fecha_dev;
        this.vendedor = vendedor;
        this.supervisor = supervisor;
        this.cant_dev = cant_dev;
        this.upload = upload;
    }

    // SETTERS & GETTERS

    public char getId_devolucion() {
        return id_devolucion;
    }

    public void setId_devolucion(char id_devolucion) {
        this.id_devolucion = id_devolucion;
    }

    public BigInteger getFolio() {
        return folio;
    }

    public void setFolio(BigInteger folio) {
        this.folio = folio;
    }

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public char getId_venta() {
        return id_venta;
    }

    public void setId_venta(char id_venta) {
        this.id_venta = id_venta;
    }

    public Timestamp getFecha_dev() {
        return fecha_dev;
    }

    public void setFecha_dev(Timestamp fecha_dev) {
        this.fecha_dev = fecha_dev;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public double getCant_dev() {
        return cant_dev;
    }

    public void setCant_dev(double cant_dev) {
        this.cant_dev = cant_dev;
    }

    public boolean isUpload() {
        return upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }
}
