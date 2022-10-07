package mx.edu.utdev.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import mx.edu.utdev.context.PostgreSQLJDBC;
import mx.edu.utdev.models.Venta;

public class VentaRepository {

    PostgreSQLJDBC postgreSQLJDBC;

    public VentaRepository() {
        postgreSQLJDBC = new PostgreSQLJDBC();
    }

    public Collection<Venta> findAll() {
        Map<Integer, Venta> ventas = new ConcurrentHashMap<>();
        Statement stmt;
        try {
            stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pos_admin.venta");
            while (rs.next()) {
                int id_pos = rs.getInt("id_pos");
                int id_venta = rs.getInt("id_venta");
                String vendedor = rs.getString("vendedor");
                long folio = rs.getLong("folio");
                String fecha_venta = rs.getString("fecha_venta");
                double total_vendido = rs.getDouble("total_vendido");
                double pago_efectivo = rs.getDouble("pago_efectivo");
                double pago_cheques = rs.getDouble("pago_cheques");
                double pago_vales = rs.getDouble("pago_vales");
                double pago_tc = rs.getDouble("pago_tc");
                String supervisor = rs.getString("supervisor");
                Boolean upload = rs.getBoolean("upload");
                short num_registros = rs.getShort("num_registros");
                ventas.put(rs.getRow(), new Venta(id_pos, id_venta, vendedor, folio,
                        fecha_venta, total_vendido, pago_efectivo, pago_cheques, pago_vales,
                        pago_tc, supervisor, upload, num_registros));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return ventas.values();
    }
}
