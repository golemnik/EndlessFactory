package com.tech.factory.schema.holograms.mTransferHologram;

public interface Wayable {
    HoloWay makeWay (Wayable transmitter, Wayable recipient, HoloPort port);
}
