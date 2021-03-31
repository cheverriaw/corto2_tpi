/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ejemplar")
public class EjemplarDomain extends DomainObject {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String idEjemplar;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum ('SALA','CASA ','DEPARTAMENTO' )", nullable = false)
    private Localizacion localizacion;
    @Temporal(TemporalType.DATE)
    private Date fechaAdquisicion;
    private String observaciones;
    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;
    @ManyToOne
    @JoinColumn(nullable = false)
    private LibroDomain libro;

    @OneToOne
    private UsuarioDomain usuario;
    @OneToMany(mappedBy = "ejemplar ")
    private Set<PrestamoHistoricoDomain> prestamosHistoricos
            = new HashSet<PrestamoHistoricoDomain>();

    private EjemplarDomain() {
    }

    public EjemplarDomain(LibroDomain libro, String idEjemplar) {
        super();
        this.libro = libro;
        this.idEjemplar = idEjemplar;
        this.localizacion = Localizacion.SALA;
    }

    public Long getId() {

        return id;
    }

    public EstadoEjemplar getEstado() {
        if (usuario == null) {
            return EstadoEjemplar.DISPONIBLE;
        } else {
            return EstadoEjemplar.PRESTADO;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((idEjemplar == null) ? 0 : idEjemplar.hashCode());
        result = prime * result
                + ((libro == null) ? 0 : libro.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        EjemplarDomain other = (EjemplarDomain) obj;

        if (idEjemplar == null) {
            if (other.idEjemplar != null) {
                return false;
            }
        } else if (!idEjemplar.equals(other.idEjemplar)) {
            return false;
        }
        if (libro == null) {
            if (other.libro != null) {
                return false;
            }
        } else if (!libro.equals(other.libro)) {
            return false;
        }
        return true;
    }
}
