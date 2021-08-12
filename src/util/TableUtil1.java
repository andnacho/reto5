package util;

import model.vo.Requerimiento_1;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TableUtil1 extends AbstractTableModel {
    private ArrayList<Requerimiento_1> req1;
    private String[] columnNames = {"Nro Lideres","Ciudad de residencia"};

    public TableUtil1(ArrayList<Requerimiento_1> req) {
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
            temp = req1.get(row).getNumeros_lideres();
        }
        else if (col == 1) {
            temp = req1.get(row).getCiudad();
        }

        return temp;
    }
}
