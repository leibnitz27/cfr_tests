package org.benf.cfr.tests;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Nonsense {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("two.txt");

        Iterator<String> iter = list.iterator();
        try(FileWriter fw1 = new FileWriter("one.txt"); PrintWriter pw1 = new PrintWriter(fw1)) {
            while(iter.hasNext()) {
                String str = iter.next();

                try(FileWriter fw2 = new FileWriter(str); PrintWriter pw2 = new PrintWriter(fw2)) {
                    for(int i = 0; i < 3; i++) {
                        for(int j = 0; j < 4; j++) {
                            pw2.println("hello world");
                        }
                    }
                }
            }
            pw1.println("done");
        } catch(IOException ioe) {

        }
    }
}