package org.benf.cfr.tests;


/*
 *
  jdk
  boolean is1(int);
    Code:
       0: iload_1
       1: iconst_1
       2: if_icmpne     9
       5: iconst_1
       6: goto          10
       9: iconst_0
      10: ireturn

  ecj
  boolean is1(int);
    Code:
       0: iload_1
       1: iconst_1
       2: if_icmpne     7
       5: iconst_1
       6: ireturn
       7: iconst_0
       8: ireturn
 */
public class ReturnTest1 {
    boolean is1(int x) {
        return x == 1;
    }
}
