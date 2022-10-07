package mx.edu.utdev.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import mx.edu.utdev.context.PostgreSQLJDBC;
import mx.edu.utdev.models.Direccion;

public class DireccionRepository {

    PostgreSQLJDBC postgreSQLJDBC;

    public DireccionRepository() {
        postgreSQLJDBC = new PostgreSQLJDBC();
    }

    public Collection<Direccion> findAll() {
        Map<Integer, Direccion> direcciones = new ConcurrentHashMap<>();
        Statement stmt;
        try {
            stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pos_admin.direccion");
            while (rs.next()) {
                int id_direccion = rs.getInt("id_direccion");
                int id_cliente = rs.getInt("id_cliente");
                short id_municipio = rs.getShort("id_municipio");
                short id_entidad = rs.getShort("id_entidad");
                String codigo_postal = rs.getString("codigo_postal");
                String colonia = rs.getString("colonia");
                String calle = rs.getString("calle");
                String no_interior = rs.getString("no_interior");
                String no_exterior = rs.getString("no_exterior");
                direcciones.put(rs.getRow(), new Direccion(id_direccion, id_cliente, id_municipio, id_entidad,
                        codigo_postal, colonia, calle, no_interior, no_exterior));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return direcciones.values();
    }
}
