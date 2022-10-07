package mx.edu.utdev.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import mx.edu.utdev.context.PostgreSQLJDBC;
import mx.edu.utdev.models.Proveedor;

public class ProveedorRepository {

    PostgreSQLJDBC postgreSQLJDBC;

    public ProveedorRepository() {
        postgreSQLJDBC = new PostgreSQLJDBC();
    }

    public Collection<Proveedor> findAll() {
        Map<Integer, Proveedor> proveedores = new ConcurrentHashMap<>();
        Statement stmt;
        try {
            stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pos_admin.proveedor");
            while (rs.next()) {
                int id_proveedor = rs.getInt("id_proveedor");
                String rfc = rs.getString("rfc");
                String razon_social = rs.getString("razon_social");
                String nombre_contacto = rs.getString("nombre_contacto");
                String tel_principal = rs.getString("tel_principal");
                String tel_movil = rs.getString("tel_movil");
                String email = rs.getString("email");
                String estatus = rs.getString("estatus");
                String fecha_registro = rs.getString("fecha_registro");
                proveedores.put(rs.getRow(), new Proveedor(id_proveedor, rfc, razon_social, nombre_contacto,
                        tel_principal, tel_movil, email, estatus, fecha_registro));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return proveedores.values();
    }
}
