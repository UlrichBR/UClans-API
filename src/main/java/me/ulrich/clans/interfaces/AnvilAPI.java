package me.ulrich.clans.interfaces;

import org.bukkit.entity.Player;

public interface AnvilAPI {

    boolean supports(String serverVersion);

    void open(Player player, String title, String text, AnvilCallback callback);
	
}
