/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.informaciones.Seccion;
import ec.edu.ups.modelos.EstructuraPeriodico;
import ec.edu.ups.publicaciones.Noticia;
import ec.edu.ups.videos.Multimedia;
import java.util.Date;

/**
 *
 * @author erics
 */
public class Prueba {
    
    public static void main (String [] args ){
  
        RedSocial facebook = new RedSocial ();
        facebook.setCodigo(1);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");
        int cod = facebook.getCodigo();
        System.out.println("Codigo:"+" "+cod);
        String nom = facebook.getNombre();
        System.out.println("Nombre:"+" "+nom);
        String ur = facebook.getUrl();
        System.out.println("Url de la pagina:"+" "+ur);
        
        System.out.println("");
        
        Seccion noticia = new Seccion ();
        noticia.setNombre("Farandula");
        //noticia.setNoticia("Su mujer es infiel");
        String no = noticia.getNombre();
        System.out.println("La seccion es:"+""+no);
       // String noti = noticia.getNoticia();
       // System.out.println("Noticia del dia:"+" "+noti);
        
        System.out.println("");
        
        Multimedia archivo = new Multimedia ();
        archivo.setNombre("hola");
        archivo.setFormato("png");
        archivo.setByte(Byte.MAX_VALUE);
        archivo.setTamaño(Double.MAX_VALUE);
        String n = archivo.getNombre();
        System.out.println("Titulo del video es :"+" "+n);
        String forma = archivo.getFormato();
        System.out.println("El formato adecaudo para descargar es :"+" "+forma);
        Double tam = archivo.getTamaño();
        System.out.println("El tamaño es:"+" "+tam);
        Byte  by = archivo.getArchivo();
        System.out.println("byte es:"+" "+by);
        
        System.out.println("");
        
        EstructuraPeriodico diseño = new EstructuraPeriodico();
        diseño.setUbicacion("Gualaceo");
        diseño.setNombrePeriodico("Mundo Noticas");
        Date fecha = null;
        diseño.setFecha(fecha);
        diseño.setPortada("Bienvenidos a Mundo Noticas");
        diseño.setEncabezado("Primer lugar");
        String ubi = diseño.getubicacion();
        System.out.println("La ubiacion es:"+" "+ubi);
        String nompe = diseño.getnombrePeriodico();
        System.out.println("Nombre del portal es:"+" "+nompe);
        Date fec = diseño.getfecha();
        System.out.println("La fecha es:"+" "+fec);
        String por = diseño.getportada();
        System.out.println("La portada es:"+" "+por);
        String enca = diseño.getencabezado();
        System.out.println("Encabezado general es :"+" "+enca);
        
        System.out.println("");
        
        
        Noticia relacion = new Noticia();
        relacion.setAutor("Ana Frank");
        relacion.setContenido("Informacion en general sobre todo lo que pasa en su canton, cuidad y noticias internacionales ");
        relacion.setFecha(fecha);
        relacion.setTitulo("La mejor colada morada");
             
    }
    
    
    
    
    
}
