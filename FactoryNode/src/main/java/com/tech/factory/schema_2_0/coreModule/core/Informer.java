package com.tech.factory.schema_2_0.coreModule.core;

public interface Informer {
    static void inform(InfoLevel lvl, Object o) {
        System.out.println(o.getClass().getSimpleName() + " [" + lvl + "]: " + o);
    }

    static void inform(InfoLevel lvl, Throwable t) {
        System.out.println(t.getClass().getSimpleName() + " [" + lvl + "]: " + t.getMessage());
    }
}
