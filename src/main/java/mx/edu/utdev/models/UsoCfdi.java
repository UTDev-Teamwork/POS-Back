package mx.edu.utdev.models;

public class UsoCfdi {
    // VARIABLES GLOBALES
    private String id; // EN EL SCRIPT ES VARCHAR
    private String descripcion;
    private String persona_fisica;
    private String persona_moral;
    private String regimen_fiscal_receptor;
    private String fecha_inicio; // EN EL SCRIPT ES DATE
    private String fecha_fin;

    // CONSTRUCTORES

    public UsoCfdi() {
    }

    public UsoCfdi(String id, String descripcion, String persona_fisica, String persona_moral,
            String regimen_fiscal_receptor, String fecha_inicio, String fecha_fin) {
        this.id = id;
        this.descripcion = descripcion;
        this.persona_fisica = persona_fisica;
        this.persona_moral = persona_moral;
        this.regimen_fiscal_receptor = regimen_fiscal_receptor;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    // SETTERS & GETTERS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPersona_fisica() {
        return persona_fisica;
    }

    public void setPersona_fisica(String persona_fisica) {
        this.persona_fisica = persona_fisica;
    }

    public String getPersona_moral() {
        return persona_moral;
    }

    public void setPersona_moral(String persona_moral) {
        this.persona_moral = persona_moral;
    }

    public String getRegimen_fiscal_receptor() {
        return regimen_fiscal_receptor;
    }

    public void setRegimen_fiscal_receptor(String regimen_fiscal_receptor) {
        this.regimen_fiscal_receptor = regimen_fiscal_receptor;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
