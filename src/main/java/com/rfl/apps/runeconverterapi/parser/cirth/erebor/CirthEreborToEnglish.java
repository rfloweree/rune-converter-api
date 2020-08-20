package com.rfl.apps.runeconverterapi.parser.cirth.erebor;

import com.rfl.apps.runeconverterapi.parser.KeyboardCharUtil;
import com.rfl.apps.runeconverterapi.parser.ParserImpl;
import com.rfl.apps.runeconverterapi.parser.cirth.Cirth;

/**
 * Parser for converting Erebor runes to English letter representations.
 * 
 * @author Ruben F. Loweree Jr.
 */
public class CirthEreborToEnglish extends ParserImpl {
    /**
     * {@inheritDoc} 
     */
    @Override
    public void parse(StringBuilder sb, char[] charArray) {
        if (next < charArray.length) {
            Character c = charArray[next];
            if (c.equals(Cirth.OM.getErebor())) {
                sb.append(Cirth.OM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.AN.getErebor())) {
                sb.append(Cirth.AN.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.SIGIN_AN.getErebor())) {
                sb.append(Cirth.SIGIN_AN.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.BATU.getErebor())) {
                sb.append(Cirth.BATU.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.DATU.getErebor())) {
                sb.append(Cirth.DATU.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.EN.getErebor())) {
                sb.append(Cirth.EN.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.SIGIN_EN.getErebor())) {
                sb.append(Cirth.SIGIN_EN.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.FAM.getErebor())) {
                sb.append(Cirth.FAM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.GATU.getErebor())) {
                sb.append(Cirth.GATU.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.GHAMU.getErebor())) {
                sb.append(Cirth.GHAMU.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.HAM.getErebor())) {
                sb.append(Cirth.HAM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.IR.getErebor())) {
                sb.append(Cirth.IR.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.SIGIN_IR.getErebor())) {
                sb.append(Cirth.SIGIN_IR.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.JATU.getErebor())) {
                sb.append(Cirth.JATU.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.KAM.getErebor())) {
                sb.append(Cirth.KAM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.KHAMU.getErebor())) {
                sb.append(Cirth.KHAMU.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.LAL.getErebor())) {
                sb.append(Cirth.LAL.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.MI.getErebor())) {
                sb.append(Cirth.MI.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.NIBUM.getErebor())) {
                sb.append(Cirth.NIBUM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.ON.getErebor())) {
                sb.append(Cirth.ON.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.SIGIN_ON.getErebor())) {
                sb.append(Cirth.SIGIN_ON.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.POM.getErebor())) {
                sb.append(Cirth.POM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.RARUR.getErebor())) {
                sb.append(Cirth.RARUR.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.SASUS.getErebor())) {
                sb.append(Cirth.SASUS.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.SHASHUM.getErebor())) {
                sb.append(Cirth.SHASHUM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.TUTUM.getErebor())) {
                sb.append(Cirth.TUTUM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.THAMU.getErebor())) {
                sb.append(Cirth.THAMU.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.UT.getErebor())) {
                sb.append(Cirth.UT.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.UNU.getErebor())) {
                sb.append(Cirth.UNU.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.SIGIN_UNU.getErebor())) {
                sb.append(Cirth.SIGIN_UNU.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.VATU.getErebor())) {
                sb.append(Cirth.VATU.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.WUR.getErebor())) {
                sb.append(Cirth.WUR.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.KSUBAM.getErebor())) {
                sb.append(Cirth.KSUBAM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.YAMUY.getErebor())) {
                sb.append(Cirth.YAMUY.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.ZATU.getErebor())) {
                sb.append(Cirth.ZATU.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.UNDUN.getErebor())) {
                sb.append(Cirth.UNDUN.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.ANGAM.getErebor())) {
                sb.append(Cirth.ANGAM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.INJA.getErebor())) {
                sb.append(Cirth.INJA.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.YAN_NIBUM.getErebor())) {
                sb.append(Cirth.YAN_NIBUM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.PSUBAM.getErebor())) {
                sb.append(Cirth.PSUBAM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.TSUBAM.getErebor())) {
                sb.append(Cirth.TSUBAM.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.SEREJ.getErebor())) {
                sb.append(Cirth.SEREJ.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.EKHEZ.getErebor())) {
                sb.append(Cirth.EKHEZ.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.SUGUL.getErebor())) {
                sb.append(Cirth.SUGUL.getLetter());
                next++;
                parse(sb, charArray);
            } else if (c.equals(Cirth.NUMDOT.getErebor())) {
                sb.append(Cirth.NUMDOT.getLetter());
                next++;
                if (next < charArray.length && 
                        charArray[next] == Cirth.WUR.getErebor()) {
                    sb.append(KeyboardCharUtil.NUMBER_ZERO);
                    next++;
                } else if (next < charArray.length
                        && charArray[next] == Cirth.IR.getErebor()) {
                    int count = next;
                    count++;
                    if (count < charArray.length
                            && charArray[count] == Cirth.IR.getErebor()) {
                        count++;
                        if (count < charArray.length
                                && charArray[count] == Cirth.IR.getErebor()) {
                            count++;
                            if (count < charArray.length
                                    && charArray[count] == Cirth.IR.getErebor()) {
                                count++;
                                if (count < charArray.length
                                        && charArray[count] == Cirth.IR.getErebor()) {
                                    count++;
                                    if (count < charArray.length
                                            && charArray[count] == Cirth.IR.getErebor()) {
                                        sb.append(KeyboardCharUtil.NUMBER_SIX);
                                        next = count;
                                        next++;
                                    }
                                }
                            }
                        }
                    } else {
                        sb.append(KeyboardCharUtil.NUMBER_ONE);
                        next++;
                    }
                } else if (charArray[next] == Cirth.ON.getErebor()) {
                    sb.append(KeyboardCharUtil.NUMBER_TWO);
                    next++;
                } else if (charArray[next] == Cirth.GEM.getErebor()) {
                    sb.append(Cirth.GEM.getLetter());
                    next++;
                } else if (charArray[next] == Cirth.RAMEKH.getErebor()) {
                    sb.append(Cirth.RAMEKH.getLetter());
                    next++;
                } else if (charArray[next] == Cirth.YAN_NIBUM.getErebor()) {
                    sb.append(KeyboardCharUtil.NUMBER_FIVE);
                    next++;
                } else if (charArray[next] == Cirth.HAM.getErebor()) {
                    sb.append(KeyboardCharUtil.NUMBER_SEVEN);
                    next++;
                } else if (charArray[next] == Cirth.GIMON.getErebor()) {
                    sb.append(Cirth.GIMON.getLetter());
                    next++;
                } else if (charArray[next] == Cirth.TAGER.getErebor()) {
                    sb.append(Cirth.TAGER.getLetter());
                    next++;
                } 
                parse(sb, charArray);
            } else if (c.equals('\n')) {
                sb.append('\n');
                next++;
                parse(sb, charArray);
            } else {
                missingSymbols.add(((Character) charArray[next]).toString());
                next++;
                parse(sb, charArray);
            }
        }
    }
    
}
