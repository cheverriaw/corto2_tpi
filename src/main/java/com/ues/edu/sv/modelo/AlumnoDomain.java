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
@DiscriminatorValue (value =  "ALUMNO")
public class AlumnoDomain extends UsuarioDomain {

static final long serialVersionUID =  1L; 
String tutor;
private AlumnoDomain()	{}
public AlumnoDomain(String login, String password) { 
    super();
    this.setLogin(login); 
    this.setPassword(password); 
    this.setEstado (EstadoUsuario.ACTIVO);
   
}

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }




}

