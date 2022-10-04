package mx.edu.utdev.models;

import java.sql.Timestamp;

public class InventarioArticulo {

    // VARIABLES GLOBALES
    private String cod_barras;
    private Timestamp fecha_inicial;
    private Timestamp fecha_ultima_act;
    private double inventario_ini;
    private double entradas;
    private double compras;
    private double salidas;
    private double ventas;
    private double sock_actual;

    // CONSTRUCTORES
    public InventarioArticulo(){}

    public InventarioArticulo(String cod_barras, Timestamp fecha_inicial, Timestamp fecha_ultima_act, double inventario_ini, double entradas, double compras, double salidas, double ventas, double sock_actual) {
        this.cod_barras = cod_barras;
        this.fecha_inicial = fecha_inicial;
        this.fecha_ultima_act = fecha_ultima_act;
        this.inventario_ini = inventario_ini;
        this.entradas = entradas;
        this.compras = compras;
        this.salidas = salidas;
        this.ventas = ventas;
        this.sock_actual = sock_actual;
    }

    // SETTERS & GETTERS

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public Timestamp getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(Timestamp fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public Timestamp getFecha_ultima_act() {
        return fecha_ultima_act;
    }

    public void setFecha_ultima_act(Timestamp fecha_ultima_act) {
        this.fecha_ultima_act = fecha_ultima_act;
    }

    public double getInventario_ini() {
        return inventario_ini;
    }

    public void setInventario_ini(double inventario_ini) {
        this.inventario_ini = inventario_ini;
    }

    public double getEntradas() {
        return entradas;
    }

    public void setEntradas(double entradas) {
        this.entradas = entradas;
    }

    public double getCompras() {
        return compras;
    }

    public void setCompras(double compras) {
        this.compras = compras;
    }

    public double getSalidas() {
        return salidas;
    }

    public void setSalidas(double salidas) {
        this.salidas = salidas;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getSock_actual() {
        return sock_actual;
    }

    public void setSock_actual(double sock_actual) {
        this.sock_actual = sock_actual;
    }
}
