package com.rfl.apps.runeconverterapi.parser.cirth;

import com.rfl.apps.runeconverterapi.parser.Parser;
import com.rfl.apps.runeconverterapi.parser.ParserFactory;
import com.rfl.apps.runeconverterapi.parser.cirth.erebor.CirthEreborToEnglish;
import com.rfl.apps.runeconverterapi.parser.cirth.erebor.EnglishToCirthErebor;

/**
 * Factory to create Parsers for the Cirth Erebor family.
 * 
 * @author Ruben F. Loweree Jr.
 */
public class CirthEreborParserFactory implements ParserFactory {

    @Override
    public Parser createParser(String parserType) {
        if (parserType != null) {
            if (parserType.equalsIgnoreCase("toEnglish")) {
                return new CirthEreborToEnglish();
            } else if (parserType.equalsIgnoreCase("fromEnglish")) {
                return new EnglishToCirthErebor();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    
}
