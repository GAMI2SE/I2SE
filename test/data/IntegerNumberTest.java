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
    
    IntegerNumber instance;
    
    public IntegerNumberTest() {
    }
        
    @Before
    public void setUp() {
        instance = new IntegerNumber(631);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }
    

    /**
     * Test of isPrimeNumber method, of class IntegerNumber.
     */
    @Test
    public void testIsPrimeNumber() {        
        boolean result = instance.isPrimeNumber();
        
        assertTrue(result);
    }
    
}
