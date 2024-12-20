/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 * Enum que representa diferentes tipos de solicitudes 
 * que pueden ser enviadas al servidor durante la interacción con los clientes
 * @author Adrian Rocha
 */
public enum Request implements Serializable{
    
    /** Solicitud para registrar una nueva cuenta. */
    SING_UP_REQUEST,

    /** Solicitud para iniciar sesión en un usuario existente. */
    SING_IN_REQUEST,

    /** Excepción interna generada por errores en el servidor. */
    INTERNAL_EXCEPTION,

    /** Excepción generada por fallos en el inicio de sesión. */
    LOG_IN_EXCEPTION,

    /** Excepción generada cuando no hay conexiones disponibles. */
    CONNECTIONS_EXCEPTION,

    /** Excepción generada cuando un usuario ya existe en el sistema. */
    USER_EXISTS_EXCEPTION,
    
    /** Excepción generada cuando el usuario con el que se intenta iniciar 
     * sesión no está activo. */
    USER_NOT_ACTIVE_EXCEPTION
}
