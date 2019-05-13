package org.benf.cfr.tests;

public class LoopTest65 {
//    void loopBug1(){
//        int out;
//        for(int i = out = hide(0); i < 10; i++);
//    }
    void loopBug2(int x){
        int out;
        for (int j= out=x;j<20;++j) {
        for(int i = out = hide(0); i < 10; i++){
            out++;
        }
        }
    }
    int hide(int num){ return num; }
}
