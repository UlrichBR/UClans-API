package me.ulrich.clans.interfaces;

import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;

import me.ulrich.clans.data.EncodedLocationData;
import me.ulrich.clans.data.HomesData;

public interface HomeModuleAPI {

	public boolean deleteHome(UUID playerUUID, String name);

	public boolean setHome(UUID player, Location location, String name);

	public boolean setHome(UUID player, Location location, String name, Optional<String> password);

	public boolean hasHome(UUID playerUUID, String home) ;

	public Optional<Location> getHomeLocation(UUID player, String home);

	public Optional<EncodedLocationData> getEncodedHomeLocation(UUID player, String home);

	public Optional<HomesData> getHomeData(UUID player, String home);
	
}
