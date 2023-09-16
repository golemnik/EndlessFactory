package com.tech.factory.schema_2_0.coreModule.connection;

public record Magistral (AbstractPortable transmitter, AbstractPortable receiver) {
    public void transfer(Container container) {
        receiver.delivered(container);
    }
    public String info() {
        return this.getClass().getSimpleName() + ":\n" +
                "Transmitter: " + transmitter.name + "\n"+
                "Receiver: " + receiver.name;
    }
}
