package mx.edu.utdev.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import mx.edu.utdev.context.PostgreSQLJDBC;
import mx.edu.utdev.models.Articulo;

public class ArticuloRepository {

    PostgreSQLJDBC postgreSQLJDBC;

    public ArticuloRepository() {
        postgreSQLJDBC = new PostgreSQLJDBC();
    }

    public Collection<Articulo> findAll() {
        Map<Integer, Articulo> articulos = new ConcurrentHashMap<>();
        Statement stmt;
        try {
            stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pos_admin.articulo WHERE cod_barras LIKE '7000000000%';");
            while (rs.next()) {
                String cod_barras = rs.getString("cod_barras");
                int id_clasificacion = rs.getInt("id_clasificacion");
                String descripcion = rs.getString("descripcion");
                String descripcion_corta = rs.getString("descripcion_corta");
                double precio = rs.getDouble("precio_venta");
                double stock = rs.getDouble("stock");
                double iva = rs.getDouble("iva");
                boolean articulo_disponible = rs.getBoolean("articulo_disponible");
                int imagen = rs.getInt("Imagen");
                articulos.put(rs.getRow(), new Articulo(cod_barras, id_clasificacion, descripcion, descripcion_corta,
                        precio, stock, iva, articulo_disponible, getImage(imagen)));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return articulos.values();
    }

    public Collection<Articulo> create() {
        Map<Integer, Articulo> articulos = new ConcurrentHashMap<>();
        Statement stmt;
        try {
            stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pos_admin.articulo WHERE cod_barras LIKE '7000000000%';");
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return articulos.values();
    }

    public Collection<Articulo> delete(){
        
    }

    public Collection<Articulo> update(){
         
    }

    public String getImage(int id) {
        try {
            Statement stmt = postgreSQLJDBC.c.createStatement();
            ResultSet rsImagen = stmt.executeQuery("SELECT * FROM pos_admin.imagenes;");
            while (rsImagen.next()) {
                if (rsImagen.getInt("id") == id) {
                    String path = rsImagen.getString("path");
                    rsImagen.close();
                    stmt.close();
                    return path;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
    }

}
