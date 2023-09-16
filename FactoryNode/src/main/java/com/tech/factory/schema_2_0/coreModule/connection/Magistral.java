package com.tech.factory.schema_2_0.coreModule.connection;


public interface Magistral {
    void transfer (Container container);
    Port transmitter ();
    Port receiver ();
    void port_notify ();
}
