/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import excepciones.InternalServerErrorException;
import excepciones.LogInDataException;
import excepciones.NoConnectionsAvailableException;
import excepciones.ServerClosedException;
import excepciones.UserExitsException;
import excepciones.UserNotActiveException;

/**
 *Es la interfaz que define los metodos para iniciar sesion(signIn) y registrarse(signUp)
 * @author Erlantz Rey
 */
public interface Signable {
    /**
     * Metodo que sirve para que un usuario existente inicie sesion
     * @param mensaje
     * @return
     * @throws InternalServerErrorException
     * @throws LogInDataException
     * @throws NoConnectionsAvailableException 
     * @throws excepciones.UserNotActiveException 
     * @throws excepciones.ServerClosedException 
     */
    public User signIn(Message mensaje) throws InternalServerErrorException, LogInDataException, NoConnectionsAvailableException, UserNotActiveException, ServerClosedException;
    
    /**
     * Metodo para que se registre un usuario nuevo
     * @param mensaje
     * @return
     * @throws InternalServerErrorException
     * @throws UserExitsException
     * @throws NoConnectionsAvailableException 
     */
    public User signUp(Message mensaje) throws InternalServerErrorException, UserExitsException, NoConnectionsAvailableException;
    
   
}
