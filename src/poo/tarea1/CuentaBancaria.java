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
    //Aqui se definen todos los atributos que llevara esta clase
    private String nombre;
    //La clave aunque lleve numeros debe ser String porque tambien contiene caracteres
    private String claveInterbancaria;
    //El atributo numeroDeCuenta debe ser String aunque sean solo numeros
    private String numeroDeCuenta;
    private double Saldo;
    //El interes es el que se genera a favor por tener el dinero en el banco
    private double interes;
    private String fechaDeCorte;
    
    public CuentaBancaria(){
        nombre = "Osvaldo Gabriel Gonzalez Martinez";
        //Se le dan valores iniciales a los atributos
        claveInterbancaria = "OGGM007";
        numeroDeCuenta = "0216513";
        Saldo = 1945655.615;
        //El interes es porcentual
        interes = 3.2;
        fechaDeCorte = "28 de Enero";
    }
    
    public CuentaBancaria (String nombre, String claveInterbancaria, String numeroDeCuenta, double Saldo, double interes, String fechaDeCorte){
        //Lo que obtenemos en este metodo los igualamos a cada instancia correspondiente
        this.nombre = nombre;
        this.claveInterbancaria = claveInterbancaria;
        this.numeroDeCuenta = numeroDeCuenta;
        this.Saldo = Saldo;
        this.interes = interes;
        this.fechaDeCorte = fechaDeCorte;
    }
    //Getter and Setter
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
    public String obtenNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    //Ademas de pedir el numero de cuenta hay que observar si viene llena correctamente
    public void ponNumeroDeCuenta(String numeroDeCuenta){
        if((numeroDeCuenta == null) || (numeroDeCuenta == "")){
            this.numeroDeCuenta = "Numero de cuenta no valida";
        }else{
            this.numeroDeCuenta = numeroDeCuenta;
        }
    }
    public double obtenSaldo(){
        return Saldo;
    }
    //Cuando ya obtenemos lo que se pide se le asigna al atributo correspondiente
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