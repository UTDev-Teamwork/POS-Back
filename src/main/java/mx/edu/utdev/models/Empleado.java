package mx.edu.utdev.models;

import java.sql.Timestamp;

public class Empleado {

    // VARIABLES GLOBALES
    private int id_empleado;
    private String nombre;
    private String a_paterno;
    private String a_materno;
    private String user_name;
    private Timestamp fecha_registro;

    // CONSTRUCTORES
    public Empleado(){}

    public Empleado(int id_empleado, String nombre, String a_paterno, String a_materno, String user_name, Timestamp fecha_registro) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.a_paterno = a_paterno;
        this.a_materno = a_materno;
        this.user_name = user_name;
        this.fecha_registro = fecha_registro;
    }


    // SETTERS & GETTERS

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getA_paterno() {
        return a_paterno;
    }

    public void setA_paterno(String a_paterno) {
        this.a_paterno = a_paterno;
    }

    public String getA_materno() {
        return a_materno;
    }

    public void setA_materno(String a_materno) {
        this.a_materno = a_materno;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
