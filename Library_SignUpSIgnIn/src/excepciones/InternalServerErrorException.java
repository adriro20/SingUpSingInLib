/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *Clase que gestinoa excepcion del servidor
 * @author Adrian Rocha
 */
public class InternalServerErrorException extends Exception {

    /**
     * Constructor de la excepcion con un mensaje
     */
    public InternalServerErrorException() {
        super("Error interno del servidor.");
    }
}
