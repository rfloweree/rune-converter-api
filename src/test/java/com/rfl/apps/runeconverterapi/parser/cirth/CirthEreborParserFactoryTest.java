package com.rfl.apps.runeconverterapi.parser.cirth;

import com.rfl.apps.runeconverterapi.parser.Parser;
import com.rfl.apps.runeconverterapi.parser.cirth.erebor.CirthEreborToEnglish;
import com.rfl.apps.runeconverterapi.parser.cirth.erebor.EnglishToCirthErebor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test cases for the Cirth Erebor Factory.
 * 
 * @author Ruben F. Loweree Jr.
 */
public class CirthEreborParserFactoryTest {
    
    private CirthEreborParserFactory instance = null;
    public CirthEreborParserFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CirthEreborParserFactory();
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test case of createParser method, of class CirthEreborParserFactory.
     */
    @Test
    public void testCreateParser() {
        System.out.println("createParser");
        Parser result = instance.createParser("toEnglish");
        assertNotNull(result);
        assertTrue(result instanceof CirthEreborToEnglish);
        result = instance.createParser("fromEnglish");
        assertNotNull(result);
        assertTrue(result instanceof EnglishToCirthErebor);
    }
    /**
     * Test case of createParser method, of class CirthEreborParserFactory. This will 
     * test for invalid inputs, such as empty strings or null.
     */
    @Test
    public void testCreateParserInvalid() {
        System.out.println("createParserInvalid");
        String parseType = null;
        instance = new CirthEreborParserFactory();
        assertNull(instance.createParser(parseType));
        parseType = "";
        assertNull(instance.createParser(parseType));
    }
}
