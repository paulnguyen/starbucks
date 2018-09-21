/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package starbucks;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SettingsTest
{
    IApp app ;

    public SettingsTest()
    {
    }

    @Before
    public void setUp()
    {
        app = new AppAuthProxy() ;
    }

    @Test
    public void SettingsTest1() {
        assertEquals("PinScreen", app.screen());
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;
        app.execute("E") ; // Settings Page
        assertEquals("Settings", app.screen());
        app.touch(1,1) ; // Add New Card
        assertEquals("AddCard", app.screen());
        app.prev() ;
        assertEquals("Settings", app.screen());
        app.touch(2,1) ; // Add New Card
        assertEquals("AddCard", app.screen());
        app.prev() ;
        assertEquals("Settings", app.screen());
        app.touch(3,1) ; // Add New Card
        assertEquals("AddCard", app.screen());
        app.prev() ;
        assertEquals("Settings", app.screen());   
    }
    
    @After
    public void tearDown()
    {
    }
}
