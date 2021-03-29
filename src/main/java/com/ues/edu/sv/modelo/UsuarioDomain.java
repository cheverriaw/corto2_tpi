/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author FUJITSU
 */
@Entity
@Table (name = "usuario")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "tipo",
discriminatorType=DiscriminatorType.STRING)

public abstract class UsuarioDomain extends DomainObject {
private static final long serialVersionUID = 1l;

@Id @GeneratedValue 
private Long id;

@Column(unique=true)
private String login; 
private String password;
@Column(unique=true) 
private String email; 
private String nombre; 
private String apellido ;
private String apellido2;
@Embedded

private Direccion direccion;
@Enumerated (EnumType.STRING)
@Column (columnDefinition="enum ('ACTIVO '' MOROSO '' MULTADO .)",
nullable=false)
private EstadoUsuario estado;
@OneToMany(mappedBy= "usuario")
private Set<EjemplarDomain> prestamos = new HashSet <EjemplarDomain>() ;
@OneToMany(mappedBy= "usuario")
private Set<ReservaDomain> reservas = new HashSet<ReservaDomain>( );
@OneToMany(mappedBy="usuario")
private Set<PrestamoHistoricoDomain> prestamosHistoricos = new HashSet<PrestamoHistoricoDomain>() ;
@OneToMany(mappedBy= "usuario")
private Set<MultaDomain> multas = new HashSet<MultaDomain>( );

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public EstadoUsuario getEstado() {
        return estado;
    }

    public void setEstado(EstadoUsuario estado) {
        this.estado = estado;
    }

    public Set<EjemplarDomain> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<EjemplarDomain> prestamos) {
        this.prestamos = prestamos;
    }

    public Set<ReservaDomain> getReservas() {
        return reservas;
    }

    public void setReservas(Set<ReservaDomain> reservas) {
        this.reservas = reservas;
    }

    public Set<PrestamoHistoricoDomain> getPrestamosHistoricos() {
        return prestamosHistoricos;
    }

    public void setPrestamosHistoricos(Set<PrestamoHistoricoDomain> prestamosHistoricos) {
        this.prestamosHistoricos = prestamosHistoricos;
    }

    public Set<MultaDomain> getMultas() {
        return multas;
    }

    public void setMultas(Set<MultaDomain> multas) {
        this.multas = multas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.login);
        hash = 83 * hash + Objects.hashCode(this.password);
        hash = 83 * hash + Objects.hashCode(this.email);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.apellido);
        hash = 83 * hash + Objects.hashCode(this.apellido2);
        hash = 83 * hash + Objects.hashCode(this.direccion);
        hash = 83 * hash + Objects.hashCode(this.estado);
        hash = 83 * hash + Objects.hashCode(this.prestamos);
        hash = 83 * hash + Objects.hashCode(this.reservas);
        hash = 83 * hash + Objects.hashCode(this.prestamosHistoricos);
        hash = 83 * hash + Objects.hashCode(this.multas);
        return hash;
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
        final UsuarioDomain other = (UsuarioDomain) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.apellido2, other.apellido2)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.prestamos, other.prestamos)) {
            return false;
        }
        if (!Objects.equals(this.reservas, other.reservas)) {
            return false;
        }
        if (!Objects.equals(this.prestamosHistoricos, other.prestamosHistoricos)) {
            return false;
        }
        if (!Objects.equals(this.multas, other.multas)) {
            return false;
        }
        return true;
    }




}

