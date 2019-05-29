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
public class Dividir implements ICalculo{
    public Dividir ()
    {
    }
    @Override //sobreescribe una clase padre
    public int realizaOperacion (int a,int b)
    {
        return a / b;
    }
}
