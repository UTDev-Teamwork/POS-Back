package mx.edu.utdev.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import mx.edu.utdev.context.PostgreSQLJDBC;
import mx.edu.utdev.models.VentaCanceladaArticulo;

public class VentaCanceladaArticuloRepository {

    PostgreSQLJDBC postgreSQLJDBC;

    public VentaCanceladaArticuloRepository() {
        postgreSQLJDBC = new PostgreSQLJDBC();
    }

    public Collection<VentaCanceladaArticulo> findAll() {
        Map<Integer, VentaCanceladaArticulo> ventasCanceladasArticulo = new ConcurrentHashMap<>();
        Statement stmt;
        try {
            stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pos_admin.venta_cancelada_articulo");
            while (rs.next()) {
                int id_pos = rs.getInt("id_pos");
                int id_venta_cancel = rs.getInt("id_venta_cancel");
                long no_articulo = rs.getLong("no_articulo");
                String cod_barras = rs.getString("cod_barras");
                double cantidad = rs.getDouble("cantidad");
                Boolean articulo_ofertado = rs.getBoolean("articulo_ofertado");
                double precio_regular = rs.getDouble("precio_regular");
                Boolean cambio_precio = rs.getBoolean("cambio_precio");
                double precio_vta = rs.getDouble("precio_vta");
                double porcent_desc = rs.getDouble("porcent_desc");
                String user_name = rs.getString("user_name");
                ventasCanceladasArticulo.put(rs.getRow(), new VentaCanceladaArticulo(id_pos, id_venta_cancel, no_articulo, cod_barras,
                        cantidad, articulo_ofertado, precio_regular, cambio_precio, precio_vta,
                        porcent_desc, user_name));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return ventasCanceladasArticulo.values();
    }
}
