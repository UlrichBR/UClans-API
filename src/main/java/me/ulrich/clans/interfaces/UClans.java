package me.ulrich.clans.interfaces;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.api.AddonAPIManager;
import me.ulrich.clans.api.BossBarAPIManager;
import me.ulrich.clans.api.ClanAPIManager;
import me.ulrich.clans.api.ColorAPIManager;
import me.ulrich.clans.api.CommandAPIManager;
import me.ulrich.clans.api.EntityAPIManager;
import me.ulrich.clans.api.GuiAPIManager;
import me.ulrich.clans.api.HooksAPIManager;
import me.ulrich.clans.api.LibAPIManager;
import me.ulrich.clans.api.ModerationAPIManager;
import me.ulrich.clans.api.PlayerAPIManager;
import me.ulrich.clans.api.PlayerInviteAPIManager;

public interface UClans {

	JavaPlugin getPlugin();

	ClanAPIManager getClanAPI();

	PlayerAPIManager getPlayerAPI();
	
	HooksAPIManager getHooksAPI();
	
	BossBarAPIManager getBossBarAPI();
	
	AddonAPIManager getAddonAPI();
	
	LibAPIManager getLibAPI();
		
	ModerationAPIManager getModAPI();
	
	CommandAPIManager getCommandAPI();
									
	EntityAPIManager getEntityAPI();
		
	GuiAPIManager getGuiAPI();

	ColorAPIManager getColorAPI();
	
	PlayerInviteAPIManager getInviteAPI();
	
	
	
	void startTasks();
	void registerEvents();
	
	void loadAddons();
	void loadExtensions();
	void loadModules();

	
	

}
