/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.informaciones;

/**
 *
 * @author erics
 */
public class Seccion {
    
    private String nombre ;
    private String noticia;
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
    }
    
    public void setNoticia(String noticia){
        
        this.noticia = noticia;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getNoticia(){
        return this.noticia;
        
    }
}
