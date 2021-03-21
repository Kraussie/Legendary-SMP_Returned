package com.legendsmp.legendcore;

import org.bukkit.plugin.java.JavaPlugin;

public final class LegendCore extends JavaPlugin {

    @Override
    public void onEnable() {

        // Notify console that LegendCore has been fully enabled
        getLogger().info("LegendCore ENABLED");
    }

    @Override
    public void onDisable() {

        // Notify console that LegendCore has been fully disabled
        getLogger().info("LegendCore DISABLED");
    }
}
