package org.benf.cfr.tests;


public class ScopeTest6a<fred> {

    fred fred;

    void fred(fred fred) {
        this.fred = fred;
    }

    void fred(fred fred1, fred fred2, boolean b) {
        {
            fred fred = b ? fred1 : fred2;
            if (fred != fred2) this.fred = fred;
            fred(fred, this.fred, b);
        }
    }

}
