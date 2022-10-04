package mx.edu.utdev.models;

import java.math.BigInteger;
import java.sql.Timestamp;

public class InventarioCaptura {

    // VARIABLES GLOBALES
    private int id_captura;
    private int id_inventario;
    private BigInteger num_captura;
    private String cod_barras;
    private Timestamp fecha_captura;
    private double cant_cja;
    private double cant_pza;
    private boolean upload;

    // CONSTRUCTORES
    public InventarioCaptura(){}

    public InventarioCaptura(int id_captura, int id_inventario, BigInteger num_captura, String cod_barras, Timestamp fecha_captura, double cant_cja, double cant_pza, boolean upload) {
        this.id_captura = id_captura;
        this.id_inventario = id_inventario;
        this.num_captura = num_captura;
        this.cod_barras = cod_barras;
        this.fecha_captura = fecha_captura;
        this.cant_cja = cant_cja;
        this.cant_pza = cant_pza;
        this.upload = upload;
    }

    // SETTERS & GETTERS

    public int getId_captura() {
        return id_captura;
    }

    public void setId_captura(int id_captura) {
        this.id_captura = id_captura;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public BigInteger getNum_captura() {
        return num_captura;
    }

    public void setNum_captura(BigInteger num_captura) {
        this.num_captura = num_captura;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public Timestamp getFecha_captura() {
        return fecha_captura;
    }

    public void setFecha_captura(Timestamp fecha_captura) {
        this.fecha_captura = fecha_captura;
    }

    public double getCant_cja() {
        return cant_cja;
    }

    public void setCant_cja(double cant_cja) {
        this.cant_cja = cant_cja;
    }

    public double getCant_pza() {
        return cant_pza;
    }

    public void setCant_pza(double cant_pza) {
        this.cant_pza = cant_pza;
    }

    public boolean isUpload() {
        return upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }
}
