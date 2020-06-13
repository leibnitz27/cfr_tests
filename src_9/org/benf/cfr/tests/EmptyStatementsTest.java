package org.benf.cfr.tests;

import java.io.Closeable;

class EmptyStatementsTest {
    void emptySwitch(int i) {
        switch (i) {}
    }
    
    void emptySwitchWithOperation(int i) {
        switch (i + 1) {}
    }
    
    void emptySwitch(Integer i) {
        // Acts as a null check
        switch (i) {}
    }
    
    enum TestEnum {}
    void emptySwitch(TestEnum e) {
        // Acts as a null check
        switch (e) {}
    }
    
    void emptySwitch(String s) {
        // Acts as a null check
        switch (s) {}
    }
    
    void emptyIf(int i) {
        if (i == 1) {}
        else {}
        
        if (i == 2);
    }
    
    void emptyWhile(int i) {
        while (i == 1) {}
        
        while (i == 2);
    }
    
    void emptyDoWhile(int i) {
        do {} while (i == 1);
        
        do; while (i == 2);
    }
    
    int emptyFor(int i) {
        for (i = 1; i == 1; i++) {}
        
        for (i = 2; i == 2; i++);
        
        return i;
    }
    
    void emptyEnhancedFor(int[] array) {
        for (int i : array) {}
        
        for (int i : array);
    }
    
    void emptyEnhancedFor(Iterable<Integer> iterable) {
        for (Object e : iterable) {}
        
        for (Object e : iterable);
    }
    
    void emptySynchronized(Object o) {
        synchronized (o) {}
    }
    
    void emptyTryCatch() {
        try {} catch (Exception e) {}
    }
    
    void emptyTryFinally() {
        try {} finally {}
    }
    
    void emptyTryCatchFinally() {
        try {} catch (Exception e) {} finally {}
    }
    
    void emptyTryWithResources(Closeable closeable) throws Exception {
        try (Closeable c = closeable) {}
    }
    
    void emptyTryWithResourcesAccess(Closeable closeable) throws Exception {
        try (closeable) {}
    }
    
    void emptyTryWithResourcesCatch(Closeable closeable) throws Exception {
        try (Closeable c = closeable) {} catch (Exception e) {}
    }
    
    void emptyTryWithResourcesAccessCatch(Closeable closeable) throws Exception {
        try (closeable) {} catch (Exception e) {}
    }
    
    void emptyTryWithResourcesFinally(Closeable closeable) throws Exception {
        try (Closeable c = closeable) {} finally {}
    }
    
    void emptyTryWithResourcesAccessFinally(Closeable closeable) throws Exception {
        try (closeable) {} finally {}
    }
    
    void emptyTryWithResourcesCatchFinally(Closeable closeable) throws Exception {
        try (Closeable c = closeable) {} catch (Exception e) {} finally {}
    }
    
    void emptyTryWithResourcesAccessCatchFinally(Closeable closeable) throws Exception {
        try (closeable) {} catch (Exception e) {} finally {}
    }
}
