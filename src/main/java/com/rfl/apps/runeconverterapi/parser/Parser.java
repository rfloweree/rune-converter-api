package com.rfl.apps.runeconverterapi.parser;

import java.util.Set;

/**
 *
 * @author Ruben F. Loweree Jr.
 */
public interface Parser {
    public String parse(String string);
    public void parse(StringBuilder sb, char[] charArray);
    public Set<String> getMissingSymbols();
    public String getParsedString();
}
