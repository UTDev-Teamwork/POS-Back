package mx.edu.utdev.models;

import java.sql.Timestamp;

public class UsuarioPermiso {
    // VARIABLES GLOBALES
    private String user_name;
    private String id_permiso; // EN EL SCRIPT ES VARCHAR
    private double vlaor_num;
    private Timestamp fecha_registro; // EN EL SCRIPT ES TIMESTAMP

    // CONSTRUCTORES

    public UsuarioPermiso() {
    }

    public UsuarioPermiso(String user_name, String id_permiso, double vlaor_num, Timestamp fecha_registro) {
        this.user_name = user_name;
        this.id_permiso = id_permiso;
        this.vlaor_num = vlaor_num;
        this.fecha_registro = fecha_registro;
    }

    // SETTERS & GETTERS

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(String id_permiso) {
        this.id_permiso = id_permiso;
    }

    public double getVlaor_num() {
        return vlaor_num;
    }

    public void setVlaor_num(double vlaor_num) {
        this.vlaor_num = vlaor_num;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
