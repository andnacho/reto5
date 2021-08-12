package model.dao;

import model.vo.MaterialConstruccion;
import util.JDBCUtilities;

import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;

public class MaterialConstruccionDao {

    //Materiales mas comprados
    public static ArrayList<MaterialConstruccion> topMaterialesComprados() throws SQLException {
        Connection conn = JDBCUtilities.getConnection();

        ArrayList<MaterialConstruccion> materiales = new ArrayList<>();

        PreparedStatement pstm = conn.prepareStatement("select m.*, sum(c.cantidad) as cantidad " +
                " from MaterialConstruccion m " +
                " join Compra c on m.ID_MaterialConstruccion = c.ID_MaterialConstruccion " +
                " group by c.ID_MaterialConstruccion " +
                " order by cantidad DESC, m.Nombre_Material;");

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            materiales.add(new MaterialConstruccion(
                    rs.getInt("ID_MaterialConstruccion"),
                    rs.getString("Nombre_Material"),
                    rs.getString("Importado"),
                    rs.getDouble("Precio_Unidad"),
                    rs.getInt("cantidad")
            ));
        }
        return materiales;
    }
}
