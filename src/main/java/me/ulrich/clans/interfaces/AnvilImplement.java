package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.entity.Player;

public interface AnvilImplement {

    boolean supports(String serverVersion);

    void open(Player player, String title, String text, AnvilCallback callback);
	
	boolean isInternal();
	
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();
}
