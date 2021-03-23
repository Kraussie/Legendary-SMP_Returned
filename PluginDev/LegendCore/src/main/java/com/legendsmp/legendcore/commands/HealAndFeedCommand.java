package com.legendsmp.legendcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class HealAndFeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (command.getName().equals("heal")) {
            if (commandSender instanceof Player) {
                Player player = (Player) commandSender;
                player.sendMessage("Here you go!");
                player.setHealth(20);
            } else {
                System.out.println("You need to be a player to do this command.");
            }
        }

        if (command.getName().equals("feed")) {
            if (commandSender instanceof Player) {
                Player player = (Player) commandSender;
                player.sendMessage("Nom Nom");
                player.setFoodLevel(20);
            } else {
                System.out.println("You need to be a player to do this command.");
            }
        }
        return false;
    }
}