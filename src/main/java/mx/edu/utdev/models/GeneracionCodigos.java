package mx.edu.utdev.models;

import java.math.BigInteger;

public class GeneracionCodigos {

    // VARIABLES GLOBALES
    private BigInteger id_gencode;
    private double cod_barras;
    private double cod_pesable;
    private double cod_inpesable;

    // CONSTRUCTORES
    public GeneracionCodigos(){}

    public GeneracionCodigos(BigInteger id_gencode, double cod_barras, double cod_pesable, double cod_inpesable) {
        this.id_gencode = id_gencode;
        this.cod_barras = cod_barras;
        this.cod_pesable = cod_pesable;
        this.cod_inpesable = cod_inpesable;
    }

    // SETTERS & GETTERS

    public BigInteger getId_gencode() {
        return id_gencode;
    }

    public void setId_gencode(BigInteger id_gencode) {
        this.id_gencode = id_gencode;
    }

    public double getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(double cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getCod_pesable() {
        return cod_pesable;
    }

    public void setCod_pesable(double cod_pesable) {
        this.cod_pesable = cod_pesable;
    }

    public double getCod_inpesable() {
        return cod_inpesable;
    }

    public void setCod_inpesable(double cod_inpesable) {
        this.cod_inpesable = cod_inpesable;
    }
}
