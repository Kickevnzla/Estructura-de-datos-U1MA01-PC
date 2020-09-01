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
public class Nombre {
    String primerNombre, primerApellido, segundoApellido;
    
    public Nombre() {
        this.primerNombre = "NoDefinido";
        this.primerApellido = "NoDefinido";
        this.segundoApellido = "NoDefinido";
    }
    
    public Nombre(String pNombre, String pApellido, String sApellido) {
        this.primerNombre = pNombre;
        this.primerApellido = pApellido;
        this.segundoApellido = sApellido;
    }
    
    public Nombre(String n) {
        String []campos;
        campos = n.split(" ");
        
        primerNombre = campos[0];
        primerApellido = campos[1];
        segundoApellido = campos[2];
    }
    
        public Nombre(Nombre r){
        this.primerNombre = r.primerNombre;
        this.primerApellido = r.primerApellido;
        this.segundoApellido = r.segundoApellido;
    }
    
    public String toString() {
        return primerNombre + " " + primerApellido + " " + segundoApellido;
    }
}
