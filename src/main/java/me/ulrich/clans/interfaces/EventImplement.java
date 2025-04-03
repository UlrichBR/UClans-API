package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface EventImplement {
	
	boolean playerInEvent(Player player);
	
	boolean locationIsEvent(Location location);
	
	Optional<String> getLocationEventName(Location location);
	
	Optional<String> getPlayerEventName(Player player);

	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();

}
