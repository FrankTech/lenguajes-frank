/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

/**
 *
 * @author T-102
 */
public class Aplicacionthread1 {
    public static void main(String[] args) {
        //PASO NUMERO 1 DEL CICLO DE VIDA DE UN THREAD  
            //1.-CREADO
            TareaMensa t1=new TareaMensa();
            
            //2.-INICIADO
            
            
            //3.-EJECUCCION
            try{
                Thread.sleep(5000);
                      t1.start();
            }catch(InterruptedException e){
            }
            
          
            
            // LA MUERTE VIENE CUANDO ACABA DE EJECUTARSE
    }
    }

    

