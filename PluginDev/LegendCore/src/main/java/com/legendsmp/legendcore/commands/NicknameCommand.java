package com.legendsmp.legendcore.commands;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class NicknameCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
       if (command.getName().equals("nick")) {
           if (commandSender instanceof Player) {
               Player player = (Player) commandSender;
               player.sendMessage("Who are you?");
               player.setDisplayName(strings[0]);

               // /nick BLAH BLAH BLAH
               // /nick  0    1    2
               // strings[0]
               }
           }
            return false;
       }

    }
