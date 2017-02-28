/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;

/**
 *
 * @author T-102
 * SEGUNDA FORMA DE CREAR THREAD IMPLEMENTANDO LA INTERFACE "RUNNABLE "
 */
public class TareaMejor implements Runnable{
    public static void main(String[] args) {
        //CREAR EL THREAD
        Runnable r=new TareaMejor();
        Thread t1=new Thread(r);
        //INICIARLO
        t1.start();
    }
  
    public void run() {
        System.out.println("");
    }
    
}
