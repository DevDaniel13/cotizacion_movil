/*
    Descripción: Codigo de prueba para el codigo padre Cotizacion
    Fecha: 15/Mayo/2022
    Nombre: Pimentel Mendoza Marco Daniel
 */
package Corte1;

public class Prueba_Cotizacion {
    
    public static void main(String[] args){
        
        Cotizacion c = new Cotizacion();
        c.CapturarDatos();
        int pInicial = c.pagoInicial();
        int financiar = c.Financiar(pInicial);
        int pMensual = c.pagoMensual(financiar);
        c.ImprimirDatos(pInicial, financiar, pMensual);
        
    }
    
}
