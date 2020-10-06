package com.rfl.apps.runeconverterapi.parser.cirth.erebor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruben
 */
public class CirthEreborToEnglishTest {
    
    public CirthEreborToEnglishTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of parse method, of class CirthEreborToEnglish.
     */
    @Test
    public void testParse() {
        System.out.println("Testing Parse() for Cirth Erebor To English");
        //Test - Single line
        String text = "2c@SeItcDv9{ItcDv9Icl6x,S{";
        StringBuilder sb = new StringBuilder(text.length());
        CirthEreborToEnglish instance = new CirthEreborToEnglish();
        instance.parse(sb, text.toCharArray());
        assertEquals("baruk khazâd. khazâd aimênu.", sb.toString());
    }
    
    @Test
    public void testParseTwoCharacters() {
        
    }
    
    @Test
    public void testParseValidNumbers() {
        
    }
}
