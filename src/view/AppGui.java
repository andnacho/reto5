package view;

import controller.ControladorRequerimientos;
import model.vo.Requerimiento_1;
import model.vo.Requerimiento_2;
import model.vo.Requerimiento_3;
import util.TableUtil1;
import util.TableUtil2;
import util.TableUtil3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class AppGui {
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
    public JPanel panel1;
    public JPanel mainPanel;
    private JButton primerRequerimientoButton;
    private JButton segundoRequerimientoButton;
    private JButton tercerRequerimientoButton;

    public AppGui() {
        primerRequerimientoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Requerimiento 1");

                try{
                    ArrayList<Requerimiento_1> requerimientos1 = controlador.requerimiento1();
                    JFrame frame = new JFrame("Primer requerimiento");
                    JTable table = createTable1(requerimientos1);
                    JScrollPane scrollPane = new JScrollPane(table);
                    frame.getContentPane().add(scrollPane);
                    frame.pack();
                    frame.setVisible(true);

                }catch(SQLException ex){
                    System.err.println("Ha ocurrido un error!"+ex.getMessage());
                }
            }
        });

        segundoRequerimientoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Requerimiento 2");

                try{
                    ArrayList<Requerimiento_2> requerimientos2 = controlador.requerimiento2();
                    JFrame frame = new JFrame("Segundo requerimiento");
                    JTable table = createTable2(requerimientos2);
                    JScrollPane scrollPane = new JScrollPane(table);
                    frame.getContentPane().add(scrollPane);
                    frame.pack();
                    frame.setVisible(true);
                }catch(SQLException ex){
                    System.err.println("Ha ocurrido un error!"+ex.getMessage());
                }
            }
        });
        tercerRequerimientoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Requerimiento 3");

                try{
                    ArrayList<Requerimiento_3> requerimiento3 = controlador.requerimiento3();
                    JFrame frame = new JFrame("Tercer requerimiento");
                    JTable table = createTable3(requerimiento3);
                    JScrollPane scrollPane = new JScrollPane(table);
                    frame.getContentPane().add(scrollPane);
                    frame.pack();
                    frame.setVisible(true);
                }catch(SQLException ex){
                    System.err.println("Ha ocurrido un error!"+ex.getMessage());
                }

            }
        });
    }
    public static JTable createTable1( ArrayList<Requerimiento_1> req)
    {
        JTable table = new JTable(new TableUtil1(req));
        table.setFillsViewportHeight(true);

        return table;
    }
    public static JTable createTable2( ArrayList<Requerimiento_2> req)
    {
        JTable table = new JTable(new TableUtil2(req));
        table.setFillsViewportHeight(true);

        return table;
    }
    public static JTable createTable3( ArrayList<Requerimiento_3> req)
    {
        JTable table = new JTable(new TableUtil3(req));
        table.setFillsViewportHeight(true);

        return table;
    }
}
