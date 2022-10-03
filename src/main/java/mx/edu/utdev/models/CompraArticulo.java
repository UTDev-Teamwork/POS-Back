package mx.edu.utdev.models;

public class CompraArticulo {

    // VARIABLES GLOBALES
    private int id_compra;
    private String cod_barras;
    private short num_articulo;
    private double cant_cja;
    private double cant_pza;
    private double precio_compra;
    private short no_captura;
    private double no_entrega;

    // CONSTRUCTORES
    public CompraArticulo(){
    }

    public CompraArticulo(int id_compra, String cod_barras, short num_articulo, double cant_cja, double cant_pza, double precio_compra, short no_captura, double no_entrega) {
        this.id_compra = id_compra;
        this.cod_barras = cod_barras;
        this.num_articulo = num_articulo;
        this.cant_cja = cant_cja;
        this.cant_pza = cant_pza;
        this.precio_compra = precio_compra;
        this.no_captura = no_captura;
        this.no_entrega = no_entrega;
    }


    // SETTERS & GETTERS
    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public short getNum_articulo() {
        return num_articulo;
    }

    public void setNum_articulo(short num_articulo) {
        this.num_articulo = num_articulo;
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

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public short getNo_captura() {
        return no_captura;
    }

    public void setNo_captura(short no_captura) {
        this.no_captura = no_captura;
    }

    public double getNo_entrega() {
        return no_entrega;
    }

    public void setNo_entrega(double no_entrega) {
        this.no_entrega = no_entrega;
    }
}
