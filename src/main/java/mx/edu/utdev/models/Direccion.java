package mx.edu.utdev.models;

<<<<<<< HEAD
import java.math.BigInteger;
import java.sql.Timestamp;

=======
>>>>>>> 9e2e972057fd3f7b1d073fb06a5e2324608bfa3f
public class Direccion {

    // VARIABLES GLOBALES
    private int id_direccion;
    private int id_cliente;
    private short id_municipio;
<<<<<<< HEAD
    private short id_endidad;
=======
    private short id_entidad;
>>>>>>> 9e2e972057fd3f7b1d073fb06a5e2324608bfa3f
    private String codigo_postal;
    private String colonia;
    private String calle;
    private String no_interior;
    private String no_exterior;

    // CONSTRUCTORES
<<<<<<< HEAD

    // SETTERS & GETTERS

}
=======
    public Direccion (){}

    public Direccion(int id_direccion, int id_cliente, short id_municipio, short id_entidad, String codigo_postal, String colonia, String calle, String no_interior, String no_exterior) {
        this.id_direccion = id_direccion;
        this.id_cliente = id_cliente;
        this.id_municipio = id_municipio;
        this.id_entidad = id_entidad;
        this.codigo_postal = codigo_postal;
        this.colonia = colonia;
        this.calle = calle;
        this.no_interior = no_interior;
        this.no_exterior = no_exterior;
    }

    // SETTERS & GETTERS

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public short getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(short id_municipio) {
        this.id_municipio = id_municipio;
    }

    public short getId_entidad() {
        return id_entidad;
    }

    public void setId_entidad(short id_entidad) {
        this.id_entidad = id_entidad;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNo_interior() {
        return no_interior;
    }

    public void setNo_interior(String no_interior) {
        this.no_interior = no_interior;
    }

    public String getNo_exterior() {
        return no_exterior;
    }

    public void setNo_exterior(String no_exterior) {
        this.no_exterior = no_exterior;
    }
}
>>>>>>> 9e2e972057fd3f7b1d073fb06a5e2324608bfa3f
