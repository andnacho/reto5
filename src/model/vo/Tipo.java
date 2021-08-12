package model.vo;

import java.util.Date;

public class Tipo {

    private int id, areaMax, financiable, estrato;

    public Tipo(int id, int areaMax, int financiable, int estrato) {
        this.id = id;
        this.areaMax = areaMax;
        this.financiable = financiable;
        this.estrato = estrato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAreaMax() {
        return areaMax;
    }

    public void setAreaMax(int areaMax) {
        this.areaMax = areaMax;
    }

    public int getFinanciable() {
        return financiable;
    }

    public void setFinanciable(int financiable) {
        this.financiable = financiable;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
}
