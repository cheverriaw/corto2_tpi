/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import junit.framework.TestCase;

/**
 *
 * @author william
 */
public class ReservaDomainTest extends TestCase {
    ReservaDomain a1 =new ReservaDomain();
    
    public ReservaDomainTest(String testName) {
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
     * Test of getLibro method, of class ReservaDomain.
     */
    public void testGetLibro() {
        System.out.println("getLibro");
        ReservaDomain instance = new ReservaDomain();
        LibroDomain expResult = null;
        LibroDomain result = a1.getLibro();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setLibro method, of class ReservaDomain.
     */
    public void testSetLibro() {
        System.out.println("setLibro");
        LibroDomain libro = null;
        ReservaDomain instance = new ReservaDomain();
        a1.setLibro(libro);
    
    }

    /**
     * Test of getEstado method, of class ReservaDomain.
     */
    public void testGetEstado() {
        System.out.println("getEstado");
        ReservaDomain instance = new ReservaDomain();
        EstadoHistorico expResult = null;
        EstadoHistorico result = null;
        assertEquals(expResult, result);
     
    }
    
}
