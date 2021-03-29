/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import java.util.Date;

/**
 *
 * @author FUJITSU
 */
public class PrestamoHistoricoDomain {

    private static final long serialVersionUID = 1750153792663968362L;

	private LibroDomain libro;

	private Date fechaFinReal;
        private int idOperacion;

	private UsuarioDomain usuario;

	private EstadoEjemplar tipo;

	private Date fechaInicio;

	private Date fechaFin;
        private EstadoHistorico estado;

    


	public PrestamoHistoricoDomain() {
		super();
	}

    public PrestamoHistoricoDomain(LibroDomain libro, Date fechaFinReal, int idOperacion, UsuarioDomain usuario, EstadoEjemplar tipo, Date fechaInicio, Date fechaFin) {
        this.libro = libro;
        this.fechaFinReal = fechaFinReal;
        this.idOperacion = idOperacion;
        this.usuario = usuario;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LibroDomain getLibro() {
        return libro;
    }

    public void setLibro(LibroDomain libro) {
        this.libro = libro;
    }

    public Date getFechaFinReal() {
        return fechaFinReal;
    }

    public void setFechaFinReal(Date fechaFinReal) {
        this.fechaFinReal = fechaFinReal;
    }

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public UsuarioDomain getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDomain usuario) {
        this.usuario = usuario;
    }

    public EstadoEjemplar getTipo() {
        return tipo;
    }

    public void setTipo(EstadoEjemplar tipo) {
        this.tipo = tipo;
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
	
	
}
