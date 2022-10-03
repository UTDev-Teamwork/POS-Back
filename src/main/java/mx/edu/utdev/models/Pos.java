package mx.edu.utdev.models;

public class Pos {
    // VARIABLES GLOBALES
    private short id_pos; // EN EL SCRIPT ES SMALLINT, PUEDE SER INT
    private String pos_address;
    private String user_sql;
    private String pwsd_sql;

    // CONSTRUCTORES

    public Pos() {
    }

    public Pos(short id_pos, String pos_address, String user_sql, String pwsd_sql) {
        this.id_pos = id_pos;
        this.pos_address = pos_address;
        this.user_sql = user_sql;
        this.pwsd_sql = pwsd_sql;
    }

    // SETTERS & GETTERS

    public short getId_pos() {
        return id_pos;
    }

    public void setId_pos(short id_pos) {
        this.id_pos = id_pos;
    }

    public String getPos_address() {
        return pos_address;
    }

    public void setPos_address(String pos_address) {
        this.pos_address = pos_address;
    }

    public String getUser_sql() {
        return user_sql;
    }

    public void setUser_sql(String user_sql) {
        this.user_sql = user_sql;
    }

    public String getPwsd_sql() {
        return pwsd_sql;
    }

    public void setPwsd_sql(String pwsd_sql) {
        this.pwsd_sql = pwsd_sql;
    }
}
