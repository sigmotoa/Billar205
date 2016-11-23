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
public class Jugador extends Persona 
{   /**
    * en caso de true, es un profesional
    * en caso de false, es amateur
    */
   boolean categoria;

    public Jugador(boolean categoria, String nombre, String id) {
        super(nombre, id);
        this.categoria = categoria;
    }
   
   
    
    
}
