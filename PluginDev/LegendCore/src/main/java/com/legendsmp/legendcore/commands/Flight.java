package com.legendsmp.legendcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Flight implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equals("flight")) {
            if (commandSender instanceof Player) {
                Player player = (Player) commandSender;
                player.sendMessage("Fly high!");
                player.setAllowFlight(true);
            } else {
                System.out.println("You need to be a player to do this command");
            }

            return false;
        }
        return false;
    }
}
