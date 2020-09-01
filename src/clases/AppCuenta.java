/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author kickevnzla
 */
public class AppCuenta {
    public static void main(String ...args) {
        
        // Parte 1
        Cuenta cuenta1 = new Cuenta("1234,SANTANDER,25647916-8,Jesus Paredes Arnaez,123000,ACTIVA");
        
        Cuenta cuenta2 = new Cuenta(1234, "BCI", new Rut(12345678), 
                         new Nombre("Esteban", "Quito", "Bajo"), 
                         1200000.0, "ACTIVA");
        
        Cuenta cuenta3 = new Cuenta(cuenta2);
        
        // Parte 2
        System.out.println("Cuenta1: \n" + cuenta1.toString());
        System.out.println("Cuenta2: \n" + cuenta2.toString());
        System.out.println("Cuenta3: \n" + cuenta3.toString());
        
        cuenta2.Girar(200000.0);
        
        System.out.println("Cuenta2: \n" + cuenta2.toString());
        
        cuenta2.Depositar(500000.0);
        
        System.out.println("Cuenta2: \n" + cuenta2.toString());
    }
    
}
