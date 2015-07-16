package DeathArena.Commands;

import DeathArena.ItemStacks.AlchemistItems;
import DeathArena.ItemStacks.DalekItems;
import DeathArena.ItemStacks.RangerItems;
import DeathArena.ItemStacks.TankItems;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class ClassCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
        if (commandLabel.equalsIgnoreCase("class")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (args[0].equalsIgnoreCase("tank")) {
                    Inventory pi = player.getInventory();

                    pi.setItem(1, TankItems.TankFood());
                    pi.setItem(39, TankItems.Prot2DiamondHelm());
                    pi.setItem(38, TankItems.Prot2DiamondChest());
                    pi.setItem(37, TankItems.Prot2DiamondLegs());
                    pi.setItem(36, TankItems.Prot2DiamondBoots());
                    pi.setItem(0, TankItems.TankSword());

                    sender.sendMessage(ChatColor.DARK_RED + "You have chosen the Tank class.");
                    return true;
                }
                if (args[0].equalsIgnoreCase("ranger")) {
                    Inventory pi = player.getInventory();

                    pi.setItem(0, RangerItems.Bow());
                    pi.setItem(27, RangerItems.Arrow());
                    pi.setItem(36, RangerItems.Prot1LeatherBoots());
                    pi.setItem(37, RangerItems.Prot1LeatherLegs());
                    pi.setItem(38, RangerItems.Prot1LeatherChest());
                    pi.setItem(39, RangerItems.Prot1LeatherHelm());
                    pi.setItem(2, RangerItems.RangerFood());

                    sender.sendMessage(ChatColor.GREEN + "You have chosen the Ranger Class");
                    return true;
                }
                if (args[0].equalsIgnoreCase("alchemist")) {
                    Inventory pi = player.getInventory();

                    pi.setItem(9, new ItemStack(Material.FERMENTED_SPIDER_EYE, 8));
                    pi.setItem(10, new ItemStack(Material.GLASS_BOTTLE, 24));
                    pi.setItem(11, new ItemStack(Material.SPIDER_EYE, 4));
                    pi.setItem(12, new ItemStack(Material.SPECKLED_MELON, 8));
                    pi.setItem(13, new ItemStack(Material.FEATHER, 4));
                    pi.setItem(14, new ItemStack(Material.MAGMA_CREAM, 2));
                    pi.setItem(15, new ItemStack(Material.REDSTONE, 24));
                    pi.setItem(16, new ItemStack(Material.SULPHUR, 24));
                    pi.setItem(17, new ItemStack(Material.GOLDEN_CARROT, 1));
                    pi.setItem(18, new ItemStack(Material.GHAST_TEAR, 4));
                    pi.setItem(19, new ItemStack(Material.BLAZE_POWDER, 2));

                    pi.setItem(1, AlchemistItems.GodApple());
                    pi.setItem(0, AlchemistItems.AlchemistSword());
                    pi.setItem(36, AlchemistItems.Prot4Unb3LeatherBoots());
                    pi.setItem(37, AlchemistItems.Prot4Unb3LeatherLegs());
                    pi.setItem(38, AlchemistItems.Prot4Unb3LeatherChest());
                    pi.setItem(39, AlchemistItems.Prot4Unb3LeatherHelm());

                    return true;
                }
                if (args[0].equalsIgnoreCase("dalek")) {
                    if (sender.isOp()) {
                        Inventory pi = player.getInventory();
                        pi.addItem(DalekItems.DalekBow());
                        pi.addItem(DalekItems.DalekArrow());
                        pi.addItem(DalekItems.DalekSword());
                        return true;
                    }
                    return false;
                }
                if (args[0] == null) {
                    sender.sendMessage("You need to enter a valid class.");
                    return true;
                }
                sender.sendMessage("Invalid Class");
                return false;
            }
            sender.sendMessage(ChatColor.RED + "Only Players can execute this command.");
            return true;
        }
        return false;
    }
}