package mx.edu.utdev.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import mx.edu.utdev.context.PostgreSQLJDBC;
import mx.edu.utdev.models.Cliente;

public class ClienteRepository {

    PostgreSQLJDBC postgreSQLJDBC;

    public ClienteRepository() {
        postgreSQLJDBC = new PostgreSQLJDBC();
    }

    public Collection<Cliente> findAll() {
        Map<Integer, Cliente> clientes = new ConcurrentHashMap<>();
        Statement stmt;
        try {
            stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pos_admin.cliente");
            while (rs.next()) {
                int id_cliente = rs.getInt("id_proveedor");
                String rfc = rs.getString("rfc");
                String razon_social = rs.getString("razon_social");
                String regimen_fiscal = rs.getString("regimen_fiscal");
                String contacto = rs.getString("contacto");
                String email = rs.getString("email");
                String email2 = rs.getString("email2");
                clientes.put(rs.getRow(), new Cliente(id_cliente, rfc, razon_social, regimen_fiscal,
                        contacto, email, email2));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return clientes.values();
    }
}
