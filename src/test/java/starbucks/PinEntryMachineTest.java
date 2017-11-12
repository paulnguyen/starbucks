


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PinEntryMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PinEntryMachineTest
{
    PinEntryMachine pinEntry ;
    
    /**
     * Default constructor for test class PinEntryMachineTest
     */
    public PinEntryMachineTest()
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
        pinEntry = new PinEntryMachine();
    }

    

    @Test
    public void test0()
    {
        pinEntry.number("1");
        pinEntry.backspace();
        System.out.println( pinEntry.getCurrentState() ) ;
        assertEquals("starbucks.NoPinDigits", pinEntry.getCurrentState());
        pinEntry.backspace();
        assertEquals("starbucks.NoPinDigits", pinEntry.getCurrentState());
    }

    @Test
    public void test1()
    {
        pinEntry.number("1");
        assertEquals("starbucks.OnePinDigit", pinEntry.getCurrentState());
        pinEntry.number("2");
        pinEntry.backspace();
        assertEquals("starbucks.OnePinDigit", pinEntry.getCurrentState());
    }

    @Test
    public void test2()
    {
        pinEntry.number("1");
        pinEntry.number("2");
        assertEquals("starbucks.TwoPinDigits", pinEntry.getCurrentState());
        pinEntry.number("3");
        pinEntry.backspace();
        assertEquals("starbucks.TwoPinDigits", pinEntry.getCurrentState());
    }

    @Test
    public void test3()
    {
        pinEntry.number("1");
        pinEntry.number("2");
        pinEntry.number("3");
        assertEquals("starbucks.ThreePinDigits", pinEntry.getCurrentState());
    }

    @Test
    public void test4()
    {
        pinEntry.number("1");
        pinEntry.number("2");
        pinEntry.number("3");
        pinEntry.number("4");
        assertEquals("starbucks.FourPinDigits", pinEntry.getCurrentState());
    }

    @Test
    public void test5()
    {
        pinEntry.number("1");
        pinEntry.number("2");
        pinEntry.number("3");
        pinEntry.number("5");
        assertEquals("starbucks.NoPinDigits", pinEntry.getCurrentState());
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
