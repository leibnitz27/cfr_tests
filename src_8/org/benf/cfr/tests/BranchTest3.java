package org.benf.cfr.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class BranchTest3 {

        private int i;
        private BranchTest3(int i){
            this.i = i;
        }

        private static boolean test() {
            return true;
        }

        void foo() {
            if (test()){
                File file = new File("");
                try (InputStream input = new FileInputStream(file)) {
                    i = 999;
                } catch (Throwable t){
                    throw new RuntimeException(t);
                }
            } else {
                System.out.println("foo");
                i = -1;
            }
            System.out.println("bar");
        }

}
