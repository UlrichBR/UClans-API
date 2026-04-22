package me.ulrich.clans.manager.utils;

import java.util.Optional;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.EncodedLocationData;

public class Locals {


	public String encodeChunk(Chunk chunk) {
		return null;
	}

	public Chunk decodeChunk(String chunk) {
		return null;
	}

	public String encodeLocation(Location loc) {
		return null;
	}

	public Location decodeLocation(String located) {
		return null;
	}
	
	public Optional<Location> mountLocal(EncodedLocationData located) {
		return Optional.empty();
	}

	public Optional<EncodedLocationData> decodeLocation(String server, String located) {
		return Optional.empty();
	}

	public final Block getTargetBlock(Player player, int range) {
		return null;
	}

	public String getDirection(Player player) {
		return null;
	}

	public String getDirection(ArmorStand armor) {
		return null;
	}

	public String getInvertedDirection(Player player) {
		return null;
	}

	public String getCardinalDirection(Player player) {
		return null;
	}

	public String getInvertedDirection(ArmorStand as) {
		return null;
	}

	public Location getCircle(Location center, double radius, double angleInRadian) {
		return null;
	}
}