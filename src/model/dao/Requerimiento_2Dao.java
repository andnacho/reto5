package model.dao;

import model.vo.Requerimiento_1;
import model.vo.Requerimiento_2;
import util.JDBCUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimiento_2Dao {

    public static ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        Connection conn = JDBCUtilities.getConnection();

        PreparedStatement pstm = conn.prepareStatement("select c.ID_Proyecto id, c.Proveedor pro, c.Pagado pagado, c.ID_MaterialConstruccion idMaterial, mc.Nombre_Material nombreMaterial from Compra c join MaterialConstruccion mc on c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion \n" +
                "WHERE c.Proveedor = 'Homecenter' AND Pagado = 'No' order by c.ID_Proyecto;");
        ResultSet rs = pstm.executeQuery();

        ArrayList<Requerimiento_2> requerimientos = new ArrayList<Requerimiento_2>();

        while (rs.next()) {
            requerimientos.add(new Requerimiento_2(
                    rs.getInt("id"),
                    rs.getInt("idMaterial"),
                    rs.getString("pro"),
                    rs.getString("pagado"),
                    rs.getString("nombreMaterial")
            ));
        }

        conn.close();
        rs.close();
        return requerimientos;

    }
}
