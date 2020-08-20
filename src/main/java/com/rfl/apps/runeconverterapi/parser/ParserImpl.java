package com.rfl.apps.runeconverterapi.parser;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Implementation of the Parser actions. implements the top level parse call 
 * that is identical to all parsers. 
 * 
 * @author Ruben F. Loweree Jr.
 */
public abstract class ParserImpl implements Parser {
    /**
     * The text string that has been parsed.
     */
    private String textString;
    /**
     * Characters from the original text string.
     */
    private char[] textArray;
    /**
     * Set of omitted characters in the text that cannot be parsed.
     */
    protected Set<String> missingSymbols = new LinkedHashSet<>();
    /**
     * index of the character that is being parsed
     */
    protected int next;
    /**
     * Next line character constant.
     */
    public static final String DELIMITER = "\n";
    /**
     * {@inheritDoc}
     */
    @Override
    public String parse(String text) {
        next = 0;
        textString = "";
        missingSymbols.clear();
        textArray = text.toCharArray();
        StringBuilder sb = new StringBuilder(text.length());
        //recursive call made here.
        parse(sb, textArray);
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public abstract void parse(StringBuilder sb, char[] charArray);
    /**
     * {@inheritDoc} 
     */
    @Override
    public Set<String> getMissingSymbols() {
        return missingSymbols;
    }
}
