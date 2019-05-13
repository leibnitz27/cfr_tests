package org.benf.cfr.tests;

public class Dmitry3 {
    public Long getHomeCountryCode(Object rowVal) throws Exception {
        Long countryCode = null;
        if (rowVal == null) {
            try {
                if (countryCode == null) {
                    System.out.println("FO");
                    throw new RuntimeException();
                }
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
