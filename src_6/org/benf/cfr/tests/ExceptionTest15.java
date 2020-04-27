package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;

public class ExceptionTest15 {
    public static void decompileWrong(List<ArrayList<Object>> tasks) {
        for (ArrayList<Object> task : tasks) {
            while (true) {
                try {
                    if (task.isEmpty()) {
                        throw new RuntimeException();
                    }
                    System.out.println(task.get(0).toString());
                } catch (NullPointerException ex) {
                    ex.printStackTrace();
                    continue;
                } catch (RuntimeException ex) {
                    ex.printStackTrace();
                    throw ex;
                }
                break;
            }
        }
    }
}
