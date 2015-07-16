package DeathArena;

import DeathArena.Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathArenaMain extends JavaPlugin {
    @Override
    public void onEnable() {
        registerCommands();
    }

    private void registerCommands() {
        getCommand("class").setExecutor(new ClassCommand());
        //getCommand("start").setExecutor(new StartCommand(this));
        //getCommand("configure").setExecutor(new ConfigureCommand(this));
    }
}