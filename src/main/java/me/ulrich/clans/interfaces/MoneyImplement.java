package me.ulrich.clans.interfaces;

import java.util.Optional;
import java.util.UUID;

import org.bukkit.entity.Player;

public interface MoneyImplement {

	
	boolean hasMoney(Player player, double amount);

	boolean addMoney(Player player, double amount);

	boolean withdrawMoney(Player player, double amount);

	double getMoney(Player player, boolean inDouble);
	
	double clanBalance(UUID clanUUID);
	
	boolean hasClanBank(UUID clanUUID, Double value);
	
	boolean addClanBank(UUID clanUUID, Double value, Player sender);
	
	boolean withdrawClanBank(UUID clanUUID, Double value, Player sender);
	
	boolean setClanBank(UUID clanUUID, Double balance, Player sender);
	
	Double clanBankLimit(UUID clanUUID);
	
	String clanBalanceFormated(UUID clanUUID);
		
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();


}
