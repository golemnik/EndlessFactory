package com.tech.factory;

import com.tech.factory.Realesation.core.SimpleInformer;
import com.tech.factory.schema_2_0.coreModule.core.InfoLevel;
import com.tech.factory.schema_2_0.dataModule.Signature;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Signature s = new Signature(List.of("123", "asd"));
        try {
            SimpleInformer.inform(InfoLevel.INFO, s);
            s.signature().add("222");
            SimpleInformer.inform(InfoLevel.INFO, s);
        }
        catch (Exception e) {
            SimpleInformer.inform(InfoLevel.ERROR, e);
        }
    }

}