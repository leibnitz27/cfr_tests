package org.benf.cfr.tests;

class SwitchConstructorTest1a {
    SwitchConstructorTest1a(int i, int j, int x, int y) { }

    SwitchConstructorTest1a(Byte b) {
        this(
            switch(b) {
            default -> 1;
            },
        switch(b) {
            default -> 2;
        },
        switch(b) {
            default -> 3;
        },
        switch(b) {
            default -> 4;
        }
        );
    }
}
