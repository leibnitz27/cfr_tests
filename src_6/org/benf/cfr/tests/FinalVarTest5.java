package org.benf.cfr.tests;

class FinalVarConstants {
    public static final String[] Months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final int DECEMBER = 11;
}

public class FinalVarTest5 {
    public static final int MAX_CUSTOMERS = 11;

    public void thing() {
        System.out.println(MAX_CUSTOMERS);
        System.out.println(FinalVarConstants.DECEMBER);
        System.out.println(FinalVarConstants.Months[FinalVarConstants.DECEMBER]);
    }
}

