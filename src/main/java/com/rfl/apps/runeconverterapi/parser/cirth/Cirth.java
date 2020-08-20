package com.rfl.apps.runeconverterapi.parser.cirth;

/**
 * Enum of the Cirth Runes and their alphabet representations. This enum keeps
 * track of the Enlgish letters mapped to the runes for both Erebor and Moria.
 * 
 * @author Ruben F. Loweree Jr.
 */
public enum Cirth {
    OM("'", 'g', 'g', 0),//Glottal stop.
    AN("a", 'c', 'c', 1),// = "a";
    SIGIN_AN("\u00E2", 'v', 'v', 2),// = "A";
    BATU("b", '2', '2', 3),// = "B";
    DATU("d", '9' , '9', 4),// = "D";
    EN("e", 'z', 'z', 5),// = "e";
    SIGIN_EN("\u00EA", 'x', 'x', 6),// = "E";
    FAM("f", '3', '3', 7),// = "F";
    GATU("g", 'r', 'R', 8),// = "G";
    GHAMU("gh", 'y', 'T', 9),// = "Gh";
    HAM("h", 'f', 'f', 10),// = "H";
    IR("i", 'l', 'l', 11),// = "i";// letter L
    SIGIN_IR("\u00EE", '"', '"', 12),// = "I";
    JATU("j", 'R', '$', 13),// = "J";
    KAM("k", 'e', 'e', 14),// = "K";
    KHAMU("kh", 'V', 't', 15),// = "Kh";
    LAL("l", 'a', 'a', 16),// = "L";
    MI("m", '6', '6', 17),// = "M";
    NIBUM("n", ',', ',', 18),// = "N";
    ON("o", 'b', 'b', 19),// = "o";
    SIGIN_ON("\u00F4", 'n', 'n', 20),// = "O";
    POM("p", '1', '1', 21),// = "P";//number one character
    RARUR("r", '@', '@', 22),// = "R";
    SASUS("s", '.', '.', 23),// = "S";
    SHASHUM("sh", '%', '%', 24),// = "Sh";
    TUTUM("t", '8', '8', 25),// = "T";
    THAMU("th", '0', '0', 26),// = "Th";
    UT("\u00F9", 'Z', 'Z', 27),// = "^";
    UNU("u", 'S', 'S', 28),// = "u";
    SIGIN_UNU("\u00FB", 'D', 'G', 29),// = "U";
    VATU("v", '4', '4', 30),// = "V";
    WUR("w", 'F', 'F', 31),// = "W";
    KSUBAM("x", ' ', 'w', 32),// = "X";
    YAMUY("y", ';', ';', 33),// = "Y";
    ZATU("z", 'w', 'D', 34),// = "Z";
    UNDUN("nd", 'd', 'd', 35),// = "ND";
    ANGAM("ng", 'j', 'j', 36),// = "NG";
    INJA("nj", 'K', 'K', 37),// = "NJ";
    YAN_NIBUM("nn", 'u', 'u', 38),// = "NN";
    PSUBAM("ps", ' ', 'X', 39),// = "PS";
    TSUBAM("ts", ' ', 'C', 40),// = "TS";
    SEREJ(" ", 'I', 'I', 41),// = " ";
    RA("&", 'B', 'B', 42),// RA = "&";
    EKHEZ(".", '{', '{', 43),// = ".";
    SUGUL("?", 'O', 'O', 44),// = "?";
    NUMDOT("", '\\','\\', 45),// = "." below or precedes numbers.
    GEM("3", 'm', 'm', 46),// = "rune for numerical value 3."
    RAMEKH("4", '+', '+', 47),// = "rune for numerical value 4."
    GIMON("8", 'U', 'U', 48),// = "rune for numerical value 8."
    TAGER("9", 'L', 'L', 49);//= "rune for numerical value 9."
    
    private String letter;
    private char moria;
    private char erebor;
    private int value;
    
    private Cirth(String letter, char moria, char erebor, int value){
        this.letter = letter;
        this.moria = moria;
        this.erebor = erebor;
        this.value = value;
    }

    public String getLetter() {
        return letter;
    }

    public char getMoria() {
        return moria;
    }

    public char getErebor() {
        return erebor;
    }

    public int getValue() {
        return value;
    }
}
