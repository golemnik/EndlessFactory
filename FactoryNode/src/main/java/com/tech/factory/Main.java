package com.tech.factory;

import com.tech.factory.Realesation.core.Core;
import com.tech.factory.Realesation.core.CorePort;
import com.tech.factory.Realesation.core.SimpleInformer;
import com.tech.factory.Realesation.connection.TxtContainer;
import com.tech.factory.schema_2_0.coreModule.connection.AbstractPortable;
import com.tech.factory.schema_2_0.coreModule.core.AbstractCore;
import com.tech.factory.schema_2_0.coreModule.core.InfoLevel;

public class Main {
    public static void main(String[] args) {
        try {
            AbstractPortable port1 = new CorePort();
            AbstractCore core = new Core();
            port1.magistralIn(core);
            port1.deliver(port1.getMagistral().get("Core"), new TxtContainer("Hello world!"));
            System.out.println(((TxtContainer) core.receivedContainer()).data);
        }
        catch (Exception e) {
            SimpleInformer.inform(InfoLevel.ERROR, e);
        }
    }
}