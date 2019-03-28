/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.publicaciones;

import java.util.Date;

/**
 *
 * @author erics
 */
public class Noticia {
    
    private String titulo ;
    private String autor;
    private Date fecha;
    private String contenido;
    private Byte[] multimedia;
    
    
    public void setTitulo (String titulo){
        
        this.titulo = titulo;
    }
    
    public void setAutor (String autor){
        
        this.autor = autor;
    }
    
    public void setFecha (Date fecha){
        
        this.fecha = fecha;
    }
    
     public void setContenido (String contenido){
        
        this.contenido = contenido;
    }
    
     public String titulo (){
         
         return this.titulo;
     }
     
     public String autor(){
         
         return this.autor;
     }
     
     public Date fecha(){
         
         return this.fecha;
     }
     
     public String contenido(){
         
         return this.contenido;
     }
     
     
}
