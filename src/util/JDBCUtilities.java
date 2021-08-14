package util;

import model.vo.Requerimiento_2;
import model.vo.Requerimiento_3;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;


public class JDBCUtilities {
    //Atributos de clase para gestión de conexión con la base de datos
    private static final String UBICACION_BD = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }

    public static boolean estaVacia() {
        File archivo = new File(JDBCUtilities.UBICACION_BD);
        return archivo.length() == 0;
    }
}
