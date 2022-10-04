package mx.edu.utdev.models;

public class InventarioFisicoArticulo {

    // VARIABLES GLOBALES
    private String cod_barras;
    private int id_inventario_fisico;
    private double stock_estimado;
    private double stock_fisico;

    // CONSTRUCTORES
    public InventarioFisicoArticulo(){}

    public InventarioFisicoArticulo(String cod_barras, int id_inventario_fisico, double stock_estimado, double stock_fisico) {
        this.cod_barras = cod_barras;
        this.id_inventario_fisico = id_inventario_fisico;
        this.stock_estimado = stock_estimado;
        this.stock_fisico = stock_fisico;
    }

    // SETTERS & GETTERS

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public int getId_inventario_fisico() {
        return id_inventario_fisico;
    }

    public void setId_inventario_fisico(int id_inventario_fisico) {
        this.id_inventario_fisico = id_inventario_fisico;
    }

    public double getStock_estimado() {
        return stock_estimado;
    }

    public void setStock_estimado(double stock_estimado) {
        this.stock_estimado = stock_estimado;
    }

    public double getStock_fisico() {
        return stock_fisico;
    }

    public void setStock_fisico(double stock_fisico) {
        this.stock_fisico = stock_fisico;
    }
}
