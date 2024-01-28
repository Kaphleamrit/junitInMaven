package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param MathTest
     */
    MathUtils obj = new MathUtils();
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }

    // Additional tests
    
    public void testAddition() {
        assertEquals(4, obj.add(2, 2));
    }

    public void testSubtraction() {
        assertEquals(2, obj.subtract(4, 2));
    }

    public void testMultiplication() {
        assertEquals(8, obj.multiply(4, 2));
    }

    public void testDivision() {
        assertEquals(2.5, obj.divide(5, 2));
    }

    public void testDivisionByZero() {
        try {
            obj.divide(5, 0);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected exception
        }
    }
}