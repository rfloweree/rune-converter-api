/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rfl.apps.runeconverterapi.parser;

import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author ruben
 */
public class ParserImplTest {
    
    public ParserImplTest() {
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
     * Test of parse method, of class ParserImpl.
     */
    @Test
    public void testParse_String() {
        System.out.println("parse");
        String text = "She sells sea shells by the seashore";
        ParserImpl instance = mock(ParserImpl.class);
        doNothing().when(instance).parse(isA(StringBuilder.class), isA(char[].class));
        doCallRealMethod().when(instance).parse(text);
        String expResult = "";
        String result = instance.parse(text);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMissingSymbols method, of class ParserImpl.
     */
    @Test
    public void testGetMissingSymbols() {
        System.out.println("getMissingSymbols");
        ParserImpl instance = new ParserImplImpl();
        Set<String> expResult = new LinkedHashSet<>();
        Set<String> result = instance.getMissingSymbols();
        assertEquals(expResult, result);
    }

    public class ParserImplImpl extends ParserImpl {

        public void parse(StringBuilder sb, char[] charArray) {
        }
    }
    
}
