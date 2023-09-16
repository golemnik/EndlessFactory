package com.tech.factory.schema_2_0.coreModule.connection;

import com.tech.factory.schema_2_0.coreModule.core.InfoLevel;
import com.tech.factory.schema_2_0.coreModule.core.Informer;
import com.tech.factory.schema_2_0.general.Informable;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractPortable extends Informable {
    private Map<String, Magistral> connections = new HashMap<>();
    public final String name;
    private Container container;

    public AbstractPortable(String name) {
        this.name = name;
    }

    public Map<String, Magistral> getMagistral () {
        return connections;
    }

    public boolean delivered(Container container) {
        this.container = container;
        return true;
    }

    public Container receivedContainer () {
        return container;
    }

    public boolean deliver(Magistral magistral, Container container) {
        try {
            magistral.transfer(container);
            return true;
        }
        catch (Exception e) {
            Informer.inform(InfoLevel.ERROR, e);
            return false;
        }
    }

     public <T extends AbstractPortable> void magistralIn(T receiver) {
        Magistral magistral = new Magistral(this, receiver);
        receiver.magistralOut(magistral);
        registrateMagistral(this.name, magistral);
    }
    public void magistralOut(Magistral magistral) {
        registrateMagistral(this.name, magistral);
    }

    public boolean registrateMagistral(String key, Magistral magistral) {
        try {
            connections.put(key, magistral);
            Informer.inform(InfoLevel.INFO, connections);
            return true;
        }
        catch (Exception e) {
            Informer.inform(InfoLevel.ERROR, e);
            return false;
        }
    }

    public String state() {
        return this.getClass().getSimpleName() + ":\n???";
    }
}
