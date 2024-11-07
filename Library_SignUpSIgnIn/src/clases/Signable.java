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
     * @param user usuario que entra en la aplicacion
     * @return User
     * @throws InternalServerErrorException Cualquier excepcion fuera de la libreria.
     * @throws LogInDataException si los datos no coinciden
     * @throws NoConnectionsAvailableException Excepcion que salta cuando se supera el numero maximo de conexiones.
     * @throws excepciones.UserNotActiveException comprueba si el usuario no esta activo
     * @throws excepciones.ServerClosedException salta si el servidor esta cerrado
     */
    public User signIn(User user) throws InternalServerErrorException, LogInDataException, NoConnectionsAvailableException, UserNotActiveException, ServerClosedException;
    
    /**
     * Metodo para que se registre un usuario nuevo
     * @param user usuario que entra en la aplicacion
     * @return User
     * @throws InternalServerErrorException Cualquier excepcion fuera de la libreria.
     * @throws UserExitsException n Excepcion provocada cuando se intenta registrar usuario ya existente.
     * @throws NoConnectionsAvailableException Excepcion que salta cuando se supera el numero maximo de conexiones.
     * @throws excepciones.ServerClosedException Excepcion de servidor apagado.
     */
    public User signUp(User user) throws InternalServerErrorException, UserExitsException, NoConnectionsAvailableException, ServerClosedException;
    
   
}
