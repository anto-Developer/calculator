/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author emilioamato
 */
public class CalculatorTest {
    
    private static final double DELTA = 1e-15;
    
    Calculator c; 
    public CalculatorTest() {
        c = new Calculator();
    }
    
   
    @Test
    public void testSum() {
       c.setOpA(4);
       c.setOpB(5);
       assertEquals(9,c.sum(),DELTA);
       c.setOpA(-4);
       c.setOpB(5);
       assertEquals(1,c.sum(),DELTA);
       c.setOpA(4);
       c.setOpB(-5);
       assertEquals(-1,c.sum(),DELTA);
       c.setOpA(-4);
       c.setOpB(-5);
       assertEquals(-9,c.sum(),DELTA);
    }

    /**
     * Test of subtraction method, of class Calculator.
     */
    @Test
    public void testSubtraction() {
        c.setOpA(6);
        c.setOpB(5);
        assertEquals(1,c.subtraction(),DELTA);
        c.setOpA(5);
        c.setOpB(6);
        assertEquals(-1,c.subtraction(),DELTA);
        c.setOpA(-5);
        c.setOpB(6);
        assertEquals(-11,c.subtraction(),DELTA);
        c.setOpA(-5);
        c.setOpB(-6);
        assertEquals(1,c.subtraction(),DELTA);
        
    }
    
      /**
     * Test of division method, of class Calculator.
     */
    @Test
    public void testDivision() {
        c.setOpA(21);
        c.setOpB(7);
        assertEquals(3,c.division(),DELTA);
        c.setOpA(-21);
        c.setOpB(7);
        assertEquals(-3,c.division(),DELTA);
        c.setOpA(-21);
        c.setOpB(-7);
        assertEquals(3,c.division(),DELTA);
        c.setOpA(21);
        c.setOpB(-7);
        assertEquals(-3,c.division(),DELTA);
     
    }
    
    
       /**
     * Test of multiplication method, of class Calculator.
     */
     @Test
    public void testMultiplication() {
        c.setOpA(3);
        c.setOpB(3);
        assertEquals(9,c.multiplication(),DELTA);
        c.setOpA(3);
        c.setOpB(-3);
        assertEquals(-9,c.multiplication(),DELTA);
        c.setOpA(-3);
        c.setOpB(-3);
        assertEquals(9,c.multiplication(),DELTA);
        c.setOpA(-3);
        c.setOpB(3);
        assertEquals(-9,c.multiplication(),DELTA);
    }
    
    
    
}