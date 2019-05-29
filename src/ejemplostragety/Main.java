/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostragety;

/**
 *
 * @author gonzalo.araya
 */
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
        
        System.out.println("Suma: " + suma );
        System.out.println("Resta: " + resta );
        System.out.println("Multiplica: " + multi );
        System.out.println("Divide: " + divide );
    }
}
