package mx.edu.utdev.models;

public class PosControl {
    // VARIABLES GLOBALES
    private char id_control_pos; // EN EL SCRIPT ES CHAR
    private int id_pos;
    private String user_name;
    private String pos_open_date;

    // CONSTRUCTORES

    public PosControl() {
    }

    public PosControl(char id_control_pos, int id_pos, String user_name, String pos_open_date) {
        this.id_control_pos = id_control_pos;
        this.id_pos = id_pos;
        this.user_name = user_name;
        this.pos_open_date = pos_open_date;
    }

    // SETTERS & GETTERS

    public char getId_control_pos() {
        return id_control_pos;
    }

    public void setId_control_pos(char id_control_pos) {
        this.id_control_pos = id_control_pos;
    }

    public int getId_pos() {
        return id_pos;
    }

    public void setId_pos(int id_pos) {
        this.id_pos = id_pos;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPos_open_date() {
        return pos_open_date;
    }

    public void setPos_open_date(String pos_open_date) {
        this.pos_open_date = pos_open_date;
    }
}
