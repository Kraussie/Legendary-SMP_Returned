package com.legendsmp.legendcore.events;

import com.legendsmp.legendcore.IConst;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinQuit implements Listener {
    @EventHandler
    // custom join message
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String name = player.getName();

        String msg = IConst.SERVER_MSG + ChatColor.GREEN + "Welcome to LegendsSMP, " + ChatColor.WHITE + name + "!";
        event.setJoinMessage(msg);
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        String name = player.getName();

        String msg = IConst.SERVER_MSG + ChatColor.GREEN + "LegendSMP will miss you " + ChatColor.WHITE + name + "!";
        event.setQuitMessage(msg);
    }
}
