package mx.edu.utdev.models;

public class DireccionProveedor {

    // VARIABLES GLOBALES
    private int id_proveedor;
    private String calle;
    private String no_int;
    private String no_ext;
    private String colonia;
    private String localidad;
    private short id_entidad;
    private short id_municipio;
    private String pais;
    private String cod_postal;

    // CONSTRUCTORES
    public DireccionProveedor (){}

    public DireccionProveedor(int id_proveedor, String calle, String no_int, String no_ext, String colonia, String localidad, short id_entidad, short id_municipio, String pais, String cod_postal) {
        this.id_proveedor = id_proveedor;
        this.calle = calle;
        this.no_int = no_int;
        this.no_ext = no_ext;
        this.colonia = colonia;
        this.localidad = localidad;
        this.id_entidad = id_entidad;
        this.id_municipio = id_municipio;
        this.pais = pais;
        this.cod_postal = cod_postal;
    }


    // SETTERS & GETTERS

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNo_int() {
        return no_int;
    }

    public void setNo_int(String no_int) {
        this.no_int = no_int;
    }

    public String getNo_ext() {
        return no_ext;
    }

    public void setNo_ext(String no_ext) {
        this.no_ext = no_ext;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public short getId_entidad() {
        return id_entidad;
    }

    public void setId_entidad(short id_entidad) {
        this.id_entidad = id_entidad;
    }

    public short getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(short id_municipio) {
        this.id_municipio = id_municipio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }
}
