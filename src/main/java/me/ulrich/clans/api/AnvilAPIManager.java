package me.ulrich.clans.api;

import org.bukkit.entity.Player;

import me.ulrich.clans.interfaces.AnvilAPI;
import me.ulrich.clans.interfaces.AnvilCallback;

public class AnvilAPIManager implements AnvilAPI {

	@Override
	public boolean supports(String serverVersion) {
		return false;
	}

	@Override
	public void open(Player player, String title, String text, AnvilCallback callback) {
		
	}

}
