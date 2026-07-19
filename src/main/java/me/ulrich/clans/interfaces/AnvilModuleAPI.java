package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.data.AnvilSession;

public interface AnvilImplement {

    boolean supports();

    AnvilSession open(Player player, String title, Optional<String> final_text, Optional<ItemStack> left, Optional<ItemStack> right, Optional<ItemStack> output, AnvilClickHandler handler);
	
	boolean isInternal();
	
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();
}
