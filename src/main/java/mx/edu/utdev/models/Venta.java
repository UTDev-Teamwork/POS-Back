package mx.edu.utdev.models;

public class Venta {
    // VARIABLES GLOBALES
    private int id_pos; // en sql ya es int
    private int id_venta; // en sql es uniqueidentifier
    private String vendedor;
    private long folio; // Puede ser BigInteger ya que en sql es bigint
    private String fecha_venta;
    private double total_vendido;
    private double pago_efectivo;
    private double pago_cheque;
    private double pago_vales;
    private double pago_tc;
    private String supervisor;
    private boolean upload;
    private short num_registros; // Puede ser int ya que en sql es smallint

    // CONSTRUCTORES

    public Venta() {
    }

    public Venta(int id_pos, int id_venta, String vendedor, long folio, String fecha_venta, double total_vendido,
            double pago_efectivo, double pago_cheque, double pago_vales, double pago_tc, String supervisor,
            boolean upload, short num_registros) {
        this.id_pos = id_pos;
        this.id_venta = id_venta;
        this.vendedor = vendedor;
        this.folio = folio;
        this.fecha_venta = fecha_venta;
        this.total_vendido = total_vendido;
        this.pago_efectivo = pago_efectivo;
        this.pago_cheque = pago_cheque;
        this.pago_vales = pago_vales;
        this.pago_tc = pago_tc;
        this.supervisor = supervisor;
        this.upload = upload;
        this.num_registros = num_registros;
    }

    // SETTERS & GETTERS

    public int getId_pos() {
        return id_pos;
    }

    public void setId_pos(int id_pos) {
        this.id_pos = id_pos;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public long getFolio() {
        return folio;
    }

    public void setFolio(long folio) {
        this.folio = folio;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
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

    public short getNum_registros() {
        return num_registros;
    }

    public void setNum_registros(short num_registros) {
        this.num_registros = num_registros;
    }
}
