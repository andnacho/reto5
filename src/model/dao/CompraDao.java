package model.dao;

import model.vo.Compra;
import util.JDBCUtilities;

import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;

//DAO's
public class CompraDao {
    //Los dos cargos que tienen menos proyectos asignados
    public ArrayList<Compra> cargosMenosAsignados() throws SQLException {

        return new ArrayList<Compra>();
    }

    public static ArrayList<Compra> getAllCompras() throws SQLException {
        Connection conn = JDBCUtilities.getConnection();

        ArrayList<Compra> compras = new ArrayList<Compra>();

        PreparedStatement pstm = conn.prepareStatement("SELECT * from Compra");
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            try {
                compras.add(new Compra(
                        rs.getInt("ID_Compra"),
                        rs.getInt("Cantidad"),
                        rs.getInt("ID_Proyecto"),
                        rs.getInt("ID_MaterialConstruccion"),
                        rs.getString("Proveedor"),
                        rs.getString("Pagado"),
                        rs.getString("Fecha")
                ));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return compras;
    }
}
