package org.benf.cfr.tests;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class ExampleA {


    public List<String> test(List<String> in, boolean  a, boolean  b, boolean c)
    {
        return in.stream().map((b? c : a) ? x -> x + "a" : String::toUpperCase).collect(Collectors.toList());
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
