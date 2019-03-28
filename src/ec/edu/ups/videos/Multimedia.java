/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.videos;

/**
 *
 * @author erics
 */
public class Multimedia {
    
    private String nombre;
    private String formato;
    private Double tamañoByte;
    private Byte archivo;
    
    public void  setNombre (String nombre){
        
        this.nombre = nombre;
        
    }
    
    public void setFormato(String formato){
        
        this.formato = formato;
    }
    
    public void setTamaño (Double tamañoByte){
        
        this.tamañoByte = tamañoByte;
        
    }
    
    public void setByte (Byte archivo){
        
        this.archivo = archivo;
    }
    
    public String getNombre(){
        
        return this.nombre;
    }
    
    public String getFormato(){
        
        return this.formato;
    }
    
    public Double getTamaño (){
        
        return this.tamañoByte;
    }
    
    public Byte getArchivo(){
        
        return this.archivo;
    }
    
}
