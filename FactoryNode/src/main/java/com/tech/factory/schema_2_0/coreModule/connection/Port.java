package com.tech.factory.schema_2_0.coreModule.connection;

import com.tech.factory.schema_2_0.general.Informable;

public interface Port {

    boolean delivered (Container container);

    boolean deliver (Magistral magistral, Container container);

    void magistralIn (Port receiver);
    void magistralOut (Magistral magistral);

    boolean registrateMagistral (Magistral magistral);

}
