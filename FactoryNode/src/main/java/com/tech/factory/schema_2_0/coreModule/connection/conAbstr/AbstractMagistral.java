package com.tech.factory.schema_2_0.coreModule.connection.conAbstr;

import com.tech.factory.schema_2_0.coreModule.connection.Container;
import com.tech.factory.schema_2_0.coreModule.connection.Magistral;
import com.tech.factory.schema_2_0.coreModule.connection.Port;
import com.tech.factory.schema_2_0.general.Informable;

public record AbstractMagistral(Port transmitter, Port receiver) implements Magistral {
    @Override
    public void transfer(Container container) {
        receiver.delivered(container);
    }

    @Override
    public void port_notify() {

    }

    public String state() {
        return this.getClass().getSimpleName() + ":\n" +
                "Transmitter: " + transmitter + "\n"+
                "Receiver: " + receiver;
    }
}
