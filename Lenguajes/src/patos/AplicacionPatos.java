/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patos;
/*PatoCanadiense pc1= new PatoCanadiense();
        PatoCanadiense pc2= new PatoCanadiense();
        System.out.println(PatoCanadiense.color);
        pc1.comer();
        
        
        PatoEuropeo pc3= new PatoEuropeo();
        PatoEuropeo pc4= new PatoEuropeo();
        System.out.println(PatoEuropeo.color);
    }
*/
/**
 *
 * @author T-102
 */
public class AplicacionPatos {
    public static void main(String[] args) {
        
        int valores[]={5,-2, 5};
        System.out.println(valores[0]);
        int tres [] = new int [3];
        tres[1]= -100;
        tres[0]=4;
        tres[2]=9;
        
        for(int i=0; i<3; i++){
            System.out.println(tres[i]);
            
        for(int j: tres){
            System.out.println(j);
        }    
        
       String saludo[]={"HOLA", "COMO", "ESTAS"};
       for(String x:saludo){
           System.out.println(x);
       }
            
            }
        
        ComportamientoVolar patos[] =new ComportamientoVolar[5];
        patos[0]=new PatoMexicano();
        patos[1]=new PatoMexicano();
        patos[2]=new PatoEuropeo();
        patos[3]=new PatoEuropeo();
        patos[4]=new PatoEuropeo();
        
        for(ComportamientoVolar p:patos){
            p.volar();
        }
    
    
    }
        
        
        
        
        
        
        
        
        
    }
       


