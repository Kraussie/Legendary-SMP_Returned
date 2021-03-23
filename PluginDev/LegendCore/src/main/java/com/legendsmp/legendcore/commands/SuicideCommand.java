package com.legendsmp.legendcore.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SuicideCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (command.getName().equals("suicide")) {
            if (commandSender instanceof Player) {
                Player player = (Player) commandSender;
                player.sendMessage("Bye Bye ( -_･) ︻デ═一");
                player.setHealth(0);

            } else {
                System.out.println("You need to be a player to do this command.");
            }
        }
        return false;
    }
}
