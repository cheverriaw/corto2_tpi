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
 * @author nel500
 */
public class HistoricoTest extends TestCase {

    Historico a1 = new Historico();

    public HistoricoTest(String testName) {
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
     * Test of getId method, of class Historico.
     */
    public void testGetId() {
        System.out.println("getId");
      
        Long expResult = null;
        Long result = a1.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setId method, of class Historico.
     */
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        a1.setId(id);

    }

    /**
     * Test of getFechaDevolucion method, of class Historico.
     */
    public void testGetFechaDevolucion() {
        System.out.println("getFechaDevolucion");
        Date expResult = null;
        Date result = a1.getFechaDevolucion();
        assertEquals(expResult, result);

    }

    /**
     * Test of setFechaDevolucion method, of class Historico.
     */
    public void testSetFechaDevolucion() {
        System.out.println("setFechaDevolucion");
        Date fechaDevolucion = null;
        a1.setFechaDevolucion(fechaDevolucion);

    }

    /**
     * Test of getFechaDevolucionReal method, of class Historico.
     */
    public void testGetFechaDevolucionReal() {
        
        System.out.println("getFechaDevolucionReal");
        Date expResult = null;
        Date result = a1.getFechaDevolucionReal();
        assertEquals(expResult, result);

    }

    /**
     * Test of setFechaDevolucionReal method, of class Historico.
     */
    public void testSetFechaDevolucionReal() {
        System.out.println("setFechaDevolucionReal");
        Date fechaDevolucionReal = null;
        a1.setFechaDevolucionReal(fechaDevolucionReal);

    }

    /**
     * Test of getFechaPrestamo method, of class Historico.
     */
    public void testGetFechaPrestamo() {
        System.out.println("getFechaPrestamo");
        Date expResult = null;
        Date result = a1.getFechaPrestamo();
        assertEquals(expResult, result);

    }

    /**
     * Test of setFechaPrestamo method, of class Historico.
     */
    public void testSetFechaPrestamo() {
        System.out.println("setFechaPrestamo");
        Date fechaPrestamo = null;
        a1.setFechaPrestamo(fechaPrestamo);

    }

    /**
     * Test of getUsuarioId method, of class Historico.
     */
    public void testGetUsuarioId() {
        a1.setId(null);
        System.out.println("getUsuarioId");
        String expResult = null;
        UsuarioDomain result = a1.getUsuarioId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setUsuarioId method, of class Historico.
     */
    public void testSetUsuarioId() {
        System.out.println("setUsuarioId");
        UsuarioDomain usuarioId = null;
        a1.setUsuarioId(usuarioId);

    }

    /**
     * Test of getEjemplarId method, of class Historico.
     */
    public void testGetEjemplarId() {
        System.out.println("getEjemplarId");
        EjemplarDomain expResult = null;
        EjemplarDomain result = a1.getEjemplarId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setEjemplarId method, of class Historico.
     */
    public void testSetEjemplarId() {
        System.out.println("setEjemplarId");
        EjemplarDomain ejemplarId = null;
        a1.setEjemplarId(ejemplarId);

    }

    /**
     * Test of hashCode method, of class Historico.
     */
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 0;
        int result = a1.hashCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Historico.
     */
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        boolean expResult = false;
        boolean result = a1.equals(object);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Historico.
     */
    public void testToString() {
        Long id = null;
        System.out.println("toString");
        String expResult = "com.ues.edu.sv.modelo.Historico[ id=" + id + " ]";
        String result = a1.toString();
        assertEquals(expResult, result);

    }

}
