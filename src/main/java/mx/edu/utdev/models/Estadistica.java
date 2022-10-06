package mx.edu.utdev.models;

public class Estadistica {

    // VARIABLES GLOBALES
    private short anio;
    private String cod_barras;
    private double ene;
    private double feb;
    private double mar;
    private double abr;
    private double may;
    private double jun;
    private double jul;
    private double ago;
    private double sep;
    private double oct;
    private double nov;
    private double dic;

    // CONSTRUCTORES
    public Estadistica (){}

    public Estadistica(short anio, String cod_barras, double ene, double feb, double mar, double abr, double may, double jun, double jul, double ago, double sep, double oct, double nov, double dic) {
        this.anio = anio;
        this.cod_barras = cod_barras;
        this.ene = ene;
        this.feb = feb;
        this.mar = mar;
        this.abr = abr;
        this.may = may;
        this.jun = jun;
        this.jul = jul;
        this.ago = ago;
        this.sep = sep;
        this.oct = oct;
        this.nov = nov;
        this.dic = dic;
    }

    // SETTERS & GETTERS

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getEne() {
        return ene;
    }

    public void setEne(double ene) {
        this.ene = ene;
    }

    public double getFeb() {
        return feb;
    }

    public void setFeb(double feb) {
        this.feb = feb;
    }

    public double getMar() {
        return mar;
    }

    public void setMar(double mar) {
        this.mar = mar;
    }

    public double getAbr() {
        return abr;
    }

    public void setAbr(double abr) {
        this.abr = abr;
    }

    public double getMay() {
        return may;
    }

    public void setMay(double may) {
        this.may = may;
    }

    public double getJun() {
        return jun;
    }

    public void setJun(double jun) {
        this.jun = jun;
    }

    public double getJul() {
        return jul;
    }

    public void setJul(double jul) {
        this.jul = jul;
    }

    public double getAgo() {
        return ago;
    }

    public void setAgo(double ago) {
        this.ago = ago;
    }

    public double getSep() {
        return sep;
    }

    public void setSep(double sep) {
        this.sep = sep;
    }

    public double getOct() {
        return oct;
    }

    public void setOct(double oct) {
        this.oct = oct;
    }

    public double getNov() {
        return nov;
    }

    public void setNov(double nov) {
        this.nov = nov;
    }

    public double getDic() {
        return dic;
    }

    public void setDic(double dic) {
        this.dic = dic;
    }
}
