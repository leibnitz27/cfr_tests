package org.benf.cfr.tests;

import static org.benf.cfr.tests.StaticImport.importedTest;

// https://github.com/leibnitz27/cfr/issues/102
class StaticImportTest2b extends StaticImportTest2a {
    // This prevents us from using the full name resolution!!
    static class org {
        static class benf {
            static class cfr {
                static class tests {
                    static class StaticImport { }
                }
            }
        }
    }

    // And this prevents us from NOT using it ;)
//    static class StaticImport {
//    }

    void test() {
        importedTest();
    }

    void test(org.benf.cfr.tests.StaticImport s) {
        importedTest();
    }
}