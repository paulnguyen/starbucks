/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package starbucks ;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StrategyPatternTest
{
    IApp app ;

    public StrategyPatternTest()
    {
    }

    @Before
    public void setUp()
    {
        app = new AppAuthProxy() ;
    }

    @Test
    public void StrategyPatternTest1()
    {
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        assertEquals("MyCards", app.screen());
        app.landscape();
        assertEquals("MyCards", app.screen());
        app.execute( "E" ) ;  
        assertEquals("MyCards", app.screen());         
    }

    @Test
    public void StrategyPatternTest2()
    {
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        assertEquals("MyCards", app.screen());
        app.landscape();
        assertEquals("MyCards", app.screen());
        app.execute( "B" ) ;  
        assertEquals("MyCards", app.screen());         
    }    

    @Test
    public void StrategyPatternTest3()
    {
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        assertEquals("MyCards", app.screen());
        app.landscape();
        assertEquals("MyCards", app.screen());
        app.execute( "C" ) ;  
        assertEquals("MyCards", app.screen());         
    }    

    @Test
    public void StrategyPatternTest4()
    {
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        assertEquals("MyCards", app.screen());
        app.landscape();
        assertEquals("MyCards", app.screen());
        app.execute( "D" ) ;  
        assertEquals("MyCards", app.screen());         
    }    

    @Test
    public void StrategyPatternTest5()
    {
        String[] lines ;        
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;  // 1
        app.touch(2,5) ;  // 2
        app.touch(3,5) ;  // 3
        app.touch(1,6) ;  // 4
        assertEquals("MyCards", app.screen());
        app.portrait();
        assertEquals("MyCards", app.screen());
        app.execute( "B" ) ;  
        assertEquals("Payments", app.screen());          
        app.execute( "A" ) ;
        assertEquals("MyCards", app.screen());
        lines = app.screenContents().split("\n");  
        assertEquals("$0.00", lines[7].trim());        
        app.landscape(); 
        app.display() ;
        app.touch(2,4) ;  
        assertEquals("MyCardsOptions", app.screen());
        lines = app.screenContents().split("\n");  
        assertEquals("Reload",          lines[3].trim()); 
        assertEquals("Refresh",         lines[4].trim()); 
        assertEquals("More Options",    lines[5].trim()); 
        assertEquals("Cancel",          lines[6].trim()); 
        app.touch(1, 7) ;
        assertEquals("MyCardsMoreOptions", app.screen());
        app.execute( "E" ) ;  
        assertEquals("MyCardsMoreOptions", app.screen());        
    }         
    

    @After
    public void tearDown()
    {
    }
}
