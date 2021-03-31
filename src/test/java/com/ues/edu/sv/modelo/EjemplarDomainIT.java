/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import junit.framework.TestCase;

/**
 *
 * @author FUJITSU
 */
public class EjemplarDomainIT extends TestCase {
    private EstadoEjemplar ejemplar;
    private EjemplarDomain ejemplar2;
    private long numero1 =1;
        private long numero2 =1;
    
    public EjemplarDomainIT(String testName) {
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
     * Test of getId method, of class EjemplarDomain.
     */
    public void testGetId() {
        System.out.println("getId");
        EjemplarDomain instance = ejemplar2;
        Long expResult = numero1;
        Long result = numero2;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEstado method, of class EjemplarDomain.
     */
    public void testGetEstado() {
        System.out.println("getEstado");
       EstadoEjemplar instance =  ejemplar;
        EstadoEjemplar expResult = EstadoEjemplar.DISPONIBLE;
        EstadoEjemplar result = instance.DISPONIBLE;
        assertEquals(expResult, result);
        
    }

    
}
