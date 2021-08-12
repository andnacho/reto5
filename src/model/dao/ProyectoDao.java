package model.dao;

import model.vo.Proyecto;
import util.JDBCUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProyectoDao {

    public static ArrayList<Proyecto> topProyectosComprasGranito() throws SQLException {
        Connection conn = JDBCUtilities.getConnection();

        ArrayList<Proyecto> proyectos = new ArrayList<>();

        PreparedStatement pstm = conn.prepareStatement("select p.*, count(p.ID_Proyecto) as compras from proyecto p join Compra c ON c.ID_Proyecto = p.ID_Proyecto\n" +
                "where c.ID_MaterialConstruccion = (\n" +
                "    select mc.ID_MaterialConstruccion from MaterialConstruccion mc where mc.Nombre_Material = 'Granito' limit 1\n" +
                ") group by p.ID_Proyecto order by compras desc limit 5;");

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            proyectos.add(new Proyecto(
                    rs.getInt("ID_Proyecto"),
                    rs.getInt("Numero_Banos"),
                    rs.getInt("Numero_Habitaciones"),
                    rs.getInt("Porcentaje_Cuota_Inicial"),
                    rs.getInt("ID_Tipo"),
                    rs.getInt("ID_Lider"),
                    rs.getString("Constructora"),
                    rs.getString("Banco_Vinculado"),
                    rs.getString("Ciudad"),
                    rs.getString("Clasificacion"),
                    rs.getString("Acabados"),
                    rs.getInt("compras")
            ));
        }
        return proyectos;
    }
}
