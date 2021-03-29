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
public class ReservaDomain extends PrestamoHistoricoDomain {

    private static final long serialVersionUID = 8887763305947312862L;

    private LibroDomain libro;

    public ReservaDomain() {
        super();
    }

    public ReservaDomain(Date fechaInicio, Date fechaFin) {

        this.setFechaInicio(fechaInicio);
        this.setFechaFin(fechaFin);
        this.setEstado(EstadoHistorico.Activa);
    }

    public ReservaDomain(PrestamoHistoricoDomain op) {

        this.setFechaInicio(op.getFechaInicio());
        this.setFechaFin(op.getFechaFin());

    }

    public LibroDomain getLibro() {
        return libro;
    }

    public void setLibro(LibroDomain libro) {
        this.libro = libro;
    }

    public EstadoHistorico getEstado() {
        return EstadoHistorico.Activa;
    }

}
