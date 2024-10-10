/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author Adrian Rocha
 */
public enum Request implements Serializable{
    SING_UP,  // Registro de cuenta
    SING_IN,  // Inicio de sesión
    SING_OUT, // Cierre de sesión
    CLOSE,     // Apagar servidor
    INTERNAL,
    LOG_IN,
    CONNECTIONS,
    USER_EXISTS
}
