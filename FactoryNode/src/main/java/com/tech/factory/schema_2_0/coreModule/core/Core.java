package com.tech.factory.schema_2_0.coreModule.core;

import com.tech.factory.schema_2_0.coreModule.connection.Port;
import com.tech.factory.schema_2_0.dataModule.Storage;

public interface Core {
    Informer getInformer ();
    Port getPort ();
    Storage getStorage ();

}
