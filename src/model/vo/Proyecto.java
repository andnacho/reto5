package model.vo;

import model.dao.TipoDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Proyecto {
    private int id, numeroBanos, numeroHabitaciones, porcentajeCuotaInicial, idTipo, idLider;
    private String constructora, bancoVinculado, ciudad, clasificacion, acabados;

    private int comprasCantidad = 0;

    public Proyecto(int id, int numeroBanos, int numeroHabitaciones, int porcentajeCuotaInicial, int idTipo, int idLider, String constructora, String bancoVinculado, String ciudad, String clasificacion, String acabados) {
        this.id = id;
        this.numeroBanos = numeroBanos;
        this.numeroHabitaciones = numeroHabitaciones;
        this.porcentajeCuotaInicial = porcentajeCuotaInicial;
        this.idTipo = idTipo;
        this.idLider = idLider;
        this.constructora = constructora;
        this.bancoVinculado = bancoVinculado;
        this.ciudad = ciudad;
        this.clasificacion = clasificacion;
        this.acabados = acabados;
    }

    public Proyecto(int id, int numeroBanos, int numeroHabitaciones, int porcentajeCuotaInicial, int idTipo, int idLider, String constructora, String bancoVinculado, String ciudad, String clasificacion, String acabados, int comprasCantidad) {
        this.id = id;
        this.numeroBanos = numeroBanos;
        this.numeroHabitaciones = numeroHabitaciones;
        this.porcentajeCuotaInicial = porcentajeCuotaInicial;
        this.idTipo = idTipo;
        this.idLider = idLider;
        this.constructora = constructora;
        this.bancoVinculado = bancoVinculado;
        this.ciudad = ciudad;
        this.clasificacion = clasificacion;
        this.acabados = acabados;

        this.setComprasCantidad(comprasCantidad);
    }

    public Tipo getTypo() throws SQLException {
        return TipoDao.getTipoById(this.getIdTipo());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getComprasCantidad() {
        return comprasCantidad;
    }

    public void setComprasCantidad(int comprasCantidad) {
        this.comprasCantidad = comprasCantidad;
    }

    public int getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(int numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getPorcentajeCuotaInicial() {
        return porcentajeCuotaInicial;
    }

    public void setPorcentajeCuotaInicial(int porcentajeCuotaInicial) {
        this.porcentajeCuotaInicial = porcentajeCuotaInicial;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdLider() {
        return idLider;
    }

    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getBancoVinculado() {
        return bancoVinculado;
    }

    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getAcabados() {
        return acabados;
    }

    public void setAcabados(String acabados) {
        this.acabados = acabados;
    }
}
