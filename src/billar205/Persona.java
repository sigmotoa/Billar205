/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billar205;

/**
 *
 * @author SergioIván
 */
public class Persona 
{
    String nombre;
    String id;

    /**
     * 
     * @param nombre
     * Es el nombre para el objeto de tipo perona
     * @param id 
     * Es la id para la persona
     */
    
    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
        this.nombre="Player";
        
    }

    
    
    
    
    
    
}
