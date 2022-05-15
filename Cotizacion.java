/*
    Descripción: Codigo padre del diagrama UML de Cotizacion
    Fecha: 15/Mayo/2022
    Nombre: Pimentel Mendoza Marco Daniel
 */
package Corte1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cotizacion {
    
    private int id;
    private String descripcion;
    private int precio;
    private int pInicial;
    private int plazo;
    
    public Cotizacion(){
        this.id = 0;
        this.descripcion = "";
        this.precio = 0;
        this.pInicial = 0;
        this.plazo = 0;
    }
    
    public Cotizacion(int id, String descripcion, int precio, int pInicial, int plazo){
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.pInicial = pInicial;
        this.plazo = plazo;
    }
    
    public Cotizacion(Cotizacion Cotizacion){
        this.id = Cotizacion.id;
        this.descripcion = Cotizacion.descripcion;
        this.precio = Cotizacion.precio;
        this.pInicial = Cotizacion.pInicial;
        this.plazo = Cotizacion.plazo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getpInicial() {
        return pInicial;
    }
    public void setpInicial(int pInicial) {
        this.pInicial = pInicial;
    }
    public int getPlazo() {
        return plazo;
    }
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    public void CapturarDatos(){
        System.out.println("Captura los siguientes datos:");
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Numero de cotizacion: "));
        this.descripcion = JOptionPane.showInputDialog("Descripcion del automovil: ");
        this.precio = Integer.parseInt(JOptionPane.showInputDialog("Precio: "));
        this.pInicial = Integer.parseInt(JOptionPane.showInputDialog("Porcentaje inicial: "));
        this.plazo = Integer.parseInt(JOptionPane.showInputDialog("Plazo (meses): "));
    }
    
    public int pagoInicial(){
        int porcentaje = (this.precio * this.pInicial) / 100;
        return porcentaje;
    }
    
    public int Financiar(int porcentaje){
        int financiar = this.precio - porcentaje;
        return financiar;
    }
    
    public int pagoMensual(int fin){
        int pMensual = fin / this.plazo;
        return pMensual;
    }
    
    public void ImprimirDatos(int pInicial, int fin, int pMensual){
        System.out.println("Num. Cotizacion: "+this.id);
        System.out.println("Descripcion: "+this.descripcion);
        System.out.println("Precio: $"+this.precio);
        System.out.println("Porcentaje de pago inicial: %"+this.pInicial);
        System.out.println("Plazo: "+this.plazo+" Meses");
        System.out.println("Pago inicial: $"+pInicial);
        System.out.println("Total a Fin: $"+fin);
        System.out.println("Pago mensual: $"+pMensual);
    }
}
