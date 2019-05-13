package org.benf.cfr.tests;


public class ScopeTest6<fred> {

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
        {
            fred fred = b ? fred2 : fred1;
            if (fred != null) this.fred = fred;
            fred(fred, this.fred, b);
        }
        fred(fred, this.fred, b);
        {
            int fred = 3;
            fred = this.fred == null ? 1 : 2;
            fred(this.fred, this.fred, fred==1);
        }
    }

}
