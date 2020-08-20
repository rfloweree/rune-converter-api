package com.rfl.apps.runeconverterapi.parser;

import java.util.Set;

/**
 * Parser Object that will convert as string into a context sensitive letter 
 * representation. 
 * 
 * This works like a basic substitution algorithm for alphabet encryption. 
 * However it dose not use shift order mapping and is customized based on 
 * different parameters.
 * 
 * Note: A parser is a one direction substitution. This means that it only 
 * converts the string in one direction of encryption, i.e. Plaintext to mapped 
 * context. A sister parser will need to be created to handle the reverse 
 * encryption of the mentioned example.
 * 
 * @author Ruben F. Loweree Jr.
 */
public interface Parser {
    /**
     * Top level call to parse a string of characters. A string is provided and
     * it convert each character based on the mapped character context.
     * 
     * @param text Original string to be parsed. 
     * @return parsed string of characters.
     */
    public String parse(String text);
    /**
     * Low level parsing call of the parsing algorithm. The top level passes a
     * parsed string and an array of the original string characters. This is a
     * recursive call that will traverse through the array and convert each 
     * character, then append it to the new string.
     * 
     * This is defined in each parser.
     * 
     * @param sb converted text.
     * @param charArray original characters.
     */
    public void parse(StringBuilder sb, char[] charArray);
    /**
     * Gets a map of the symbols that are not converted in the parser.
     * 
     * @return set of characters that do not have a parsed representative. 
     */
    public Set<String> getMissingSymbols();
}
