/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import junit.framework.TestCase;
import org.mockito.InjectMocks;


/**
 *
 * @author william
 */

public class ProfesorDomainTest extends TestCase {
    
    private ProfesorDomain profesord1;
  
    
    
    public ProfesorDomainTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        //super.setUp();
        profesord1=new ProfesorDomain("jorge", "1234");
        profesord1.setDepartamento("ingeniería");
    }
    
    @Override
    protected void tearDown() throws Exception {
        //super.tearDown();
        profesord1 = null;
    }

    /**
     * Test of getDepartamento method, of class ProfesorDomain.
     */
    public void testGetDepartamento() {
        System.out.println("getDepartamento");
        String expResult = "ingeniería";
        String result = profesord1.getDepartamento();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setDepartamento method, of class ProfesorDomain.
     */
    public void testSetDepartamento() {
        System.out.println("setDepartamento");
        String departamento = "ingeniería";
        profesord1.setDepartamento(departamento);
     
    }
    
}
