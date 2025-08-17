package dev.xn__z7x.uwu;

import net.fabricmc.api.ModInitializer;

public class uwuFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        uwuCommon.init();
    }
}
