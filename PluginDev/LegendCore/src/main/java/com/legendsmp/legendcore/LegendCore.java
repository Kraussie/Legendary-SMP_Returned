package com.legendsmp.legendcore;

import com.legendsmp.legendcore.events.PlayerChat;
import com.legendsmp.legendcore.events.PlayerJoinQuiz;
import org.bukkit.plugin.java.JavaPlugin;

public final class LegendCore extends JavaPlugin {
    @Override
    public void onEnable() {

        // (2) Custom Event Listeners
        getServer().getPluginManager().registerEvents(new PlayerJoinQuiz(), this);
        getServer().getPluginManager().registerEvents(new PlayerChat(), this);

        // Notify console that LegendCore has been fully enabled
        getLogger().info("LegendCore ENABLED");
    }

    @Override
    public void onDisable() {

        // Notify console that LegendCore has been fully disabled
        getLogger().info("LegendCore DISABLED");
    }
}

