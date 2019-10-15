package org.benf.cfr.tests;

import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;

public class UsingTest11 {

    public static void main(String[] args) {
        String zipPath ="D:/test";
        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipPath))){
            String Hello ="Hello";
            System.out.println("==============>"+Hello);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}