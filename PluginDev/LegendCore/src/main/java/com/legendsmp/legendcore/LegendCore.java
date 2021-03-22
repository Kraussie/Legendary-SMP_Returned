package com.legendsmp.legendcore;

import com.legendsmp.legendcore.events.PlayerChat;
import com.legendsmp.legendcore.events.PlayerJoinQuiz;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
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

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("suicide")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Bye Bye :D");
                player.setHealth(0);

            } else {
                System.out.println("You need to be a player to do this command.");
            }

        }


        if (command.getName().equals("heal")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Here you go!");
                player.setHealth(20);
            } else {
                System.out.println("You need to be a player to do this command.");


                if (command.getName().equals("feed")) {
                    if (sender instanceof Player) {
                        Player player = (Player) sender;
                        player.sendMessage("Nom Nom");
                        player.setFoodLevel(20);

                    } else {
                        System.out.println("You need to be a player to do this command.");

                    }


                }

                return false;
            }
        }
        return false;
    }
}