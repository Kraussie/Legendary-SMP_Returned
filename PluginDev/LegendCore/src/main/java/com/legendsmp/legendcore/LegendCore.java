package com.legendsmp.legendcore;

import com.legendsmp.legendcore.commands.*;
import com.legendsmp.legendcore.events.PlayerChat;
import com.legendsmp.legendcore.events.PlayerDeath;
import com.legendsmp.legendcore.events.PlayerJoinQuit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class LegendCore extends JavaPlugin {
    @Override
    public void onEnable() {

        // (2) Custom Event Listeners
        getServer().getPluginManager().registerEvents(new PlayerJoinQuit(), this);
        getServer().getPluginManager().registerEvents(new PlayerChat(), this);
        getServer().getPluginManager().registerEvents(new PlayerDeath(), this);
        getCommand("flight").setExecutor(new Flight());
        getCommand("heal").setExecutor(new HealAndFeedCommand());
        getCommand("feed").setExecutor(new HealAndFeedCommand());
        getCommand("suicide").setExecutor(new SuicideCommand());
        getCommand("weather").setExecutor(new WeatherCommand());
        getCommand("nick").setExecutor(new NicknameCommand());
        // Notify console that LegendCore has been fully enabled
        getLogger().info("LegendCore ENABLED");
    }

    @Override
    public void onDisable() {

        // Notify console that LegendCore has been fully disabled
        getLogger().info("LegendCore DISABLED");
        {
        }
    }
}