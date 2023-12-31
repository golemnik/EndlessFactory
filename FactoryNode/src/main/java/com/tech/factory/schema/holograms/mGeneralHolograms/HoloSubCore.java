package com.tech.factory.schema.holograms.mGeneralHolograms;

import com.tech.factory.schema.holograms.mTechHologram.HoloTech;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public interface HoloSubCore {
    void init ();
    HoloTech getTech ();

    static List<HoloSubCore> getSubCores (ModuleLayer layer) {
        return ServiceLoader
                .load(layer, HoloSubCore.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
}
