package model.dao;

import model.vo.Compra;
import model.vo.Lider;
import model.vo.Requerimiento_1;
import util.JDBCUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

public class Requerimiento_1Dao {

    public static ArrayList<Requerimiento_1> Requerimiento1() throws SQLException {
        Connection conn = JDBCUtilities.getConnection();

        PreparedStatement pstm = conn.prepareStatement("select count(l.ID_Lider) as total, Ciudad_Residencia as ciudad from Lider l group by Ciudad_Residencia");
        ResultSet rs = pstm.executeQuery();

        ArrayList<Requerimiento_1> requerimientos = new ArrayList<Requerimiento_1>();

        while (rs.next()) {

            requerimientos.add(new Requerimiento_1(
                    rs.getInt("total"),
                    rs.getString("ciudad")
            ));

        }
        conn.close();
        rs.close();
        return requerimientos;
    }
}
