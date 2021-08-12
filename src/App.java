import view.AppGui;
import view.VistaRequerimientos;

import javax.swing.*;

//****************************************************************
//- Recordar que la clase que contiene el main no debe ser subida.
//- El main se utiliza como ejemplo para los llamados.
//- Tampoco incluir los System.out.println();
//  se sugieren como separadores mientras se realizan pruebas.
//- Al subir el reto la base de datos está en la ubicación ofrecida
//  en este esqueleto.
//****************************************************************
public class App {
    public static void main(String[] args) {

//        VistaRequerimientos.requerimiento1();
//        System.out.println();
//
//        VistaRequerimientos.requerimiento2();
//        System.out.println();
//
//        VistaRequerimientos.requerimiento3();
//        System.out.println();

        JFrame frame = new JFrame("App para los requerimientos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new AppGui().panel1);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
