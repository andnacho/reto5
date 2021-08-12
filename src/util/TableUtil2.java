package util;

import model.vo.Requerimiento_1;
import model.vo.Requerimiento_2;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TableUtil2 extends AbstractTableModel {
    private ArrayList<Requerimiento_2> req2;
    private String[] columnNames = {"ID Proyecto", "Proveedor", "Pagado",  "ID Material Construcción",  "Nombre Material"};

    public TableUtil2(ArrayList<Requerimiento_2> req) {
        this.req2 = req;
    }

    @Override
    public int getRowCount() {
        return req2.size();
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
            temp = req2.get(row).getIdProyecto();
        }
        else if (col == 1) {
            temp = req2.get(row).getProveedor();
        }
        else if (col == 2) {
            temp = req2.get(row).getPagado();
        }
        else if (col == 3) {
            temp = req2.get(row).getIdMaterialConstruccion();
        }
        else if (col == 4) {
            temp = req2.get(row).getNombreMaterial();
        }

        return temp;
    }
}
