/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import excepciones.InternalServerErrorException;
import excepciones.LogInDataException;
import excepciones.NoConnectionsAvailableException;
import excepciones.UserExitsException;

/**
 *
 * @author 2dam
 */
public interface Signable {
    
    public void signIn(Message mensaje) throws InternalServerErrorException, LogInDataException, NoConnectionsAvailableException;
    
    public void signUp(Message mensaje) throws InternalServerErrorException, UserExitsException, NoConnectionsAvailableException;
    
    public void logOut(Message mensaje) throws InternalServerErrorException;
    
}
