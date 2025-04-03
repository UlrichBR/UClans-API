package me.ulrich.clans.interfaces;

import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface EventImplement {
	
	boolean playerInEvent(Player player);
	
	boolean playerInEvent(UUID playerUUID);
	
	boolean locationIsEvent(Location location);
	
	Optional<String> getLocationEventName(Location location);
	
	Optional<String> getPlayerEventName(Player player);
	
	Optional<String> getPlayerEventName(UUID playerUUID);

	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();

}
