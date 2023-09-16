package com.tech.factory.schema_2_0.coreModule.core.coreAbstr;

import com.tech.factory.schema_2_0.coreModule.connection.Port;
import com.tech.factory.schema_2_0.coreModule.core.Core;
import com.tech.factory.schema_2_0.dataModule.Storage;

public abstract class AbstractCore implements Core {
    private final AbstractInformer informer;
    private final Port port;
    private final Storage storage;
    public AbstractCore (AbstractInformer informer, Port port, Storage storage) {
        this.informer = informer;
        this.port = port;
        this.storage = storage;
    }
    @Override
    public AbstractInformer getInformer() {
        return informer;
    }

    @Override
    public Port getPort() {
        return port;
    }

    @Override
    public Storage getStorage() {
        return storage;
    }
}
