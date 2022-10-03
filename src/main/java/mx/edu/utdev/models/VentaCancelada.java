package mx.edu.utdev.models;

public class VentaCancelada {
    // VARIABLES GLOBALES
    private int id_post;
    private int id_venta_cancel; // en sql es uniqueidentifier
    private String vendedor;
    private String fecha; // PUEDE SER TIMESTAMP
    private double total_vendido;
    private double pago_efectivo;
    private double pago_cheque;
    private double pago_vales;
    private double pago_tc;
    private String status;
    private String supervisor;
    private boolean upload;

    // CONSTRUCTORES

    public VentaCancelada() {
    }

    public VentaCancelada(int id_post, int id_venta_cancel, String vendedor, String fecha, double total_vendido,
            double pago_efectivo, double pago_cheque, double pago_vales, double pago_tc, String status,
            String supervisor, boolean upload) {
        this.id_post = id_post;
        this.id_venta_cancel = id_venta_cancel;
        this.vendedor = vendedor;
        this.fecha = fecha;
        this.total_vendido = total_vendido;
        this.pago_efectivo = pago_efectivo;
        this.pago_cheque = pago_cheque;
        this.pago_vales = pago_vales;
        this.pago_tc = pago_tc;
        this.status = status;
        this.supervisor = supervisor;
        this.upload = upload;
    }

    // SETTERS & GETTERS

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public int getId_venta_cancel() {
        return id_venta_cancel;
    }

    public void setId_venta_cancel(int id_venta_cancel) {
        this.id_venta_cancel = id_venta_cancel;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal_vendido() {
        return total_vendido;
    }

    public void setTotal_vendido(double total_vendido) {
        this.total_vendido = total_vendido;
    }

    public double getPago_efectivo() {
        return pago_efectivo;
    }

    public void setPago_efectivo(double pago_efectivo) {
        this.pago_efectivo = pago_efectivo;
    }

    public double getPago_cheque() {
        return pago_cheque;
    }

    public void setPago_cheque(double pago_cheque) {
        this.pago_cheque = pago_cheque;
    }

    public double getPago_vales() {
        return pago_vales;
    }

    public void setPago_vales(double pago_vales) {
        this.pago_vales = pago_vales;
    }

    public double getPago_tc() {
        return pago_tc;
    }

    public void setPago_tc(double pago_tc) {
        this.pago_tc = pago_tc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public boolean isUpload() {
        return upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }
}
