package com.tech.factory.schema.abstractions.mCoreAbstraction;

import com.tech.factory.schema.holograms.mCoreHologram.HoloCore;
import com.tech.factory.schema.holograms.mGeneralHolograms.HoloSubCore;
import com.tech.factory.schema.holograms.mTransferHologram.HoloPort;
import com.tech.factory.schema.holograms.mTransferHologram.HoloWay;
import com.tech.factory.schema.holograms.mTransferHologram.Wayable;

import java.util.List;

public abstract class AbstractCore implements HoloCore {
    private ModuleLayer layer;
    private HoloPort port;
    private List<HoloSubCore> moduleCoreList;
    public AbstractCore (ModuleLayer layer) {
        this.layer = layer;
        init();
    }
    @Override
    public void init() {
        port = HoloPort.getPort(layer);
        moduleCoreList = HoloSubCore.getSubCores(layer);
    }

    @Override
    public List<HoloSubCore> moduleCoreList() {
        return moduleCoreList;
    }

    @Override
    public HoloPort getPort() {
        return port;
    }

    @Override
    public HoloWay makeWay(Wayable transmitter, Wayable recipient, HoloPort port) {
        return port.getNewWay(transmitter, recipient);
    }
}
