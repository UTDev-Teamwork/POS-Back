package mx.edu.utdev.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import mx.edu.utdev.context.PostgreSQLJDBC;
import mx.edu.utdev.models.VentaArticulo;

public class VentaArticuloRepository {

    PostgreSQLJDBC postgreSQLJDBC;

    public VentaArticuloRepository() {
        postgreSQLJDBC = new PostgreSQLJDBC();
    }

    public Collection<VentaArticulo> findAll() {
        Map<Integer, VentaArticulo> ventaArticulos = new ConcurrentHashMap<>();
        Statement stmt;
        try {
            stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pos_admin.venta_articulo");
            while (rs.next()) {
                int id_pos = rs.getInt("id_pos");
                int id_venta = rs.getInt("id_venta");
                Long no_articulo = rs.getLong("no_articulos");
                String cod_barras = rs.getString("cod_barras");
                short user_code_bascula = rs.getShort("user_code_bascula");
                double cantidad = rs.getDouble("cantidad");
                Boolean articulo_ofertado = rs.getBoolean("articulo_ofertado");
                double precio_regular = rs.getDouble("precio_regular");
                Boolean cambio_precio = rs.getBoolean("cambio_precio");
                double iva = rs.getDouble("iva");
                double precio_vta = rs.getDouble("precio_vta");
                double porcent_desc = rs.getDouble("porcent_desc");
                double cant_devuelta = rs.getDouble("cant_devuelta");
                String user_name = rs.getString("user_name");
                int id_promo = rs.getInt("id_promo");
                short no_promo_aplicado = rs.getShort("no_promo_aplicado");
                ventaArticulos.put(rs.getRow(), new VentaArticulo(id_pos, id_venta, no_articulo, cod_barras,
                        user_code_bascula, cantidad, articulo_ofertado, precio_regular, cambio_precio,
                        iva, precio_vta, porcent_desc, cant_devuelta, user_name, id_promo, no_promo_aplicado));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return ventaArticulos.values();
    }
}
