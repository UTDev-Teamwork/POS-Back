package mx.edu.utdev.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import mx.edu.utdev.context.PostgreSQLJDBC;
import mx.edu.utdev.models.DireccionProveedor;

public class DireccionProveedorRepository {

    PostgreSQLJDBC postgreSQLJDBC;

    public DireccionProveedorRepository() {
        postgreSQLJDBC = new PostgreSQLJDBC();
    }

    public Collection<DireccionProveedor> findAll() {
        Map<Integer, DireccionProveedor> dirProveedores = new ConcurrentHashMap<>();
        Statement stmt;
        try {
            stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pos_admin.direccion_proveedor");
            while (rs.next()) {
                int id_proveedor = rs.getInt("id_proveedor");
                String calle = rs.getString("calle");
                String no_int = rs.getString("no_int");
                String no_ext = rs.getString("no_ext");
                String colonia = rs.getString("colonia");
                String localidad = rs.getString("localidad");
                short id_entidad = rs.getShort("id_entidad");
                short id_municipio = rs.getShort("id_municipio");
                String pais = rs.getString("pais");
                String cod_postal = rs.getString("cod_postal");
                dirProveedores.put(rs.getRow(), new DireccionProveedor(id_proveedor, calle, no_int, no_ext,
                        colonia, localidad, id_entidad, id_municipio, pais, cod_postal));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return dirProveedores.values();
    }
}
