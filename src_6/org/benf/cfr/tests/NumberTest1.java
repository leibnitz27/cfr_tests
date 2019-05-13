package org.benf.cfr.tests;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

public class NumberTest1 {
    /** Returns the double value, but will throw an exception if the
     object isn't convertible.
     * @return the current value as a double
     */
    public double getNumericValue(NumberFormat numberFormat, String currentValue, Locale locale) throws NumberFormatException {
        if (numberFormat == null) {
            numberFormat = DecimalFormat.getInstance(locale);
            // grouping really messes up the interpretation of the values
            // for example, "1,1" is interpreted as 11, 1,3E4 is 130000, etc.
            numberFormat.setGroupingUsed(false);
        }
        // convert to a number, but the entire string must be consumed.
        String trimmed = currentValue.trim().toUpperCase();
        ParsePosition zero = new ParsePosition(0);
        Number n = numberFormat.parse(trimmed, zero);
        int consumed = zero.getIndex();
        if (n != null && consumed == trimmed.length()) {
            // there is a problem returning the double if the value is
            // actually a long
            // for example, the value -9223372034707292160
            // will loose precision (-9223372034707292200)
            // the documentation says that parse returns either a long or a
            // double, but we'll check for an int anyway
            if ( n instanceof Long || n instanceof Integer ) {
                return n.longValue();
            }
            return n.doubleValue();
        }
        //return Double.valueOf(currentValue).doubleValue();
        if ( locale == null ) {
            throw new NumberFormatException("Invalid number \"" + currentValue
                    + "\" ");
        }
        throw new NumberFormatException("Invalid number \"" + currentValue +
                "\" for locale " + locale.getDisplayName());
    }
}
