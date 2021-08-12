package util;

import model.vo.Requerimiento_1;
import model.vo.Requerimiento_3;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TableUtil3 extends AbstractTableModel {
    private ArrayList<Requerimiento_3> req1;
    private String[] columnNames = {"ID Lider", "Nombre", "Primer Apellido", "Segundo Apellido"};

    public TableUtil3(ArrayList<Requerimiento_3> req) {
        this.req1 = req;
    }

    @Override
    public int getRowCount() {
        return req1.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int row, int col) {
        Object temp = null;
        if (col == 0) {
            temp = req1.get(row).getIdLider();
        }
        else if (col == 1) {
            temp = req1.get(row).getNombre();
        }
        else if (col == 2) {
            temp = req1.get(row).getPrimerApellido();
        }
        else if (col == 3) {
            temp = req1.get(row).getSegundoApellido();
        }

        return temp;
    }
}
