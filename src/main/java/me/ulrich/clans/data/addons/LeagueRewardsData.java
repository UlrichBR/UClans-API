package me.ulrich.clans.data.addons;

import java.util.List;
import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public class LeagueRewardsData {

	private List<String> commands;
	private List<ItemStack> items;
	private List<UUID> collectedBy;


	public LeagueRewardsData(List<String> commands, List<ItemStack> items, List<UUID> collectedBy) {
		this.setCommands(commands);
		this.setItems(items);
		this.setCollectedBy(collectedBy);
	}

	public List<String> getCommands() {
		return commands;
	}

	public void setCommands(List<String> commands) {
		this.commands = commands;
	}

	public List<ItemStack> getItems() {
		return items;
	}

	public void setItems(List<ItemStack> items) {
		this.items = items;
	}

	public List<UUID> getCollectedBy() {
		return collectedBy;
	}

	public void setCollectedBy(List<UUID> collectedBy) {
		this.collectedBy = collectedBy;
	}

	
}
