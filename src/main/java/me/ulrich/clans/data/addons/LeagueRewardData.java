package me.ulrich.clans.data.addons;

import java.util.Optional;

import org.bukkit.inventory.ItemStack;

public class LeagueRewardData {

	private ItemStack item;
	private Optional<String> command;

	public LeagueRewardData(ItemStack item, Optional<String> command) {
		this.setItem(item);
		this.setCommand(command);
	}

	public ItemStack getItem() {
		return item;
	}

	public void setItem(ItemStack item) {
		this.item = item;
	}

	public Optional<String> getCommand() {
		return command;
	}

	public void setCommand(Optional<String> command) {
		this.command = command;
	}
}
