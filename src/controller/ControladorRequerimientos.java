package controller;

import model.dao.*;
import model.vo.*;

import java.sql.SQLException;
import java.util.ArrayList;

//Controlador
public class ControladorRequerimientos {
    public ControladorRequerimientos(){

    }

    public ArrayList<Compra> test() throws SQLException {
        return CompraDao.getAllCompras();
    }

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        return Requerimiento_1Dao.Requerimiento1();
    }

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        return Requerimiento_2Dao.requerimiento2();
    }

    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        return Requerimiento_3Dao.requerimiento3();
    }

    public ArrayList<MaterialConstruccion> consultarMaterialesNacionalesComprados() throws SQLException {

        return MaterialConstruccionDao.topMaterialesComprados();
    }

    public ArrayList<Proyecto> consultarProyectosComprasGranito() throws SQLException {
        return ProyectoDao.topProyectosComprasGranito();
    }
}