package com.tech.factory.schema.holograms.mCoreHologram;

import com.tech.factory.schema.holograms.mGeneralHolograms.HoloSubCore;
import com.tech.factory.schema.holograms.mTransferHologram.HoloPort;
import com.tech.factory.schema.holograms.mTransferHologram.Wayable;

import java.util.List;

public interface HoloCore extends Wayable {
    void init ();
    List<HoloSubCore> moduleCoreList();
    HoloPort getPort ();

}