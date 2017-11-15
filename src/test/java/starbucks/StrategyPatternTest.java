

package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StrategyPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StrategyPatternTest
{
    IApp app ;
    
    /**
     * Default constructor for test class StrategyPatternTest
     */
    public StrategyPatternTest()
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
        app = new AppAuthProxy() ;
    }


    @Test
    public void testLandscape()
    {
        // Login to App

        // Put in Landscape Mode   

        // Validate App is in Landscape Mode 
        // (replace with correct assert)
        assertTrue( false ) ;     
    }

    @Test
    public void testPortrait()
    {
        // Login to App

        // Put in Portrait Mode   

        // Validate App is in Landscape Mode 
        // (replace with correct assert)
        assertTrue( false ) ;       
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
