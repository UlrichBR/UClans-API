package me.ulrich.clans.interfaces;

import java.util.UUID;


public interface DiscordModuleAPI {
	
	boolean sendDiscordNotification(UUID clanID, String message);
	
	boolean registerClan(UUID clanID);
	
	boolean unregisterClan(UUID clanID);
	
	void unlinkDiscordChannel(UUID clanID);
	
	boolean sendDiscordChat(UUID clanID, UUID sender, String rawMessage, boolean onlyLockedChat);
	
	boolean isConnectedClan(UUID clanID);
	
	String parseText(UUID player, String identifier);
	
}
