package com.tech;

import com.tech.factory.schema_2_0.general.beacon.AbstractBeacon;
import com.tech.factory.schema_2_0.general.beacon.BeaconType;

public class TicketBeacon extends AbstractBeacon {
    public TicketBeacon() {
        super(BeaconType.UNIT, "TicketBeacon");
    }
}
