package org.benf.cfr.tests;

public class CondTest5a {

    public boolean test (boolean  a, boolean  b, boolean c)
    {
        System.out.println((b? c : a) || c);
        return c;
    }

    /*
       public boolean test(boolean, boolean, boolean);
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: iload_2
       4: ifeq          14     // if !b goto 14
       7: iload_3
       8: ifeq          18     // if !c goto 18
      11: goto          22     // goto 22
      14: iload_1
      15: ifne          22     // if a goto 22
      18: iload_3
      19: ifeq          26     // if !c goto 26
      22: iconst_1
      23: goto          27
      26: iconst_0
      27: invokevirtual #3                  // Method java/io/PrintStream.println:(Z)V
      30: iload_3
      31: ireturn
}
     */
}
