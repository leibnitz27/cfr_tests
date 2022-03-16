import org.benf.cfr.tests.MyList;

import java.util.List;

@Deprecated
module test {
    requires transitive java.desktop;
    requires java.management;
    requires static java.sql;
    provides List with MyList;

    uses java.util.List;
}