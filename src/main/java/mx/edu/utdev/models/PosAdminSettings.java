package mx.edu.utdev.models;

import java.math.BigInteger;

public class PosAdminSettings {
    // VARIABLES GLOBALES
    private char id_setting; // EN EL SCRIPT YA ES CHAR
    private String path_ptr_label;
    private String path_dir_bascula;
    private BigInteger cod_normal; // EN EL SCRIPT ES BIGINT, TAMBIEN PUEDE SER LONG
    private BigInteger cod_pesable;
    private BigInteger cod_nopesable;
    private double iva;
    private String cfdi_user;
    private String cfdi_pwsd;
    private String cfdi_path_txt;
    private String cfdi_path_pdf;

    // CONSTRUCTORES

    public PosAdminSettings() {
    }

    public PosAdminSettings(char id_setting, String path_ptr_label, String path_dir_bascula, BigInteger cod_normal,
            BigInteger cod_pesable, BigInteger cod_nopesable, double iva, String cfdi_user, String cfdi_pwsd,
            String cfdi_path_txt, String cfdi_path_pdf) {
        this.id_setting = id_setting;
        this.path_ptr_label = path_ptr_label;
        this.path_dir_bascula = path_dir_bascula;
        this.cod_normal = cod_normal;
        this.cod_pesable = cod_pesable;
        this.cod_nopesable = cod_nopesable;
        this.iva = iva;
        this.cfdi_user = cfdi_user;
        this.cfdi_pwsd = cfdi_pwsd;
        this.cfdi_path_txt = cfdi_path_txt;
        this.cfdi_path_pdf = cfdi_path_pdf;
    }

    // SETTERS & GETTERS

    public char getId_setting() {
        return id_setting;
    }

    public void setId_setting(char id_setting) {
        this.id_setting = id_setting;
    }

    public String getPath_ptr_label() {
        return path_ptr_label;
    }

    public void setPath_ptr_label(String path_ptr_label) {
        this.path_ptr_label = path_ptr_label;
    }

    public String getPath_dir_bascula() {
        return path_dir_bascula;
    }

    public void setPath_dir_bascula(String path_dir_bascula) {
        this.path_dir_bascula = path_dir_bascula;
    }

    public BigInteger getCod_normal() {
        return cod_normal;
    }

    public void setCod_normal(BigInteger cod_normal) {
        this.cod_normal = cod_normal;
    }

    public BigInteger getCod_pesable() {
        return cod_pesable;
    }

    public void setCod_pesable(BigInteger cod_pesable) {
        this.cod_pesable = cod_pesable;
    }

    public BigInteger getCod_nopesable() {
        return cod_nopesable;
    }

    public void setCod_nopesable(BigInteger cod_nopesable) {
        this.cod_nopesable = cod_nopesable;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getCfdi_user() {
        return cfdi_user;
    }

    public void setCfdi_user(String cfdi_user) {
        this.cfdi_user = cfdi_user;
    }

    public String getCfdi_pwsd() {
        return cfdi_pwsd;
    }

    public void setCfdi_pwsd(String cfdi_pwsd) {
        this.cfdi_pwsd = cfdi_pwsd;
    }

    public String getCfdi_path_txt() {
        return cfdi_path_txt;
    }

    public void setCfdi_path_txt(String cfdi_path_txt) {
        this.cfdi_path_txt = cfdi_path_txt;
    }

    public String getCfdi_path_pdf() {
        return cfdi_path_pdf;
    }

    public void setCfdi_path_pdf(String cfdi_path_pdf) {
        this.cfdi_path_pdf = cfdi_path_pdf;
    }
}
