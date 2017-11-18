


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KeyPadPressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KeyPadPressTest
{
    KeyPad kp ;
    PinEntryMachine pinEntry ;
    
    /**
     * Default constructor for test class KeyPadPressTest
     */
    public KeyPadPressTest()
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
        pinEntry = new PinEntryMachine();
    }


    @Test
    public void testOne()
    {
        // Press 1
        pinEntry.number("1");
        // Assertion (Replace with appropriate test)
        
        assertEquals(pinEntry.d1() ,"1");
        pinEntry.backspace();
    }

   @Test
    public void testTwo()
    {
        // Press 2
     pinEntry.number("2");
        // Assertion (Replace with appropriate test)
     assertEquals(pinEntry.d1() ,"2");
     pinEntry.backspace();
    }

   @Test
    public void testThree()
    {
       // Press 3
     pinEntry.number("3");
       // Assertion (Replace with appropriate test)
     assertEquals(pinEntry.d1() ,"3");
     pinEntry.backspace();
    }

   @Test
    public void testFour()
    {
       // Press 4
     pinEntry.number("4");
       // Assertion (Replace with appropriate test)
     assertEquals(pinEntry.d1() ,"4");
     pinEntry.backspace();
    }

   @Test
    public void testFive()
    {
       // Press 5
     pinEntry.number("5");
       // Assertion (Replace with appropriate test)
     assertEquals(pinEntry.d1() ,"5");
     pinEntry.backspace();
    }

   @Test
    public void testSix()
    {
       // Press 6
     pinEntry.number("6");
       // Assertion (Replace with appropriate test)
     assertEquals(pinEntry.d1() ,"6");
     pinEntry.backspace();
    }

   @Test
    public void testSeven()
    {
       // Press 7
     pinEntry.number("7");
       // Assertion (Replace with appropriate test)
     assertEquals(pinEntry.d1() ,"7");
     pinEntry.backspace();
    }

   @Test
    public void testEight()
    {
       // Press 8
     pinEntry.number("8");
       // Assertion (Replace with appropriate test)
     assertEquals(pinEntry.d1() ,"8");
     pinEntry.backspace();
    }

   @Test
    public void testNine()
    {
       // Press 9
     pinEntry.number("9");
       // Assertion (Replace with appropriate test)
     assertEquals(pinEntry.d1() ,"9");
     pinEntry.backspace();
    }

   @Test
    public void testZero()
    {
       // Press 0
     pinEntry.number("0");
       // Assertion (Replace with appropriate test)
     assertEquals(pinEntry.d1() ,"0");
     pinEntry.backspace();
    }

   @Test
    public void testBackspace()
    {
       // Press 2
     pinEntry.number("2");
     pinEntry.backspace();
       // Assertion (Replace with appropriate test)
     assertEquals(pinEntry.d1() ,"");
     
    }

   @Test
    public void testNoKey()
    {
        // Press Empty Key
     pinEntry.number("");
        // Assertion (Replace with appropriate test)
        assertEquals(pinEntry.d1() ,""  );
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
