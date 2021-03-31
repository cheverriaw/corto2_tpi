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
public class DireccionTest extends TestCase {
    
    private Direccion direccion1;
    
    public DireccionTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        direccion1=new Direccion();
        direccion1.setCalle("El Palmar");
        direccion1.setNumero(15);
        direccion1.setPiso("2");
        direccion1.setCiudad("Santa Ana");
        direccion1.setCodigoPostal("CP 2201");
    }
    
    @Override
    protected void tearDown() throws Exception {
        direccion1 = null;
    }

    /**
     * Test of getCalle method, of class Direccion.
     */
    public void testGetCalle() {
        System.out.println("getCalle");
        String expResult = "El Palmar";
        String result = direccion1.getCalle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCalle method, of class Direccion.
     */
    public void testSetCalle() {
        System.out.println("setCalle");
        String calle = "El palmar";
        Direccion instance = new Direccion();
        instance.setCalle(calle);
    }

    /**
     * Test of getNumero method, of class Direccion.
     */
    public void testGetNumero() {
        System.out.println("getNumero");
        //Direccion instance = new Direccion();
        Integer expResult = 15;
        Integer result = direccion1.getNumero();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumero method, of class Direccion.
     */
    public void testSetNumero() {
        System.out.println("setNumero");
        Integer numero = 19;
        Direccion instance = new Direccion();
        instance.setNumero(numero);
    }

    /**
     * Test of getPiso method, of class Direccion.
     */
    public void testGetPiso() {
        System.out.println("getPiso");
        String expResult = "2";
        String result = direccion1.getPiso();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPiso method, of class Direccion.
     */
    public void testSetPiso() {
        System.out.println("setPiso");
        String piso = "4";
        Direccion instance = new Direccion();
        instance.setPiso(piso);
    }

    /**
     * Test of getCiudad method, of class Direccion.
     */
    public void testGetCiudad() {
        System.out.println("getCiudad");
        String expResult = "Santa Ana";
        String result = direccion1.getCiudad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCiudad method, of class Direccion.
     */
    public void testSetCiudad() {
        System.out.println("setCiudad");
        String ciudad = "San Salvador";
        Direccion instance = new Direccion();
        instance.setCiudad(ciudad);
    }

    /**
     * Test of getCodigoPostal method, of class Direccion.
     */
    public void testGetCodigoPostal() {
        System.out.println("getCodigoPostal");
        String expResult = "CP 2201";
        String result = direccion1.getCodigoPostal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCodigoPostal method, of class Direccion.
     */
    public void testSetCodigoPostal() {
        System.out.println("setCodigoPostal");
        String codigoPostal = "CP 2201";
        Direccion instance = new Direccion();
        instance.setCodigoPostal(codigoPostal);
    }
    
}
