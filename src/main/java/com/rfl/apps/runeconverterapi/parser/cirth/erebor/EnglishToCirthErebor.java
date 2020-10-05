package com.rfl.apps.runeconverterapi.parser.cirth.erebor;

import com.rfl.apps.runeconverterapi.parser.KeyboardCharUtil;
import com.rfl.apps.runeconverterapi.parser.ParserImpl;
import com.rfl.apps.runeconverterapi.parser.cirth.Cirth;

/**
 * Parser for converting English letters to their corresponding runes in Cirth
 * Erebor.
 * 
 * @author Ruben F. Loweree Jr.
 */
public class EnglishToCirthErebor extends ParserImpl {
    /**
     * {@inheritDoc}
     */
    @Override
    public void parse(StringBuilder sb, char[] charArray) {
        if (next < charArray.length) {
            Character c = charArray[next];
            switch (c) {
                case KeyboardCharUtil.LOWERCASE_A:
                case KeyboardCharUtil.UPPERCASE_A:
                    sb.append(Cirth.AN.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case '\u00E2'://sigin an
                    sb.append(Cirth.SIGIN_AN.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_B:
                case KeyboardCharUtil.UPPERCASE_B:
                    sb.append(Cirth.BATU.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_C:
                case KeyboardCharUtil.UPPERCASE_C:
                    sb.append(Cirth.KAM.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_D:
                case KeyboardCharUtil.UPPERCASE_D:
                    sb.append(Cirth.DATU.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_E:
                case KeyboardCharUtil.UPPERCASE_E:
                    sb.append(Cirth.EN.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case '\u00EA'://sigin en
                    sb.append(Cirth.SIGIN_EN.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_F:
                case KeyboardCharUtil.UPPERCASE_F:
                    sb.append(Cirth.FAM.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_G:
                case KeyboardCharUtil.UPPERCASE_G:
                    next++;
                    if (next < charArray.length 
                            && charArray[next] == KeyboardCharUtil.LOWERCASE_H) {
                        sb.append(Cirth.GHAMU.getErebor());
                        next++;
                    } else {
                        sb.append(Cirth.GATU.getErebor());
                    }
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_H:
                case KeyboardCharUtil.UPPERCASE_H:
                    sb.append(Cirth.HAM.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_I:
                case KeyboardCharUtil.UPPERCASE_I:
                    sb.append(Cirth.IR.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case '\u00EE'://sigin ir
                    sb.append(Cirth.SIGIN_IR.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_J:
                case KeyboardCharUtil.UPPERCASE_J:
                    sb.append(Cirth.JATU.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_K:
                case KeyboardCharUtil.UPPERCASE_K:
                    next++;
                    if (next < charArray.length) {
                        switch (charArray[next]) {
                            case KeyboardCharUtil.LOWERCASE_H:
                            case KeyboardCharUtil.UPPERCASE_H:
                                sb.append(Cirth.KHAMU.getErebor());
                                next++;
                                break;
                            case KeyboardCharUtil.LOWERCASE_S:
                            case KeyboardCharUtil.UPPERCASE_S:
                                sb.append(Cirth.KSUBAM.getErebor());
                                next++;
                                break;
                            default:
                                sb.append(Cirth.KAM.getErebor());
                                break;
                        }
                    } else {
                        sb.append(Cirth.KAM.getErebor());
                    }
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_L:
                case KeyboardCharUtil.UPPERCASE_L:
                    sb.append(Cirth.LAL.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_M:
                case KeyboardCharUtil.UPPERCASE_M:
                    sb.append(Cirth.MI.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_N:
                case KeyboardCharUtil.UPPERCASE_N:
                    next++;
                    if (next < charArray.length) {
                        switch (charArray[next]) {
                            case KeyboardCharUtil.LOWERCASE_D:
                            case KeyboardCharUtil.UPPERCASE_D:
                                sb.append(Cirth.UNDUN.getErebor());
                                next++;
                                break;
                            case KeyboardCharUtil.LOWERCASE_G:
                            case KeyboardCharUtil.UPPERCASE_G:
                                sb.append(Cirth.ANGAM.getErebor());
                                next++;
                                break;
                            case KeyboardCharUtil.LOWERCASE_J:
                            case KeyboardCharUtil.UPPERCASE_J:
                                sb.append(Cirth.INJA.getErebor());
                                next++;
                                break;
                            case KeyboardCharUtil.LOWERCASE_N:
                            case KeyboardCharUtil.UPPERCASE_N:
                                sb.append(Cirth.YAN_NIBUM.getErebor());
                                next++;
                                break;
                            default:
                                sb.append(Cirth.NIBUM.getErebor());
                                break;
                        }
                    } else {
                        sb.append(Cirth.NIBUM.getErebor());
                    }
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_O:
                case KeyboardCharUtil.UPPERCASE_O:
                    sb.append(Cirth.ON.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case '\u00F4'://sigin on
                    sb.append(Cirth.SIGIN_ON.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_P:
                case KeyboardCharUtil.UPPERCASE_P:
                    next++;
                    if (next < charArray.length 
                            && charArray[next] == KeyboardCharUtil.LOWERCASE_S) {
                        sb.append(Cirth.PSUBAM.getErebor());
                        next++;
                    } else {
                        sb.append(Cirth.POM.getErebor());
                    }
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_Q:
                case KeyboardCharUtil.UPPERCASE_Q:
                    sb.append(Cirth.KAM.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_R:
                case KeyboardCharUtil.UPPERCASE_R:
                    sb.append(Cirth.RARUR.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_S:
                case KeyboardCharUtil.UPPERCASE_S:
                    next++;
                    if (next < charArray.length 
                            && charArray[next] == KeyboardCharUtil.LOWERCASE_H) {
                        sb.append(Cirth.SHASHUM.getErebor());
                        next++;
                    } else {
                        sb.append(Cirth.SASUS.getErebor());
                    }
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_T:
                case KeyboardCharUtil.UPPERCASE_T:
                    next++;
                    if (next < charArray.length) {
                        switch (charArray[next]) {
                            case KeyboardCharUtil.LOWERCASE_H:
                            case KeyboardCharUtil.UPPERCASE_H:
                                sb.append(Cirth.THAMU.getErebor());
                                next++;
                                break;
                            case KeyboardCharUtil.LOWERCASE_S:
                            case KeyboardCharUtil.UPPERCASE_S:
                                sb.append(Cirth.TSUBAM.getErebor());
                                next++;
                                break;
                            default:
                                sb.append(Cirth.TUTUM.getErebor());
                                break;
                        }
                    } else {
                        sb.append(Cirth.TUTUM.getErebor());
                    }
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_U:
                case KeyboardCharUtil.UPPERCASE_U:
                    sb.append(Cirth.UNU.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case '\u00FB'://sigin unu
                    sb.append(Cirth.SIGIN_UNU.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case '\u00F9'://grave u
                    sb.append(Cirth.UT.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_V:
                case KeyboardCharUtil.UPPERCASE_V:
                    sb.append(Cirth.VATU.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_W:
                case KeyboardCharUtil.UPPERCASE_W:
                    sb.append(Cirth.WUR.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_X:
                case KeyboardCharUtil.UPPERCASE_X:
                    sb.append(Cirth.KSUBAM.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_Y:
                case KeyboardCharUtil.UPPERCASE_Y:
                    sb.append(Cirth.YAMUY.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.LOWERCASE_Z:
                case KeyboardCharUtil.UPPERCASE_Z:
                    sb.append(Cirth.ZATU.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case ' ':
                    sb.append(Cirth.SEREJ.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case '\'':
                    sb.append(Cirth.OM.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case '\"':
                    sb.append(Cirth.OM.getErebor()).append(Cirth.OM.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.PERIOD:
                    sb.append(Cirth.EKHEZ.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.QUESTION_MARK:
                    sb.append(Cirth.SUGUL.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.NUMBER_ZERO:
                    sb.append(Cirth.NUMDOT.getErebor())
                            .append(Cirth.WUR.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.NUMBER_ONE:
                    sb.append(Cirth.NUMDOT.getErebor())
                            .append(Cirth.IR.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.NUMBER_TWO:
                    sb.append(Cirth.NUMDOT.getErebor())
                            .append(Cirth.ON.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.NUMBER_THREE://GEM
                    sb.append(Cirth.NUMDOT.getErebor())
                            .append(Cirth.GEM.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.NUMBER_FOUR://RAMEKH
                    sb.append(Cirth.NUMDOT.getErebor())
                            .append(Cirth.RAMEKH.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.NUMBER_FIVE:
                    sb.append(Cirth.NUMDOT.getErebor())
                            .append(Cirth.YAN_NIBUM.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.NUMBER_SIX:
                    sb.append(Cirth.NUMDOT.getErebor())
                            .append(Cirth.IR.getErebor())
                            .append(Cirth.IR.getErebor())
                            .append(Cirth.IR.getErebor())
                            .append(Cirth.IR.getErebor())
                            .append(Cirth.IR.getErebor())
                            .append(Cirth.IR.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.NUMBER_SEVEN:
                    sb.append(Cirth.NUMDOT.getErebor())
                            .append(Cirth.HAM.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.NUMBER_EIGHT://GIMON
                    sb.append(Cirth.NUMDOT.getErebor())
                            .append(Cirth.GIMON.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case KeyboardCharUtil.NUMBER_NINE://TAGER
                    sb.append(Cirth.NUMDOT.getErebor())
                            .append(Cirth.TAGER.getErebor());
                    next++;
                    parse(sb, charArray);
                    break;
                case '\n':
                    sb.append('\n');
                    next++;
                    parse(sb, charArray);
                    break;
                default:
                    missingSymbols.add(((Character) charArray[next]).toString());
                    next++;
                    parse(sb, charArray);
            }
        }
    }
    
}
