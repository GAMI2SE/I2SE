package data;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Psycher
 */
public class IntegerNumberIT {
    
    private IntegerNumber instance = new IntegerNumber(631);
    
    public IntegerNumberIT() {
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
