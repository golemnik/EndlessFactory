package com.tech.factory.schema_2_0.general;

import java.lang.module.Configuration;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReference;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Layer {
    private static ModuleLayer layer;
    private static String path;
    public static void loadLayer(String path) {
        Path dir = Paths.get(path); // cells storage place

        ModuleFinder finder = ModuleFinder.of(dir); // cell finder to storage

        List<String> modules = finder
                .findAll()
                .stream()
                .map(ModuleReference::descriptor)
                .map(ModuleDescriptor::name)
                .collect(Collectors.toList());
        // return all cells from the genome (folder with modules)

        Configuration config = ModuleLayer
                .boot()
                .configuration()
                .resolve(finder, ModuleFinder.of(), modules);
        // config check dependency for all modules in the list as a dependency graph


        layer = ModuleLayer.boot().defineModulesWithManyLoaders(config, ClassLoader.getSystemClassLoader());
        // create layer for cells
    }

    public static ModuleLayer getLayer() {
        return layer;
    }
    public static void reloadLayer() {
        loadLayer(path);
    }
    public static void setPath (String path) {
        Layer.path = path;
    }
}
