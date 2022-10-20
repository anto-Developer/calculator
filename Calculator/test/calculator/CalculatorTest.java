/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;


import org.junit.*;
import static org.junit.Assert.*;
/**
 *
 * @author salvatore
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of multiplication method, of class Calculator.
     */
    @org.junit.Test
    public void testMultiplication() {
        System.out.println("multiplication");
        Calculator instance = new Calculator();
        
        //1
        instance.setOpA(10);
        instance.setOpB(5);
        double expResult = 50;
        double result = instance.multiplication();
        assertEquals(expResult, result, 0.0);
        
        //2
        instance.setOpA(0);
        instance.setOpB(5);
        expResult = 0;
        result = instance.multiplication();
        assertEquals(expResult, result, 0.0);
        
        //3
        instance.setOpA(100000);
        instance.setOpB(0.000);
        expResult = 0;
        result = instance.multiplication();
        assertEquals(expResult, result, 0.0);
        
        //4
        instance.setOpA(2);
        instance.setOpB(1.5);
        expResult = 3;
        result = instance.multiplication();
        assertEquals(expResult, result, 0.0);
        
        
    }
    

    /**
     * Test of division method, of class Calculator.
     */
    @org.junit.Test
    public void testDivision() {
        System.out.println("division");
        Calculator instance = new Calculator();
        instance.setOpA(10);
        instance.setOpB(5);
        double expResult = 2.0;
        double result = instance.division();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of sum method, of class Calculator.
     */
    @org.junit.Test
    public void testSum() {
        System.out.println("sum");
        Calculator instance = new Calculator();
        instance.setOpA(10);
        instance.setOpB(5);
        double expResult = 15.0;
        double result = instance.sum();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtraction method, of class Calculator.
     */
    @org.junit.Test
    public void testSubtraction() {
        System.out.println("subtraction");
        Calculator instance = new Calculator();
        instance.setOpA(10);
        instance.setOpB(5);
        double expResult = 5.0;
        double result = instance.subtraction();
        assertEquals(expResult, result, 0.0);
    }
    
}
