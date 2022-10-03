package mx.edu.utdev.models;

public class Proveedor {
    // VARIABLES GLOBALES
    private int id_proveedor; // en sql es uniqueidentifier
    private String rfc;
    private String razon_social;
    private String nombre_contacto;
    private String tel_principal;
    private String tel_movil;
    private String email;
    private String estatus;
    private String fecha_registro;

    // CONSTRUCTORES

    public Proveedor() {
    }

    public Proveedor(int id_proveedor, String rfc, String razon_social, String nombre_contacto, String tel_principal,
            String tel_movil, String email, String estatus, String fecha_registro) {
        this.id_proveedor = id_proveedor;
        this.rfc = rfc;
        this.razon_social = razon_social;
        this.nombre_contacto = nombre_contacto;
        this.tel_principal = tel_principal;
        this.tel_movil = tel_movil;
        this.email = email;
        this.estatus = estatus;
        this.fecha_registro = fecha_registro;
    }

    // SETTERS & GETTERS

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    public String getTel_principal() {
        return tel_principal;
    }

    public void setTel_principal(String tel_principal) {
        this.tel_principal = tel_principal;
    }

    public String getTel_movil() {
        return tel_movil;
    }

    public void setTel_movil(String tel_movil) {
        this.tel_movil = tel_movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
