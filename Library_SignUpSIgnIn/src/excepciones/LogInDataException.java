/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Clase que gestiona excepcion al no coincidir contraseña o login en el inicio sesion
 * @author Adrian Rocha
 */
public class LogInDataException extends Exception {

    /**
     * Constructor de la excepcion con un mensaje
     */
    public LogInDataException() {
        super("El correo y/o la contraseña no coinciden con el de ningún usuario registrado.");
    }
}
