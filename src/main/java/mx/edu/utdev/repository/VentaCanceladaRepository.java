package mx.edu.utdev.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import mx.edu.utdev.context.PostgreSQLJDBC;
import mx.edu.utdev.models.VentaCancelada;

public class VentaCanceladaRepository {

    PostgreSQLJDBC postgreSQLJDBC;

    public VentaCanceladaRepository() {
        postgreSQLJDBC = new PostgreSQLJDBC();
    }

    public Collection<VentaCancelada> findAll() {
        Map<Integer, VentaCancelada> ventasCanceladas = new ConcurrentHashMap<>();
        Statement stmt;
        try {
            stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pos_admin.venta_cancelada");
            while (rs.next()) {
                int id_pos = rs.getInt("id_pos");
                int id_venta_cancel = rs.getInt("id_venta_cancel");
                String vendedor = rs.getString("vendedor");
                String fecha = rs.getString("fecha");
                double total_vendido = rs.getDouble("total_vendido");
                double pago_efectivo = rs.getDouble("pago_efectivo");
                double pago_cheques = rs.getDouble("pago_cheques");
                double pago_vales = rs.getDouble("pago_vales");
                double pago_tc = rs.getDouble("pago_tc");
                String status = rs.getString("status");
                String supervisor = rs.getString("supervisor");
                Boolean upload = rs.getBoolean("upload");
                ventasCanceladas.put(rs.getRow(), new VentaCancelada(id_pos, id_venta_cancel, vendedor,
                        fecha, total_vendido, pago_efectivo, pago_cheques, pago_vales,
                        pago_tc, status, supervisor, upload));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return ventasCanceladas.values();
    }
}
