/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.Scanner;

/**
 *
 * @author Jesus Paredes
 */
public class AppSaludo {
    
        String nombre;
        Scanner sc = new Scanner(System.in);
        
        public void Saludar() {
        System.out.print("Ingrese su nombre:");
        
        nombre = sc.nextLine();
        
        System.out.println("Hola " + nombre);    
        }
}