package org.benf.cfr.tests;

public interface Java9Test1 {
    default void validate(int x) {
        System.out.println(x == 2);
    }

    default void validate2(int x) {
        System.out.println(x == 3);
    }

    // static method, to get the calendar by identifier
    public static String of(String id) {
        return id;
    }

    // abstract method, to find if the date is a holiday
    public abstract boolean isHoliday(String date);

    // default method, using isHoliday()
    public default boolean isBusinessDay(String date) {
        return !isHoliday(date);
    }
}
