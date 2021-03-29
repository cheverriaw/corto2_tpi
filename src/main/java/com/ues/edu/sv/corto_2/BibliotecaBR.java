/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ues.edu.sv.corto_2;

import com.ues.edu.sv.modelo.AlumnoDomain;
import com.ues.edu.sv.modelo.ProfesorDomain;
import com.ues.edu.sv.modelo.UsuarioDomain;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author FUJITSU
 */
public class BibliotecaBR {

    private int numDiasPrestamoAlumno = 7;
    private int numDiasPrestamoProfesor = 30;
    private int cupoOperacionesAlumno = 5;
    private int cupoOperacionesProfesor = 8;
    private static Log logger = LogFactory.getLog(BibliotecaBR.class);

    private static BibliotecaBR me = new BibliotecaBR();

    private BibliotecaBR() {
        logger.debug("creada instancia de " + BibliotecaBR.class);
    }

    public static BibliotecaBR getInstance() {
        return me;
    }

    /**
     * Calcula el número de dias de plazo que tienen un usuario para realizar
     * una reserva (Socio = 5 , Profesor = 10)
     *
     * @param tipo tipo del usuario
     * @return número de dias de reserva
     * @throws BibliotecaException el tipo del usuario no es válido
     */
    public int calculaNumDiasReserva(UsuarioDomain usuario)
            throws BibliotecaException {

        if (usuario instanceof AlumnoDomain) {

            return numDiasPrestamoAlumno;
        } else if (usuario instanceof ProfesorDomain) {
            return numDiasPrestamoProfesor;
        } else {
            String msg = "solo los alumnos y profesores pueden";
            logger.error(msg);
            throw new BibliotecaException(msg);

        }
    }

    /**
     * Calcula el número de dias de plazo que tienen un usuario para realizar un
     * prestamo (Alumno = 7 , Profesor = 30)
     *
     * @param tipo tipo del usuario
     * @return número de dias del prestamo
     * @throws BibliotecaException el tipo del usuario no es válido
     */
    public int calculaNumDiasPrestamo(UsuarioDomain usuario)
            throws BibliotecaException {
        if (usuario instanceof AlumnoDomain) {
            return numDiasPrestamoAlumno;
        } else if (usuario instanceof ProfesorDomain) {
            return numDiasPrestamoProfesor;
        } else {
            String msg = "Solo los alumnos y  pro fesores pueden realizar prestamos";

            logger.error(msg);
            throw new BibliotecaException(msg);
        }
    }

    /**
     * Valida que el número de operaciones realizadas por un determinado tipo de
     * usuario se inferior al cupo definido
     *
     * @param tipo tipo del usuario
     * @param numOp número de operación que ya tiene realizadas
     * @throws BibliotecaException el cupo de operacion esta lleno, o el tipo
     * del usuario no es el esperado
     */
    public void compruebaCupoOperaciones(UsuarioDomain usuario, int numOp)
            throws BibliotecaException {
        String msg;

        if (!(usuario instanceof AlumnoDomain) && !(usuario instanceof ProfesorDomain)) {
            msg = "Solo los alumnos y  profesores pueden tener libros prestados";
            logger.error(msg);
            throw new BibliotecaException(msg);

        }
        if ((usuario instanceof AlumnoDomain && numOp > cupoOperacionesAlumno) || (usuario instanceof ProfesorDomain && numOp > cupoOperacionesProfesor)) {
            msg = "El cupo de operaciones posibles esta lleno";
            logger.error(msg);
            throw new BibliotecaException(msg);
        }

    }
    
    public int cupoOperaciones (UsuarioDomain usuario)
            throws BibliotecaException {
    if (usuario instanceof AlumnoDomain){
    return cupoOperacionesAlumno;
    }else if (usuario instanceof ProfesorDomain){
    return cupoOperacionesProfesor;
    }else {
    String msg = "Solo los alumnos y profesores pueden tener libros prestados";
   logger.error(msg);
    throw new BibliotecaException(msg);
    }
    
    }
}