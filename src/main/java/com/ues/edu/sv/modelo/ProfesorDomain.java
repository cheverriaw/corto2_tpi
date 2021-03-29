/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author FUJITSU
 */
@Entity
@DiscriminatorValue (value = "PROFESOR")
public class ProfesorDomain extends UsuarioDomain {
private static final long serialVersionUID = 1L;
private String departamento;

private ProfesorDomain (){}

public ProfesorDomain(String login, String password){
        super ();
this.setLogin (login); this.setPassword(password);
this.setEstado (EstadoUsuario.ACTIVO);
}

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}