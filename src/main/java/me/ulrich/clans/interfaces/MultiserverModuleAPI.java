package me.ulrich.clans.interfaces;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanEnum.DebugType;

public interface MultiserverModuleAPI {

	boolean syncEnabled();

	void sendSync(String type, String content);
	
	void sendSync(String type, UUID uuid);

	void serverConnector(Player player, String server);

	void debugMessage(DebugType type, String message);

	void addPendingLocation(UUID player, String world, double x, double y, double z, float yaw, float pitch);
	
	void teleportOrQueue(UUID uuid, Location loc);
	
	void runPendingTeleport(Player player);
	
	String getOutGoindChannel();
	
	String getInComingChannel();
	
	String getServerName();

}