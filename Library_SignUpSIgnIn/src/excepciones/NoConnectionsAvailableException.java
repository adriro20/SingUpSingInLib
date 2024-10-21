/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *Clase que gestinoa excepcion de conexiones al servidor 
 * @author Adrian Rocha
 */
public class NoConnectionsAvailableException extends Exception {

    /**
     * Constructor de la excepcion con un mensaje
     */
    public NoConnectionsAvailableException() {
        super("El numero de conexiones al servidor ha llegado al limite.");
    }
}
