package me.ulrich.clans.interfaces;

import java.util.Optional;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.BuyChestResponse;

public interface ChestAddonAPI {

	Optional<String> consultInUse_REAL(UUID clanId);

	BuyChestResponse buyExtra(Player player, UUID clanid);

	int chestCount(ClanData clan, Player player);

	boolean testPutNbt(ItemStack item);

	boolean hasModelData(final ItemStack itemStack, int model);
	
}
