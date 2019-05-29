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
public class Calculo {
    private ICalculo strategy;
    
    public Calculo(ICalculo strategy){
        this.strategy = strategy;
    }
    public int procesar (int a,int b){
        return strategy.realizaOperacion(a,b);
    }
}
