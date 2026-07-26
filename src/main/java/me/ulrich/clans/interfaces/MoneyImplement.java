package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.entity.Player;

public interface MoneyImplement {

	
	boolean hasMoney(Player player, double amount);

	boolean addMoney(Player player, double amount);

	boolean withdrawMoney(Player player, double amount);

	double getMoney(Player player, boolean inDouble);
		
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();


}
