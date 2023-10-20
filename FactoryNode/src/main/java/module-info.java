import com.tech.factory.schema_2_0.general.beacon.AbstractBeacon;

module FactoryNode {
    exports com.tech.factory.schema_2_0.coreModule.connection;
    exports com.tech.factory.schema_2_0.coreModule.core;
    exports com.tech.factory.schema_2_0.dataModule;
    exports com.tech.factory.schema_2_0.mechModule;
    exports com.tech.factory.schema_2_0.general.beacon;
    exports com.tech.factory.schema_2_0.general;

    uses AbstractBeacon;
}