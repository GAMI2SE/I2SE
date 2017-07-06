package data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Psycher
 */
public class IntegerNumberTest {
    
    IntegerNumber instance = new IntegerNumber(631);
    
    public IntegerNumberTest() {
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
     * Test of getValue method, of class IntegerNumber.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");        
        int expResult = 631;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.        
    }

    /**
     * Test of setValue method, of class IntegerNumber.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 631;        
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.        
    }

    /**
     * Test of isPrimeNumber method, of class IntegerNumber.
     */
    @Test
    public void testIsPrimeNumber() {
        IntegerNumber instance = new IntegerNumber(631);
        boolean result = instance.isPrimeNumber();
        
        assertTrue(result);
    }
    
}
