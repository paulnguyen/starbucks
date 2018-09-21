/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package starbucks ;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppProxyTest
{
    IApp app ;
    
    /**
     * Default constructor for test class ProxyPatternTest
     */
    public AppProxyTest()
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
    public void ProxyPatternTest1()
    {
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        assertEquals("MyCards", app.screen());
    }

    @Test
    public void ProxyPatternTest2()
    {
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(2,6) ;
        assertEquals("PinScreen", app.screen());
    }
    
    @Test
    public void CommandPatternTest1()
    {
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        assertEquals("MyCards", app.screen());
        app.execute( "A" ) ;
        app.execute( "B" ) ;
        app.execute( "C" ) ;  
        app.execute( "D" ) ;
        app.execute( "A" ) ;  
        assertEquals("MyCards", app.screen());            
    }

    @Test
    public void CommandPatternTest2()
    {
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        assertEquals("MyCards", app.screen());
        app.execute( "A" ) ;
        app.execute( "B" ) ;
        app.execute( "C" ) ;  
        app.execute( "D" ) ;
        app.execute( "B" ) ;  
        assertEquals("Payments", app.screen());            
    }

  @Test
    public void CommandPatternTest3()
    {
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        assertEquals("MyCards", app.screen());
        app.execute( "A" ) ;
        app.execute( "B" ) ;
        app.execute( "C" ) ;  
        app.execute( "D" ) ;
        app.execute( "C" ) ;  
        assertEquals("Rewards", app.screen());            
    }

  @Test
    public void CommandPatternTest4()
    {
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        assertEquals("MyCards", app.screen());
        app.execute( "A" ) ;
        app.execute( "B" ) ;
        app.execute( "C" ) ;  
        app.execute( "D" ) ;
        app.execute( "D" ) ;  
        assertEquals("Store", app.screen());            
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
