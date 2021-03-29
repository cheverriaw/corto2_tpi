/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import java.util.Date;
import com.ues.edu.sv.modelo.EstadoHistorico;

/**
 *
 * @author FUJITSU
 */
public class MultaDomain extends DomainObject {

    private static final long serialVersionUID = 6754671565170838339L;

    private int idMulta;

    private Date fechaInicio;

    private Date fechaFin;

    private EstadoHistorico estado = EstadoHistorico.Activa;

    private UsuarioDomain usuario;

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public EstadoHistorico getEstado() {
        return estado;
    }

    public void setEstado(EstadoHistorico estado) {
        this.estado = estado;
    }

    public UsuarioDomain getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDomain usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
