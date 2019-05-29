/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostragety;

import ejemplostragety2.Dividir;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gonzalo.araya
 */
public class DividirTest {
    
    public DividirTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of realizaOperacion method, of class Dividir.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion");
        int a = 5;
        int b = 3;
        Dividir instance = new Dividir();
        int expResult = 1;
        int result = instance.realizaOperacion(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult){
        fail("The test case is a prototype.");
    }
    
}
