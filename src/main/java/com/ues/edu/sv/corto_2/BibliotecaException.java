/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.corto_2;

/**
 *
 * @author FUJITSU
 */
public class BibliotecaException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BibliotecaException() {
        super();
    }

    public BibliotecaException(String message) {
        super(message);
    }

    public BibliotecaException(String message, Throwable cause) {
    }
}
