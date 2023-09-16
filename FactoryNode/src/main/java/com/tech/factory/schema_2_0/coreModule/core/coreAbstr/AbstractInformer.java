package com.tech.factory.schema_2_0.coreModule.core.coreAbstr;

import com.tech.factory.schema_2_0.coreModule.core.InfoLevel;
import com.tech.factory.schema_2_0.coreModule.core.Informer;

public abstract class AbstractInformer implements Informer {

    public static void inform(InfoLevel lvl, Object o) {
        System.out.println(o.getClass().getSimpleName() + " [" + lvl + "]: " + o);
    }

    public static void inform(InfoLevel lvl, Throwable t) {
        System.out.println(t.getClass().getSimpleName() + " [" + lvl + "]: " + t.getMessage());
    }
}
