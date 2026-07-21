package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.data.addons.AddonEnum.FarmAction;
import me.ulrich.clans.data.addons.FarmCoinData;

public interface FarmCoinsAddonAPI {

	boolean isPlaced(Player player, Location e);
	
	void loadCoinList();

	boolean coinExists(String id);

	Optional<FarmCoinData> getCoin(String id);

	void checkReceive(Player player, Location location, FarmAction action, String object);

	Double clanLevelChance(UUID clanUUID, HashMap<Integer, Double> list);

	Double clanRoleChance(String role, HashMap<String, Double> list);
	
	Optional<ItemStack> getCoinItem(FarmCoinData found, int value);

	HashMap<String, FarmCoinData> getCoinData();

	List<Material> getMaterialList();

	HashMap<Player, List<Location>> getBlockFollower();

	
}
