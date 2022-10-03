package mx.edu.utdev.models;

import java.sql.Timestamp;

public class Usuario {
    // VARIABLES GLOBALES
    private String user_name;
    private String password;
    private String tipo_usuario;
    private boolean enable; // EN EL SCRIPT ES BOOLEAN
    private short user_code_bascula; // EN EL SCRIPT ES SMALLINT, PUEDE SER INT
    private Timestamp fecha_registro; // EN EL SCRIPT ES TIMESTAMP

    // CONSTRUCTORES

    public Usuario() {
    }

    public Usuario(String user_name, String password, String tipo_usuario, boolean enable, short user_code_bascula,
            Timestamp fecha_registro) {
        this.user_name = user_name;
        this.password = password;
        this.tipo_usuario = tipo_usuario;
        this.enable = enable;
        this.user_code_bascula = user_code_bascula;
        this.fecha_registro = fecha_registro;
    }

    // SETTERS & GETTERS

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public short getUser_code_bascula() {
        return user_code_bascula;
    }

    public void setUser_code_bascula(short user_code_bascula) {
        this.user_code_bascula = user_code_bascula;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
