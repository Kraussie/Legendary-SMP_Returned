package com.legendsmp.legendcore.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.weather.WeatherChangeEvent;

import static org.bukkit.Bukkit.getLogger;
import static org.bukkit.Bukkit.getWorld;

public class WeatherCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
            getLogger().info("Command [/weather] executed by " + p.getName());

        } else {
            getLogger().info("Command [/weather] executed");
        }

        World w = getWorld("world");
        if (args[0].equals("storm")) {
            w.setStorm(true);
            w.setThundering(true);


        } else if (args[0].equals("rain")) {
            w.setStorm(true);
            w.setThundering(false);


        } else if (args[0].equals("clear")) {
            w.setStorm(false);
            w.setThundering(false);


        } else {
            commandSender.sendMessage("Error Unknown Weather Arguments");

        }








        return false;



    }
}
