package org.benf.cfr.tests;

public class AbeFreedom {
    public static void main(String[] args) {
        // CFR is unable to restructure
//        System.out.println("+block1");
        block2: {
  //          System.out.println("+block2");
            if(random() == 5) break block2;
            block3: {
//                if(random() == 5) return;
//                System.out.println("+block3");
                if(random() == 5) break block3;
                System.out.println("-block3");
                if(random() == 5) break block2;
            }
            System.out.println("-block2");
        }
        System.out.println("-block1");
    }

    static int random() {
        return((int)(Math.random() * 10));
    }
}
