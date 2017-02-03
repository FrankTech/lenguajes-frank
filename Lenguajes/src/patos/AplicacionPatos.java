/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patos;

/**
 *
 * @author T-102
 */
public class AplicacionPatos {
    public static void main(String[] args) {
        PatoCanadiense pc1= new PatoCanadiense();
        PatoCanadiense pc2= new PatoCanadiense();
        System.out.println(PatoCanadiense.color);
        pc1.comer();
        
        
        PatoEuropeo pc3= new PatoEuropeo();
        PatoEuropeo pc4= new PatoEuropeo();
        System.out.println(PatoEuropeo.color);
    }
}
