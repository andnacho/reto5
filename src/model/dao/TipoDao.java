package model.dao;

import model.vo.Compra;
import model.vo.MaterialConstruccion;
import model.vo.Tipo;
import util.JDBCUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

public class TipoDao {

    public static Tipo getTipoById(int id) throws SQLException {
        Connection conn = JDBCUtilities.getConnection();

        PreparedStatement pstm = conn.prepareStatement("SELECT * from Tipo Where ID_Tipo = ?");
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            return new Tipo(
                    rs.getInt("ID_Tipo"),
                    rs.getInt("Area_Max"),
                    rs.getInt("Financiable"),
                    rs.getInt("Estrato")
            );
        }

        return null;
    }
}
