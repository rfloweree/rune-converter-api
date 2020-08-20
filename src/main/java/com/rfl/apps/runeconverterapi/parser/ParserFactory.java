package com.rfl.apps.runeconverterapi.parser;

/**
 * Factory that will create a parser for a given rune system.
 * 
 * @author Ruben F. Loweree Jr.
 */
public interface ParserFactory {
    /**
     * Creates a parser for the given string name.
     * @param parserType String name of the requested parser.
     * @return Parser to convert runes.
     */
    public Parser createParser(String parserType);
}
