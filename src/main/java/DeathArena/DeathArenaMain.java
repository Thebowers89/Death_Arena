package DeathArena;

import DeathArena.Commands.*;
import DeathArena.Listeners.ClassSelectorClickListener;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathArenaMain extends JavaPlugin {
    @Override
    public void onEnable() {
        registerCommands();
        registerListeners();
    }

    public void registerListeners() {
        new ClassSelectorClickListener(this);
    }

    private void registerCommands() {

        getCommand("class").setExecutor(new ClassCommand());
        //getCommand("start").setExecutor(new ForceStartCommand(this));
        //getCommand("configure").setExecutor(new ConfigureCommand(this));
    }
}