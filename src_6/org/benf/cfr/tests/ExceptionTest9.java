package org.benf.cfr.tests;

import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTest9 {

    void test1(String path) throws Exception {
        File.createTempFile(path, path);
    }

    void test2(String path) throws Exception {
        try {
            File.createTempFile(path, path);
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    void test3(String path) throws Exception {
        try {
            File.createTempFile(path, path);
        } catch (IOException e) {
            throw e;
        }
    }
}
