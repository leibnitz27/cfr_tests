package org.benf.cfr.tests;

public class Dmitry2 {
    public Long getHomeCountryCode(Object rowVal) throws Exception {
        Long countryCode = null;
        if (rowVal == null) {
            try {
                if (countryCode == null) {
                    throw new RuntimeException();
                }
                System.out.println("FO");
            } catch (RuntimeException e) {
                countryCode = null;
            }
        } else {
            countryCode = null;
        }
        if (countryCode == null) {
            throw new Exception();
        }
        return countryCode;
    }
}
