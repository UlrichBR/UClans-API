package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.entity.Player;

import me.ulrich.clans.data.AnvilSession;

public interface AnvilImplement {

    boolean supports();

    AnvilSession open(Player player, String title, AnvilClickHandler handler);
	
	boolean isInternal();
	
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();
}

