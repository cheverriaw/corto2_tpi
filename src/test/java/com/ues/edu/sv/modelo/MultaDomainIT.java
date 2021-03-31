/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import java.util.Date;
import junit.framework.TestCase;

/**
 *
 * @author FUJITSU
 */
public class MultaDomainIT extends TestCase {
    
    public MultaDomainIT(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getIdMulta method, of class MultaDomain.
     */
    public void testGetIdMulta() {
        System.out.println("getIdMulta");
        MultaDomain instance = new MultaDomain();
        int expResult = 0;
        int result = instance.getIdMulta();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIdMulta method, of class MultaDomain.
     */
    public void testSetIdMulta() {
        System.out.println("setIdMulta");
        int idMulta = 0;
        MultaDomain instance = new MultaDomain();
        instance.setIdMulta(idMulta);
        
    }

    /**
     * Test of getFechaInicio method, of class MultaDomain.
     */
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        MultaDomain instance = new MultaDomain();
        Date expResult = null;
        Date result = instance.getFechaInicio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFechaInicio method, of class MultaDomain.
     */
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        Date fechaInicio = null;
        MultaDomain instance = new MultaDomain();
        instance.setFechaInicio(fechaInicio);
        
    }

    /**
     * Test of getFechaFin method, of class MultaDomain.
     */
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        MultaDomain instance = new MultaDomain();
        Date expResult = null;
        Date result = instance.getFechaFin();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFechaFin method, of class MultaDomain.
     */
    public void testSetFechaFin() {
        System.out.println("setFechaFin");
        Date fechaFin = null;
        MultaDomain instance = new MultaDomain();
        instance.setFechaFin(fechaFin);
        
    }

    
    public void testGetUsuario() {
        System.out.println("getUsuario");
        MultaDomain instance = new MultaDomain();
        UsuarioDomain expResult = null;
        UsuarioDomain result = instance.getUsuario();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setUsuario method, of class MultaDomain.
     */
    public void testSetUsuario() {
        System.out.println("setUsuario");
        UsuarioDomain usuario = null;
        MultaDomain instance = new MultaDomain();
        instance.setUsuario(usuario);
        
   
    } 
    
}
