package mx.edu.utdev.models;

public class EntradaArticulo {

    // VARIABLES GLOBALES
    private int id_entrada;
    private String cod_barras;
    private double cant_ent;
    private double cant_pza;
    private double cant_reg;
    private double costo;

    // CONSTRUCTORES
    public EntradaArticulo(){}

    public EntradaArticulo(int id_entrada, String cod_barras, double cant_ent, double cant_pza, double cant_reg, double costo) {
        this.id_entrada = id_entrada;
        this.cod_barras = cod_barras;
        this.cant_ent = cant_ent;
        this.cant_pza = cant_pza;
        this.cant_reg = cant_reg;
        this.costo = costo;
    }

    // SETTERS & GETTERS

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getCant_ent() {
        return cant_ent;
    }

    public void setCant_ent(double cant_ent) {
        this.cant_ent = cant_ent;
    }

    public double getCant_pza() {
        return cant_pza;
    }

    public void setCant_pza(double cant_pza) {
        this.cant_pza = cant_pza;
    }

    public double getCant_reg() {
        return cant_reg;
    }

    public void setCant_reg(double cant_reg) {
        this.cant_reg = cant_reg;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
