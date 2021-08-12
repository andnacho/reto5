package model.dao;

import model.vo.Requerimiento_1;
import model.vo.Requerimiento_3;
import model.vo.Tipo;
import util.JDBCUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimiento_3Dao {

    public static ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        Connection conn = JDBCUtilities.getConnection();

        PreparedStatement pstm = conn.prepareStatement("select DISTINCT l.ID_Lider id,  l.Nombre nombre, l.Primer_Apellido apellido, l.Segundo_Apellido segundoNombre \n" +
                "from Proyecto p join Lider l on p.ID_Lider = l.ID_Lider;");
        ResultSet rs = pstm.executeQuery();

        ArrayList<Requerimiento_3> requerimientos = new ArrayList<Requerimiento_3>();

        while (rs.next()) {
            requerimientos.add(new Requerimiento_3(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("segundoNombre")
            ));
        }

        conn.close();
        rs.close();
        return requerimientos;

    }
}
