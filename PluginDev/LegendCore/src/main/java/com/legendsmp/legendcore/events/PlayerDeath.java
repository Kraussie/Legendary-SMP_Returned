package com.legendsmp.legendcore.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath implements Listener {
    @EventHandler
    //death message
    public void onPlayerDeath(PlayerDeathEvent event) {
        event.setDeathMessage(ChatColor.DARK_RED + event.getDeathMessage());
    }
}
