package excepciones2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T-102
 */
import excepciones2.ExtencionNoValidaException;
import java.io.*;
public class ValidacionArchivo {

    static void ValidarExtencion(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void validarExtencion(File file)throws ExtencionNoValidaException{
        //Preguntamos el NOMBRE
       String nombre= file.getName();
       
       //Como obtener la extension 
       int indice1 = nombre.indexOf(".");
       int indice2= nombre.length();
       String extencion=nombre.substring(indice1-1, indice2);
       
       if(!extencion.equals("txt"))
            
        throw new ExtencionNoValidaException();
    }
}
