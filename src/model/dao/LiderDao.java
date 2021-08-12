package model.dao;

import model.vo.Lider;
import util.JDBCUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

public class LiderDao {

    public ArrayList<Lider> lideresPorCiudad() throws SQLException {
        Connection conn = JDBCUtilities.getConnection();

        ArrayList<Lider> lideres = new ArrayList<Lider>();

        PreparedStatement pstm = conn.prepareStatement("select l.* from Lider l");
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            try {
                lideres.add(new Lider(
                        rs.getInt("ID_Lider"),
                        rs.getInt("Clasificacion"),
                        rs.getString("Documento_Identidad"),
                        rs.getString("Nombre"),
                        rs.getString("Primer_Apellido"),
                        rs.getString("Segundo_Apellido"),
                        rs.getString("Ciudad_Residencia"),
                        rs.getString("Cargo"),
                        rs.getDouble("Salario"),
                        rs.getString("Fecha")
                ));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return lideres;
    }
}
