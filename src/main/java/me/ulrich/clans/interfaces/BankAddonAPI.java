package me.ulrich.clans.interfaces;

import java.util.UUID;

import org.bukkit.entity.Player;

public interface BankAddonAPI {

	boolean hasMoney(Player player, double value);
	
	boolean withdrawMoney(Player player, double value);
	
	boolean addMoney(Player player, double value);
	
	double getMoney(Player player) ;
		
	double clanBalance(UUID clanUUID);
	
	boolean hasClanBank(UUID clanUUID, Double value);

	boolean addClanBank(UUID clanUUID, Double value, Player sender);

	boolean withdrawClanBank(UUID clanUUID, Double value, Player sender);

	boolean setClanBank(UUID clanUUID, Double balance, Player sender);

	String clanBalanceFormated(UUID clanUUID) ;
	
	Double clanBankLimit(UUID clanUUID);
	
}
