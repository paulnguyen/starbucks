


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ObserverPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ObserverPatternTest
{
    private KeyPad kp;
    private PinEntryMachine pm ;
    
    /**
     * Default constructor for test class ObserverPatternTest
     */
    public ObserverPatternTest()
    {  
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        kp = new KeyPad() ;
        pm = new PinEntryMachine() ;
        ((IKeyPadSubject)kp).attach( pm ) ;    
    }


    @Test
    public void testOneKey()
    {
        kp.touch(1,5) ; 
        assertEquals("1", pm.d1());
    }

    @Test
    public void testTwoKeys()
    {
        kp.touch(1,5) ;
        kp.touch(2,5) ;       
        assertEquals("1", pm.d1());
        assertEquals("2", pm.d2());
    }

    @Test
    public void testThreeKeys()
    {
        kp.touch(1,5) ;
        kp.touch(2,5) ;       
        kp.touch(3,5) ;       
        assertEquals("1", pm.d1());
        assertEquals("2", pm.d2());
        assertEquals("3", pm.d3());
     }

    @Test
    public void testFourKeys()
    {
        kp.touch(1,5) ;
        kp.touch(2,5) ;       
        kp.touch(3,5) ;    
        kp.touch(1,6) ;     
        assertEquals("1", pm.d1());
        assertEquals("2", pm.d2());
        assertEquals("3", pm.d3());
        assertEquals("4", pm.d4());
    }

   @Test
    public void testBackspace()
    {
        kp.touch(1,5) ;
        kp.touch(2,5) ;       
        kp.touch(3,5) ;    
        kp.touch(1,6) ;     
        assertEquals("1", pm.d1());
        assertEquals("2", pm.d2());
        assertEquals("3", pm.d3());
        assertEquals("4", pm.d4());
        kp.touch(3,8) ;
        assertEquals("1", pm.d1());
        assertEquals("2", pm.d2());
        assertEquals("3", pm.d3());
        assertEquals("" , pm.d4());
    }
    


    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
