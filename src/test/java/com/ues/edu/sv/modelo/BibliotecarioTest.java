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
public class BibliotecarioTest extends TestCase {
    Bibliotecario a1 = new Bibliotecario();
    
    public BibliotecarioTest(String testName) {
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
     * Test of getId method, of class Bibliotecario.
     */
    public void testGetId() {
        System.out.println("getId");
        Bibliotecario instance = new Bibliotecario();
        Long expResult = null;
        Long result = a1.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Bibliotecario.
     */
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Bibliotecario instance = new Bibliotecario();
        instance.setId(id);
       
    }

    /**
     * Test of getEmail method, of class Bibliotecario.
     */
    public void testGetEmail() {
        a1.setEmail("pedro123@gmail.com");
        System.out.println("getEmail");
        Bibliotecario instance = new Bibliotecario();
        String expResult = a1.getEmail();
        String result = "pedro123@gmail.com";
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setEmail method, of class Bibliotecario.
     */
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "pedro123@gmail.com";
        Bibliotecario instance = new Bibliotecario();
        a1.setEmail(email);
       
    }

    /**
     * Test of getLogin method, of class Bibliotecario.
     */
    public void testGetLogin() {
        a1.setLogin("pedro");
        System.out.println("getLogin");
        Bibliotecario instance = new Bibliotecario();
        String expResult = "pedro";
        String result = a1.getLogin();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setLogin method, of class Bibliotecario.
     */
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Bibliotecario instance = new Bibliotecario();
        a1.setLogin(login);
        
    }

    /**
     * Test of getNif method, of class Bibliotecario.
     */
    public void testGetNif() {
        a1.setNif("0023ed");
        System.out.println("getNif");
        Bibliotecario instance = new Bibliotecario();
        String expResult = "0023ed";
        String result = a1.getNif();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNif method, of class Bibliotecario.
     */
    public void testSetNif() {
        System.out.println("setNif");
        String nif = "";
        Bibliotecario instance = new Bibliotecario();
        a1.setNif(nif);
        
    }

    /**
     * Test of getPassword method, of class Bibliotecario.
     */
    public void testGetPassword() {
        System.out.println("getPassword");
        Bibliotecario instance = new Bibliotecario();
        String expResult = null;
        String result = a1.getPassword();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPassword method, of class Bibliotecario.
     */
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Bibliotecario instance = new Bibliotecario();
        instance.setPassword(password);
        
    }

    /**
     * Test of hashCode method, of class Bibliotecario.
     */
    public void testHashCode() {
        System.out.println("hashCode");
        Bibliotecario instance = new Bibliotecario();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Bibliotecario.
     */
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Bibliotecario instance = new Bibliotecario();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Bibliotecario.
     */
    public void testToString() {
        String id = null;
        System.out.println("toString");
        Bibliotecario instance = new Bibliotecario();
        String expResult = "com.ues.edu.sv.modelo.Bibliotecario[ id=" + id + " ]";
        String result = a1.toString();
        assertEquals(expResult, result);
        
    }
    
}
