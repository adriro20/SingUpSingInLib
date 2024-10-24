/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Clase que gestiona si el usuario esta activo o no al iniciar sesión
 * @author Adrian Rocha
 */
public class UserNotActiveException extends Exception {

    /**
     * Constructor de la excepcion con un mensaje
     */
    public UserNotActiveException() {
        super("El usuario no está activo.");
    }
}
