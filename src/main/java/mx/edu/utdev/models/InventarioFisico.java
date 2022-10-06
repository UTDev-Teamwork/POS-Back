package mx.edu.utdev.models;

import java.sql.Timestamp;

public class InventarioFisico {

    // VARIABLES GLOBALES
    private int id_inventario_fisico;
    private int id_proveedor;
    private String user_name;
    private Timestamp fecha_ini;
    private Timestamp fecha_fin;
    private Timestamp fecha_registro;

    // CONSTRUCTORES
    public  InventarioFisico(){}

    public InventarioFisico(int id_inventario_fisico, int id_proveedor, String user_name, Timestamp fecha_ini, Timestamp fecha_fin, Timestamp fecha_registro) {
        this.id_inventario_fisico = id_inventario_fisico;
        this.id_proveedor = id_proveedor;
        this.user_name = user_name;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
        this.fecha_registro = fecha_registro;
    }

    // SETTERS & GETTERS

    public int getId_inventario_fisico() {
        return id_inventario_fisico;
    }

    public void setId_inventario_fisico(int id_inventario_fisico) {
        this.id_inventario_fisico = id_inventario_fisico;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Timestamp getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Timestamp fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Timestamp getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Timestamp fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
