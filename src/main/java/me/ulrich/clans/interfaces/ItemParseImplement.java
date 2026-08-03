package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.inventory.ItemStack;

public interface ItemParseImplement {

	ItemStack getItem(String itemName);
	
	Optional<String> getPluginVersion();

	Optional<String> getPluginName();
	
}
