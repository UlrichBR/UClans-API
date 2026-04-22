package me.ulrich.clans.manager.utils;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Items {

	public boolean hasAllItems(Player player, List<String> itemList) {
		return true;
	}

	public void removeEnchantments(ItemStack stack) {

	}

	public int getAmount(Inventory inv, ItemStack item) {
		return 0;
	}

	public String getDurability(ItemStack item) {
		return null;
	}

	public ItemStack ItemHand(Player player) {
		return null;
	}


	public static void removeItem(ItemStack item, Player player) {

	}

	public void removeItem(ItemStack item, Player player, int amount) {

	}

	public boolean isSimilar(ItemStack one, ItemStack two) {
		return false;
	}
}
