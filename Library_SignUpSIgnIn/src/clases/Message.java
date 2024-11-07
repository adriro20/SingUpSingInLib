/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *clase que guarda el usuario y Request para la comunicacion
 * entre cliente y servidor
 * @author Erlantz Rey
 */
public class Message implements Serializable{
    private User user;
    private Request request;
    
    /**
     * Constructor vacio
     */
    public Message() {
    }
    
    /**
     * Obtiene un objeto de la clase User 
     * @return User
     */
    public User getUser() {
        return user;
    }
    
    /**
     * metodo que recoge un objeto User
     * @param user que ha entrado en la aplicacion
     */
    public void setUser(User user) {
        this.user = user;
    }
    /**
     * obtiene el enum Request
     * @return Request
     */
    public Request getRequest() {
        return request;
    }
    
    /**
     * metodo que recoge un enum Request
     * @param request con la solicitud que desea hacer
     */
    public void setRequest(Request request) {
        this.request = request;
    }
    
    
}
