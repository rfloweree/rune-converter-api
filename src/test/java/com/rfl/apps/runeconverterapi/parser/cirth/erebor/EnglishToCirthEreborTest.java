package com.rfl.apps.runeconverterapi.parser.cirth.erebor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test Cases for the EnglishToCirthErebor class.
 * @author Ruben F. Loweree Jr.
 */
public class EnglishToCirthEreborTest {
    
    public EnglishToCirthEreborTest() {
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
     * Test of parse method, of class EnglishToCirthErebor.
     */
    @Test
    public void testParse() {
        System.out.println("Testing Parse() for English To Cirth Erebor");
        //Test - Single line
        String text = "a quick brown fox jumps over the lazy dog";
        StringBuilder sb = new StringBuilder(text.length());
        EnglishToCirthErebor instance = new EnglishToCirthErebor();
        instance.parse(sb, text.toCharArray());
        assertEquals("cIeSleeI2@bF,I3bwI$S6XIb4z@I0zIacD;I9bR", sb.toString());
        //Test - Single line containing and mixture of letter casing comma and ending with period punctuation.
        text = "WaXy AnD QuIvErInG, JoCkS fUmBlE tHe PiZzA.";
        sb = new StringBuilder(text.length());
        instance = new EnglishToCirthErebor();
        instance.parse(sb, text.toCharArray());
        assertEquals("Fcw;IcdIeSl4z@ljI$bewI3S62azI0zI1lDDc{", sb.toString());
        //Test - Single line containing single and double quotes and ending with period punctuation.
        text = "Watch \"Jeopardy!\", Alex Trebek\'s fun TV quiz game.";
        sb = new StringBuilder(text.length());
        instance = new EnglishToCirthErebor();
        instance.parse(sb, text.toCharArray());
        assertEquals("Fc8efIgg$zb1c@9;ggIcazwI8@z2zeg.I3S,I84IeSlDIRc6z{", sb.toString());
        //Test - Single line ending with question mark punctuation.
        text = "Who packed five dozen old quart jugs in my box?";
        sb = new StringBuilder(text.length());
        instance = new EnglishToCirthErebor();
        instance.parse(sb, text.toCharArray());
        assertEquals("FfbI1ceez9I3l4zI9bDz,Iba9IeSc@8I$SR.Il,I6;I2bwO", sb.toString());
    }
    /**
     * Test of parse method, of class EnglishToCirthErebor. This tests all cases
     * of double characters in the language that are mapped to a single rune
     * character.
     */
    @Test
    public void testParseTwoCharacters() {
        System.out.println("Testing Parse() for compound runes.");
        //Test - GH
        String text = "gh";
        StringBuilder sb = new StringBuilder(text.length());
        EnglishToCirthErebor instance = new EnglishToCirthErebor();
        instance.parse(sb, text.toCharArray());
        assertEquals("T", sb.toString());
        //Test - KH
        text = "kh";
        sb = new StringBuilder(text.length());
        instance = new EnglishToCirthErebor();
        instance.parse(sb, text.toCharArray());
        assertEquals("t", sb.toString());
        //Test - KS
        //Test - ND
        //Test - NG
        //Test - NJ
        //Test - NN
        //Test - PS
        //Test - SH
        //Test - TH
        //Test - TS
    }
}
