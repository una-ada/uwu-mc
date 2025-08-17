package dev.xn__z7x.uwu;

import dev.xn__z7x.uwu.platform.Services;

public class uwuCommon {
    public static void init() {
        Constants.LOG.info("Hello from Common init on {}! we are currently in a {} environment!", Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName());
        if (Services.PLATFORM.isModLoaded("unas_uwu")) {
            Constants.LOG.info("\"Nyaa! Nya nya nyaa~\" - Una");
        }
    }
}