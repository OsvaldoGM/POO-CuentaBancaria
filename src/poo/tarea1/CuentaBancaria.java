/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tarea1;

/**
 *
 * @author Osvaldo
 */
public class CuentaBancaria {
    private String nombre;
    private String claveInterbancaria;
    private int numeroDeCuenta;
    private double Saldo;
    private double interes;
    private String fechaDeCorte;
    
    public CuentaBancaria(){
        nombre = "Osvaldo Gabriel Gonzalez Martinez";
        claveInterbancaria = "OGGM007";
        numeroDeCuenta = 0216513;
        Saldo = 1945655.615;
        interes = 3.2;
        fechaDeCorte = "28 de Enero";
    }
    
    public CuentaBancaria (String nombre, String claveInterbancaria, int numeroDeCuenta, double Saldo, double interes, String fechaDeCorte){
        this.nombre = nombre;
        this.claveInterbancaria = claveInterbancaria;
        this.numeroDeCuenta = numeroDeCuenta;
        this.Saldo = Saldo;
        this.interes = interes;
        this.fechaDeCorte = fechaDeCorte;
    }
    // color Getter and Setter
    public String obtenNombre(){
        return nombre;
    }
    
    public void ponNombre(String nombre){
        if((nombre == null) || (nombre == "")){
            this.nombre = "Nombre no definido";
        }else{
            this.nombre = nombre;
        }
    }
    public String obtenClave(){
        return claveInterbancaria;
    }
    
    public void ponClave(String claveInterbancaria){
        if((claveInterbancaria == null) || (claveInterbancaria == "")){
            this.claveInterbancaria = "Clave Interbancaria no definda";
        }else{
            this.claveInterbancaria = claveInterbancaria;
        }
    }
    public int obtenNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    
    public void ponNumeroDeCuenta(int numeroDeCuenta){
        if(numeroDeCuenta <=0){
            this.claveInterbancaria = "Numero de cuenta no valida";
        }else{
            this.numeroDeCuenta = numeroDeCuenta;
        }
    }
    public double obtenSaldo(){
        return Saldo;
    }
    
    public void ponSaldo(double Saldo){
        this.Saldo = Saldo;
    }
    public double obtenInteres(){
        return interes;
    }
    
    public void ponInteres(double Interes){
        this.interes = interes;
    }
    public String obtenFechaDecorte(){
        return fechaDeCorte;
    }
    public void ponFechaDeCorte(String fechaDeCorte){
        if((fechaDeCorte == null) || (fechaDeCorte == "")){
            this.fechaDeCorte = "Fecha de corte no definida";
        }else{
            this.fechaDeCorte = fechaDeCorte;
        }
    }
    
}