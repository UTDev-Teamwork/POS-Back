package mx.edu.utdev.models;

public class ProductosSinIva {
    // VARIABLES GLOBALES
    private String cod_barras;
    private String descripcion;

    // CONSTRUCTORES

    public ProductosSinIva() {
    }

    public ProductosSinIva(String cod_barras, String descripcion) {
        this.cod_barras = cod_barras;
        this.descripcion = descripcion;
    }

    // SETTERS & GETTERS

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
