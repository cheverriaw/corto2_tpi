/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import junit.framework.TestCase;

/**
 *
 * @author Jose
 */
public class LibroDomainTest extends TestCase {

    public LibroDomainTest(String testName) {
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

    /*Dos libros son iguales cuando tienen el mismo ISBN*/
    public void testEquals() {
        LibroDomain librol = new LibroDomain("123456789");
        LibroDomain libro2 = new LibroDomain("123456789");
        assertTrue(librol.equals(libro2));
        libro2.setIsbn(null);
        assertFalse(librol.equals(libro2));
    }

    /*
	Prueba del funcionamiento de la pertenencia a
	la colección de ejemplares*/
    public void testContainsEjemplares() {
        LibroDomain libro = new LibroDomain("123456789");
        EjemplarDomain ejemplar1 = new EjemplarDomain(libro, "A ");
        EjemplarDomain ejemplar2 = new EjemplarDomain(libro, "B");
        EjemplarDomain ejemplar3 = new EjemplarDomain(libro, "C");
        libro.getEjemplares().add(ejemplar1);
        libro.getEjemplares().add(ejemplar2);
        // Comprueba igualdad de referencia
        assertTrue(libro.getEjemplares().contains(ejemplar1));
        assertFalse(libro.getEjemplares().contains(ejemplar3));// Comprueba igualdad de valor
        assertTrue(libro.getEjemplares().contains(new EjemplarDomain(libro, "A ")));
    }

}
