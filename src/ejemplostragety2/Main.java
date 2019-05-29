/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostragety2;

/**
 *
 * @author gonzalo.araya
 */
//menu 
public class Main {
    public static void main(String[] args)
    {
        Calculo context;
        context = new Calculo (new Sumar());
        int suma=context.procesar(5,3);
        
        context = new Calculo( new Restar() );
        int resta = context.procesar(5,3);
        
        context = new Calculo( new Multiplicar() );
        int multi = context.procesar(5,3);
        
        context = new Calculo( new Dividir() );
        int divide = context.procesar(5,3);
        //test 
        System.out.println("Resultado Suma: " + suma );
        System.out.println("Resultado Resta: " + resta );
        System.out.println("Resultado Multiplicacion: " + multi );
        System.out.println("Resultado Division: " + divide );
    }
}
