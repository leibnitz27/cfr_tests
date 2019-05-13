package org.benf.cfr.tests;

/**
 * From Jarkkos.
 */
public class TypeTest36 {
        public static Object createServer() throws Exception {

            Object newInstance = null;

            newInstance =

                    Class.forName("com.sun.jdmk.comm.HtmlAdapterServer").newInstance();

            return newInstance;

        }

}
