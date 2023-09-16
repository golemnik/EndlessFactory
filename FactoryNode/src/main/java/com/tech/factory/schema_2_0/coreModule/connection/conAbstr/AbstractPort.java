package com.tech.factory.schema_2_0.coreModule.connection.conAbstr;

import com.tech.factory.schema_2_0.coreModule.connection.Container;
import com.tech.factory.schema_2_0.coreModule.connection.Magistral;
import com.tech.factory.schema_2_0.coreModule.connection.Port;
import com.tech.factory.schema_2_0.coreModule.core.InfoLevel;
import com.tech.factory.schema_2_0.coreModule.core.Informer;
import com.tech.factory.schema_2_0.general.Informable;

import java.util.ArrayList;
import java.util.List;

public class AbstractPort extends Informable implements Port {
    private final List<Magistral> connections = new ArrayList<>();

    @Override
    public boolean delivered(Container container) {
        return false;
    }

    @Override
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

    @Override
    public void magistralIn(Port receiver) {
        Magistral magistral = new AbstractMagistral(this, receiver);
        receiver.magistralOut(magistral);
        registrateMagistral(magistral);
    }

    @Override
    public void magistralOut(Magistral magistral) {
        registrateMagistral(magistral);
    }

    @Override
    public boolean registrateMagistral(Magistral magistral) {
        try {
            connections.add(magistral);
            Informer.inform(InfoLevel.INFO, "New magistral from <"
                    + magistral.transmitter().
                    + "> to <");
            return true;
        }
        catch (Exception e) {
            Informer.inform(InfoLevel.ERROR, e);
            return false;
        }
    }
    @Override
    public String state() {
        return this.getClass().getSimpleName() + ":\n" +;
    }
}
