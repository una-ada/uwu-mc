package dev.xn__z7x.uwu;

import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class uwuForge {
    public uwuForge() {
        Constants.LOG.info("Hello Forge world!");
        uwuCommon.init();
    }
}