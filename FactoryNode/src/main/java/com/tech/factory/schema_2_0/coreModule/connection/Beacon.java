package com.tech.factory.schema_2_0.coreModule.connection;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class Beacon {
    private boolean active = false;
    private static List<Beacon> beacons;

    public static List<Beacon> getBeacons() {
        return beacons;
    }

    public static void getBeacons (ModuleLayer layer) {
        beacons = ServiceLoader
                .load(layer, Beacon.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
}
