package DeathArena.Commands;

import DeathArena.DeathArenaMain;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.UUID;

public class ForceStartCommand implements CommandExecutor {

    DeathArenaMain plugin;

    public ForceStartCommand(DeathArenaMain instance) {
        plugin = instance;
    }

    public HashMap<UUID, Long> players = new HashMap<UUID, Long>();

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {



        return false;
    }

}