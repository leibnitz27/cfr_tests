package org.benf.cfr.tests;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SystemModuleTest {
    public static void main(String ... args) throws Exception {
        Map<String, String> mapRes = new HashMap<>();
        Class moduleLayer = Class.forName("java.lang.ModuleLayer");
        Method method = moduleLayer.getMethod("boot");
        Object res = method.invoke(null);
        Method modulesMeth = res.getClass().getMethod("modules");
        Object modules = modulesMeth.invoke(res);
        Set set = (Set)modules;
        Method getPackagesMethod = Class.forName("java.lang.Module").getMethod("getPackages");
        Method getNameMethod = Class.forName("java.lang.Module").getMethod("getName");
        for (Object module : set) {
            Object res2 = getPackagesMethod.invoke(module);
            Set<String> m1 = (Set<String>)res2;
            String name = (String)getNameMethod.invoke(module);
            for (String packageName : m1) {
                mapRes.put(packageName, name);
            }
        }
        int x = 1;
    }

}
