package DeathArena.ItemStacks;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Jakey on 16/7/2015.
 */
public class DalekItems {

    public static ItemStack DalekSword() {
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
        sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 15);

        return sword;
    }

    public static ItemStack DalekBow() {
        ItemStack bow = new ItemStack(Material.BOW, 1);
        bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 20);
        bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);

        return bow;
    }

    public static ItemStack DalekArrow() {
        ItemStack arrow = new ItemStack(Material.ARROW, 1);

        return arrow;
    }
}
