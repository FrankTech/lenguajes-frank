/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominas1;

/**
 *
 * @author T-102
 */
public class AplicacionNomina {
    public static void main(String[] args) {
        int x=2;
        Trabajador worker=new Trabajador(); /* Worker = objeto Consutructor */ 
        worker.setNombre("Pedro");    /* objeto.atributo */
        worker.setPaterno("Lopez");    /* objeto.atributo */
        worker.setNumeroSeguro(90);    /* objeto.atributo */
        if(worker.getNumeroSeguro()<=90)worker.setNumeroSeguro(100);
        
        
        System.out.println("El nombre es "+ worker.getNombre() );
        System.out.println("El seguro es  "+ worker.getNumeroSeguro() );
        
        
        
        
    }
    
}
