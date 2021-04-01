/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import junit.framework.TestCase;

/**
 *
 * @author nel500
 */
public class AlumnoDomainTest extends TestCase {
    AlumnoDomain a1=new AlumnoDomain("","");
    
    public AlumnoDomainTest(String testName) {
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
     * Test of getTutor method, of class AlumnoDomain.
     */
    public void testGetTutor() {
        a1.setTutor("pedro");
        System.out.println("getTutor");
        String expResult = "pedro";
        String result = a1.getTutor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTutor method, of class AlumnoDomain.
     */
    public void testSetTutor() {
        System.out.println("setTutor");
        String tutor = "pedro";
        AlumnoDomain instance =null;
        a1.setTutor(tutor);
       
    }
    
}
