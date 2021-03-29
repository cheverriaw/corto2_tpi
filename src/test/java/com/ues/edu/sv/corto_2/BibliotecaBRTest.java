/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.corto_2;

import com.ues.edu.sv.modelo.AlumnoDomain;
import com.ues.edu.sv.modelo.ProfesorDomain;
import com.ues.edu.sv.modelo.UsuarioDomain;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author FUJITSU
 */
public class BibliotecaBRTest {

  @Test
  public void testCalculaNumDiasReservaProfesor(){
      int diasProfesor = BibliotecaBR.getInstance().calculaNumDiasReserva(new ProfesorDomain("pedro.garcia", "1234"));
      assertEquals(30,diasProfesor);
  }
  
   public void testCalculaNumDiasReservaAlumno(){
      int diasProfesor = BibliotecaBR.getInstance().calculaNumDiasReserva(new AlumnoDomain("alexis.garcia", "1234"));
      assertEquals(7,diasProfesor);
  }
  
  
  
  public void testCalculaNumDiasPrestamoProfesor(){
      int diasProfesor = BibliotecaBR.getInstance().calculaNumDiasPrestamo(new ProfesorDomain("pedro.garcia", "1234"));
      assertEquals(30,diasProfesor);
  }
  
  public void testCalculaNumDiasPrestamoAlumno(){
      int diasAlumno = BibliotecaBR.getInstance().calculaNumDiasPrestamo(new AlumnoDomain("alexis.garcia", "1234"));
      assertEquals(7,diasAlumno);
  }
  
  public void testCompruebaCupoOperacionesProfesorCorrecto(){
      try{
      ProfesorDomain profesor = new ProfesorDomain ("pedro.garcia", "1234");
      BibliotecaBR.getInstance().compruebaCupoOperaciones(profesor, 8);
     
      
      }catch (BibliotecaException e){
          fail("No deberia de fallar");
      }
  }
  
  
  
   public void testCompruebaCupoOperacionesAlumnoCorrecto(){
      try{
      AlumnoDomain alumno = new AlumnoDomain ("alexis.garcia", "1234");
      BibliotecaBR.getInstance().compruebaCupoOperaciones(alumno, 5);
    
      
      }catch (BibliotecaException e){
          fail("No deberia de fallar");
      }
  }
   
  

}
