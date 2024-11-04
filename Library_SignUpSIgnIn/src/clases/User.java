/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *Clase que representa un usuario del sistema y 
 * guarda sus datos 
 * @author Erlantz Rey, Julen Hidalgo
 */
public class User implements Serializable{
/**Company_id que siemple es 1*/
private Integer company_id;
/**name es el nombre y apellidos del usuario*/
private String name;
/**el zip es el codigo postal*/
private String zip;
/**El correo electronico*/
private String email;
/**Calle donde vive*/
private String street;
/**Ciudad donde vive*/
private String city;
/**contraseña dek usuario*/
private String password;
/**Saber si el usuario esta activo o no*/
private boolean active;

    /**Constructor vacio*/
    public User() {
    }
    
    /**
     * Obtiene el id de la compañia
     * @return Integer
     */
    public Integer getCompany_id() {
        return company_id;
    }
    
    /**
     * metodo para recoger el id de la compañia
     * @param company_id 
     */
    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }
    /**
     * Obtiene el nombre y apellido del usuario
     * @return String
     */
    public String getName() {
        return name;
    }
    
    /**
     * metodo para recoger nombre y apellido
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Obtiene el codigo postal
     * @return String
     */
    public String getZip() {
        return zip;
    }
    
    /**
     * metodo para recoger el codigo postal
     * @param zip 
     */
    public void setZip(String zip) {
        this.zip = zip;
    }
    /**
     * Obtiene el correo electronico
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * metodo para recoger el email (Correo electonico)
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Obtiene la calle 
     * @return String
     */
    public String getStreet() {
        return street;
    }
    
    /**
     * metodo para recoger la calle
     * @param street 
     */
    public void setStreet(String street) {
        this.street = street;
    }
    /**
     * Obtiene la ciudad 
     * @return String
     */
    public String getCity() {
        return city;
    }
    
    /**
     * metodo para recoger la ciudad
     * @param city 
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * Obtiene la contraseña del usuario
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * metodo para recoger la contraseña
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Dice si el usuario es activo o no
     * @return boolean
     */
    public boolean isActive() {
        return active;
    }
  
    /**
     * metodo para recoger si el usuario es activo o no
     * @param active 
     */
    public void setActive(boolean active) {
        this.active = active;
    }
        
}