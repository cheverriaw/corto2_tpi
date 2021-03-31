/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.modelo;

import java.util.Date;
import junit.framework.TestCase;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author william
 */
@ExtendWith(MockitoExtension.class)
public class PrestamoHistoricoDomainTest extends TestCase {
    
    //la clase que le estamos haciendo el test
    @InjectMocks
    private PrestamoHistoricoDomain prestamoHD=new PrestamoHistoricoDomain();
    //las dependecias
    @Mock
    private LibroDomain librod1;
    @Mock
    private UsuarioDomain usuariod1;
    
    
    public PrestamoHistoricoDomainTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        //super.setUp();
        prestamoHD.setLibro(librod1);
        prestamoHD.setFechaFinReal(new Date(2021-1900,3,17));
        prestamoHD.setIdOperacion(7);
        prestamoHD.setUsuario(usuariod1);
        prestamoHD.setTipo(EstadoEjemplar.DISPONIBLE);
        prestamoHD.setFechaInicio(new Date(2021-1900,3,10));
        prestamoHD.setFechaFin(new Date(2021-1900,3,18));
        prestamoHD.setEstado(EstadoHistorico.Historica);
        
    }
    
    @Override
    protected void tearDown() throws Exception {
        //super.tearDown();
        prestamoHD = null;
        librod1 = null;
        usuariod1 = null;
    }

    /**
     * Test of getLibro method, of class PrestamoHistoricoDomain.
     */
    public void testGetLibro() {
        System.out.println("getLibro");
        LibroDomain result = prestamoHD.getLibro();
        assertEquals(librod1, result);
    }

    /**
     * Test of setLibro method, of class PrestamoHistoricoDomain.
     */
    public void testSetLibro() {
        System.out.println("setLibro");
        PrestamoHistoricoDomain instance = new PrestamoHistoricoDomain();
        instance.setLibro(librod1);
    }

    /**
     * Test of getFechaFinReal method, of class PrestamoHistoricoDomain.
     */
    public void testGetFechaFinReal() {
        System.out.println("getFechaFinReal");
        //se elije la fecha actual
        Date expResult = new Date(2021-1900,3,17);
        Date result = prestamoHD.getFechaFinReal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaFinReal method, of class PrestamoHistoricoDomain.
     */
    public void testSetFechaFinReal() {
        System.out.println("setFechaFinReal");
        Date fechaFinReal = new Date(2021-1900,3,17);
        PrestamoHistoricoDomain instance = new PrestamoHistoricoDomain();
        instance.setFechaFinReal(fechaFinReal);
    }

    /**
     * Test of getIdOperacion method, of class PrestamoHistoricoDomain.
     */
    public void testGetIdOperacion() {
        System.out.println("getIdOperacion");
        int expResult = 7;
        int result = prestamoHD.getIdOperacion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdOperacion method, of class PrestamoHistoricoDomain.
     */
    public void testSetIdOperacion() {
        System.out.println("setIdOperacion");
        int idOperacion = 6;
        PrestamoHistoricoDomain instance = new PrestamoHistoricoDomain();
        instance.setIdOperacion(idOperacion);
    }

    /**
     * Test of getUsuario method, of class PrestamoHistoricoDomain.
     */
    public void testGetUsuario() {
        System.out.println("getUsuario");
        UsuarioDomain result = prestamoHD.getUsuario();
        assertEquals(usuariod1, result);
    }

    /**
     * Test of setUsuario method, of class PrestamoHistoricoDomain.
     */
    public void testSetUsuario() {
        System.out.println("setUsuario");
        PrestamoHistoricoDomain instance = new PrestamoHistoricoDomain();
        instance.setUsuario(usuariod1);
    }

    /**
     * Test of getTipo method, of class PrestamoHistoricoDomain.
     */
    public void testGetTipo() {
        System.out.println("getTipo");
        EstadoEjemplar expResult = null;
        EstadoEjemplar result = prestamoHD.getTipo();
        assertEquals(expResult.DISPONIBLE, result);
    }

    /**
     * Test of setTipo method, of class PrestamoHistoricoDomain.
     */
    public void testSetTipo() {
        System.out.println("setTipo");
        EstadoEjemplar tipo = null;
        PrestamoHistoricoDomain instance = new PrestamoHistoricoDomain();
        instance.setTipo(tipo.PRESTADO);
    }

    /**
     * Test of getFechaInicio method, of class PrestamoHistoricoDomain.
     */
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        //PrestamoHistoricoDomain instance = new PrestamoHistoricoDomain();
        Date expResult = new Date(2021-1900,3,10);
        Date result = prestamoHD.getFechaInicio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaInicio method, of class PrestamoHistoricoDomain.
     */
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        Date fechaInicio = new Date();
        PrestamoHistoricoDomain instance = new PrestamoHistoricoDomain();
        instance.setFechaInicio(fechaInicio);
    }

    /**
     * Test of getFechaFin method, of class PrestamoHistoricoDomain.
     */
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        //PrestamoHistoricoDomain instance = new PrestamoHistoricoDomain();
        Date expResult = new Date(2021-1900,3,18);
        Date result = prestamoHD.getFechaFin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaFin method, of class PrestamoHistoricoDomain.
     */
    public void testSetFechaFin() {
        System.out.println("setFechaFin");
        Date fechaFin = new Date(2021-1900,3,18);
        PrestamoHistoricoDomain instance = new PrestamoHistoricoDomain();
        instance.setFechaFin(fechaFin);
    }

    /**
     * Test of getEstado method, of class PrestamoHistoricoDomain.
     */
    public void testGetEstado() {
        System.out.println("getEstado");
        EstadoHistorico expResult = null;
        EstadoHistorico result = prestamoHD.getEstado();
        assertEquals(expResult.Historica, result);
    }

    /**
     * Test of setEstado method, of class PrestamoHistoricoDomain.
     */
    public void testSetEstado() {
        System.out.println("setEstado");
        EstadoHistorico estado = null;
        PrestamoHistoricoDomain instance = new PrestamoHistoricoDomain();
        instance.setEstado(estado.Activa);
    }
    
}
