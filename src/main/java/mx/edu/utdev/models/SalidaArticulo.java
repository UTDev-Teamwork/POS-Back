package mx.edu.utdev.models;

public class SalidaArticulo {
    // VARIABLES GLOBALES
    private char id_salid; // EN EL SCRIPT ES CHAR
    private String cod_barras;
    private double cant_sal;
    private double cant_pza;
    private double cant_reg;
    private double costo;

    // CONSTRUCTORES

    public SalidaArticulo() {
    }

    public SalidaArticulo(char id_salid, String cod_barras, double cant_sal, double cant_pza, double cant_reg,
            double costo) {
        this.id_salid = id_salid;
        this.cod_barras = cod_barras;
        this.cant_sal = cant_sal;
        this.cant_pza = cant_pza;
        this.cant_reg = cant_reg;
        this.costo = costo;
    }

    // SETTERS & GETTERS

    public char getId_salid() {
        return id_salid;
    }

    public void setId_salid(char id_salid) {
        this.id_salid = id_salid;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getCant_sal() {
        return cant_sal;
    }

    public void setCant_sal(double cant_sal) {
        this.cant_sal = cant_sal;
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
