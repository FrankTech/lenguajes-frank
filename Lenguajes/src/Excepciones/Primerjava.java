/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author T-102
 */
public class Primerjava {
    public static void main(String[] args) {
        //Vamos a ver primero la familia de excepciones que el compilador se hace cargo de eelas
             
        int x=0;
        float y=2; //con float se arregla la exepcion
        //Este renglon lanza una excepcion que se llama Arthmitec Exception 
        //System.out.println(y/x);
        
        int [] arreglo={1,2,3};
       // System.out.println(arreglo[3]);
        try{
            
        float a=2;
        float b=Float.parseFloat("venite");
        System.out.println(a*b);
        }catch (Exception hola){
            System.out.println(hola.getMessage());
            
        }
        
    }
}
