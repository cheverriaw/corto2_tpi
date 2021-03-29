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
  public void testCalculaNumDiasPrestamoProfesor(){
      int diasProfesor = BibliotecaBR.getInstance().calculaNumDiasPrestamo(new ProfesorDomain("pedro.garcia", "1234"));
      assertEquals(30,diasProfesor);
  }
  
  public void testCalculaNumDiasPrestamoAlumno(){
      int diasAlumno = BibliotecaBR.getInstance().calculaNumDiasPrestamo(new AlumnoDomain("alexis.garcia", "1234"));
      assertEquals(30,diasAlumno);
  }
  public void testCompruebaCupoOperacionesProfesorCorrecto(){
      try{
      ProfesorDomain profesor = new ProfesorDomain ("pedro.garcia", "1234");
      BibliotecaBR.getInstance().compruebaCupoOperaciones(profesor, 8);
      BibliotecaBR.getInstance().compruebaCupoOperaciones(profesor, 1);
      
      }catch (BibliotecaException e){
          fail("No deberia de fallar");
      }
  }
  
   public void testCompruebaCupoOperacionesProfesorIncorrecto() throws BibliotecaException{
      BibliotecaBR.getInstance().compruebaCupoOperaciones(new ProfesorDomain("Pedro.garcia","12"),9);
  }
  
   public void testCompruebaCupoOperacionesAlumnoCorrecto(){
      try{
      AlumnoDomain alumno = new AlumnoDomain ("alexis.garcia", "1234");
      BibliotecaBR.getInstance().compruebaCupoOperaciones(alumno, 8);
      BibliotecaBR.getInstance().compruebaCupoOperaciones(alumno, 1);
      
      }catch (BibliotecaException e){
          fail("No deberia de fallar");
      }
  }
   public void testCompruebaCupoOperacionesAlumnoIncorrecto() throws BibliotecaException{
      BibliotecaBR.getInstance().compruebaCupoOperaciones(new AlumnoDomain("Alexisgarcia","12"),9);
  }
  

}
