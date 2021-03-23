package com.legendsmp.legendcore.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener {
    @EventHandler
    public void PlayerChat(AsyncPlayerChatEvent event) {
        String msg = event.getMessage();
        String name = event.getPlayer().getDisplayName();

        String result = ChatColor.GREEN + name + ChatColor.GRAY + " > " + ChatColor.WHITE + msg;
        event.setMessage(result);
        event.setFormat("%2$s");
    }
}
