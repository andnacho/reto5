package view;

import controller.ControladorRequerimientos;
import model.vo.MaterialConstruccion;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class App {
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
    private JPanel panel1;
    private JPanel mainPanel;
    private JButton primerRequerimientoButton;
    private JButton segundoRequerimientoButton;
    private JButton tercerRequerimientoButton;

    public static void requerimiento1Gui(){

        System.out.println("-----Materiales Producción Nacional Más Comprados-------");

        try{
            ArrayList<MaterialConstruccion> rankingMaterialesNacionales = controlador.consultarMaterialesNacionalesComprados();

            System.out.println("Nombre_Material Importado No_Compras");
            rankingMaterialesNacionales.forEach(material -> System.out.println(material.getNombre() + " " + material.getImportado() + " " + material.getCantidad() ));

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }

    }
    public static void requerimiento2Gui(){

        System.out.println("-----Materiales Producción Nacional Más Comprados-------");

        try{
            ArrayList<MaterialConstruccion> rankingMaterialesNacionales = controlador.consultarMaterialesNacionalesComprados();

            System.out.println("Nombre_Material Importado No_Compras");
            rankingMaterialesNacionales.forEach(material -> System.out.println(material.getNombre() + " " + material.getImportado() + " " + material.getCantidad() ));

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }

    }

    public static void requerimiento3Gui(){

        System.out.println("-----Materiales Producción Nacional Más Comprados-------");

        try{
            ArrayList<MaterialConstruccion> rankingMaterialesNacionales = controlador.consultarMaterialesNacionalesComprados();

            System.out.println("Nombre_Material Importado No_Compras");
            rankingMaterialesNacionales.forEach(material -> System.out.println(material.getNombre() + " " + material.getImportado() + " " + material.getCantidad() ));

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }

    }
}
