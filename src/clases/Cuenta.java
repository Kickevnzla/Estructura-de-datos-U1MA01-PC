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
public class Cuenta {
    private int numCuenta;
    private String nomBanco;
    private Rut rut;
    private Nombre cliente;
    private double saldo;
    private Estado estado;

    public Cuenta() {
        this.numCuenta = 0;
        this.nomBanco = "NoDefinido";
        this.rut = new Rut();
        this.cliente = new Nombre();
        this.saldo = 0.0;
        this.estado = Estado.INACTIVA;
    }

    public Cuenta(int numCuenta, String nomBanco, Rut rut, Nombre cliente, double saldo, String estado) {
        this.numCuenta = numCuenta;
        this.nomBanco = nomBanco;
        this.rut = new Rut(rut);
        this.cliente = cliente;
        this.saldo = saldo;
        this.estado = Estado.valueOf(estado);
    }

    public Cuenta(Cuenta other) {
        this.numCuenta = other.numCuenta;
        this.nomBanco = other.nomBanco;
        this.rut = new Rut(other.rut);
        this.cliente = new Nombre(other.cliente);
        this.saldo = other.saldo;
        this.estado = other.estado;
    }
    
    public Cuenta(String c) {
        String []campos;
        campos = c.split(",");
        
        numCuenta = Integer.parseInt(campos[0]);
        nomBanco = campos[1];
        rut = new Rut(campos[2]);
        cliente = new Nombre(campos[3]);
        saldo = Double.parseDouble(campos[4]);
        estado = Estado.valueOf(campos[5]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(Long.toString(numCuenta));
        sb.append(",");
        sb.append(nomBanco);
        sb.append(",");
        sb.append(rut.toString());
        sb.append(",");
        sb.append(cliente.toString());
        sb.append(",");
        sb.append(Double.toString(saldo));
        sb.append(",");
        sb.append(estado.toString());
        
        return sb.toString();
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public void setCliente(Nombre cliente) {
        this.cliente = cliente;
    }
    
    public void Girar(double monto) {        
        if (saldo - monto > 0) saldo -= monto;
        else System.out.println("Saldo insuficiente");
    }
    
    public void Depositar(double monto) {
        saldo += monto;
    }
}