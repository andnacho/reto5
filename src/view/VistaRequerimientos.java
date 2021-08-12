package view;

import controller.ControladorRequerimientos;
import model.vo.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){

        System.out.println("Requerimiento 1");

        try{
            ArrayList<Requerimiento_1> requerimientos1 = controlador.requerimiento1();

            System.out.println("Nro_Lideres Ciudad_Residencia");
            requerimientos1.forEach(material -> System.out.println(material.getNumeros_lideres() + " " + material.getCiudad()));

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }

    }

    public static void requerimiento2() {

        System.out.println("Requerimiento 2");

        try{
            ArrayList<Requerimiento_2> requerimientos2 = controlador.requerimiento2();

            System.out.println("ID_Proyecto Proveedor Pagado  ID_MaterialConstrucción  Nombre_Material");
            requerimientos2.forEach(req -> System.out.println(req.getIdProyecto() + " " + req.getProveedor() + " " + req.getPagado() + " " + req.getIdMaterialConstruccion() + " " + req.getNombreMaterial()));

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }

    }
    public static void requerimiento3() {

        System.out.println("Requerimiento 2");

        try{
            ArrayList<Requerimiento_3> requerimiento3 = controlador.requerimiento3();

            System.out.println("ID_Lider Nombre Primer_Apellido Segundo_Apellido");
            requerimiento3.forEach(req -> System.out.println(req.getIdLider() + " " + req.getNombre() + " " + req.getPrimerApellido() + " " + req.getSegundoApellido() ));

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento5(){

        System.out.println("-----Proyectos Mayor Compra de Granito-------");

        try{
            ArrayList<Proyecto> rankingProyectosGranito = controlador.consultarProyectosComprasGranito();

            //Encabezado del resultado
            System.out.println("ID_Proyecto Clasificacion Area_Max No_Compras_Granito");

            rankingProyectosGranito.forEach(proyecto -> {
                try {
                    Tipo tipo = proyecto.getTypo();
                    System.out.println(proyecto.getId() + " " + proyecto.getClasificacion() + " " + tipo.getAreaMax() + " " + proyecto.getComprasCantidad());
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            });
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }

    }

    public static void test() {
        System.out.println("---- Test ------");

        try{
            ArrayList<Compra> compras = controlador.test();
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }

    }
}