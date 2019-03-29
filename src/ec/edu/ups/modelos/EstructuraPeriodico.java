/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelos;

import java.util.Date;

/**
 * 
 * EstructuraPeriodico
 * 
 * Clase que permite estructura mi periodico digital
 *
 * 
 * 
 * 
 * @author erics
 */
public class EstructuraPeriodico {
    
    private String ubicacion;
    private String nombrePeriodico;
    private Date fecha;
    private String portada;
    private String encabezado;
  //  private String seccion;
    
    /**
     * 
     * @param ubicacion 
     */
    public void setUbicacion (String ubicacion){
        
       this.ubicacion = ubicacion;
       
}
       
    public void setNombrePeriodico (String nombrePeriodico){
        
        this.nombrePeriodico = nombrePeriodico;
    }
    
    public void setFecha (Date fecha){
        
        this.fecha = fecha;
    }
    
    public void setPortada (String portada){
        
        this.portada = portada;
    }
    
    public void setEncabezado (String encabezado){
        
        this.encabezado = encabezado;
    }
    
    public String getubicacion(){
        
        return this.ubicacion;
    }
    
    public String getnombrePeriodico(){
       
        return this.nombrePeriodico;
    }
    
    public Date getfecha(){
       
        return this.fecha;
        
    }
    
    public String getportada (){
        
        return this.portada;
    }
    
    public String getencabezado(){
        
        return this.encabezado;
    }

    public void setFecha(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
}
    