/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;

/**
 *
 * @author FUJITSU
 */
public class LibroDomain extends DomainObject {

    private static final long serialVersionUID = 1L;
    private Log logger = (Log) LogFactory.getLog(LibroDomain.class);
    private String isbn;
    private String titulo;
    private String autor;
    private Integer numPaginas;
    private Date fechaAlta;
    private Integer numDisponibles;

    private Set<EjemplarDomain> ejemplares = new HashSet<EjemplarDomain>();
    private Set<ReservaDomain> reservas = new HashSet<ReservaDomain>();

    public LibroDomain(String isbn) {
        this.isbn = isbn;
        logger.debug("Creada una instancia de " + LibroDomain.class.getName());

    }

    public Log getLogger() {
        return logger;
    }

    public void setLogger(Log logger) {
        this.logger = logger;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getNumDisponibles() {
        return numDisponibles;
    }

    public void setNumDisponibles(Integer numDisponibles) {
        this.numDisponibles = numDisponibles;
    }

    public Set<EjemplarDomain> getEjemplares() {
        return ejemplares;
    }


    public void setEjemplares(Set<EjemplarDomain> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Set<ReservaDomain> getReservas() {
        return reservas;
    }

    public void setReservas(Set<ReservaDomain> reservas) {
        this.reservas = reservas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        LibroDomain other = (LibroDomain) object;
        if (isbn == null) {
            return false;
        } else if (!isbn.equals(other.isbn)) {
            return false;
        }
        return true;

    }

}

