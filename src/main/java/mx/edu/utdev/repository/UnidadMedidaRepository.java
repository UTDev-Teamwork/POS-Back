package mx.edu.utdev.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import mx.edu.utdev.context.PostgreSQLJDBC;
import mx.edu.utdev.models.UnidadMedida;

public class UnidadMedidaRepository {

    PostgreSQLJDBC postgreSQLJDBC;

    public UnidadMedidaRepository() {
        postgreSQLJDBC = new PostgreSQLJDBC();
    }

    public Collection<UnidadMedida> findAll() {
        Map<Integer, UnidadMedida> unidadMedidas = new ConcurrentHashMap<>();
        Statement stmt;
        try {
            stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pos_admin.unidad_medida");
            while (rs.next()) {
                int id_unidad = rs.getInt("id_unidad");
                String descripcion = rs.getString("descripcion");
                String fecha_registro = rs.getString("fecha_registro");
                String cve_sat = rs.getString("cve_sate");
                unidadMedidas.put(rs.getRow(), new UnidadMedida(id_unidad, descripcion, fecha_registro, cve_sat));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return unidadMedidas.values();
    }
}
