/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializador;


import java.util.ArrayList;
/**
 *
 * @author T-102
 */
public class MainCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes=new ArrayList<>();
        //Creamos el primer cliente 
        Cliente c1=new Cliente("Juan", 20000, 19);
        Cliente c2=new Cliente("Pedro", 16500, 23);
        Cliente c3=new Cliente("Ana", 23000, 20);
        
        //Al arraylist que se llama: Clientes le agregamos
        //uno a uno los 3 clientes 
        
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        
        //Iteramos el arraylist 
        for(Cliente c:clientes){
            System.out.println(c);
        }
        
    }
    
    
    
}
