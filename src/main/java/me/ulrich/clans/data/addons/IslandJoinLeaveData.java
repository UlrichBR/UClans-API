package me.ulrich.clans.data.addons;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.addons.AddonEnum.MovementWay;

public class IslandJoinLeaveData {
	private Player player;
	private MovementWay movementWay;
	private Location to;
	private UUID islandUUID;
	private UUID clanUUID;

//final Player player, final MovementWay movement, Location to, UUID island uuid
	

	public IslandJoinLeaveData(Player player, MovementWay movementWay, Location to, UUID islandUUID, UUID clanUUID) {
		this.setPlayer(player);
		this.setMovementWay(movementWay);
		this.setTo(to);
		this.setIslandUUID(islandUUID);
		this.setClanUUID(clanUUID);
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public MovementWay getMovementWay() {
		return movementWay;
	}

	public void setMovementWay(MovementWay movementWay) {
		this.movementWay = movementWay;
	}

	public Location getTo() {
		return to;
	}

	public void setTo(Location to) {
		this.to = to;
	}

	public UUID getIslandUUID() {
		return islandUUID;
	}

	public void setIslandUUID(UUID islandUUID) {
		this.islandUUID = islandUUID;
	}

	public UUID getClanUUID() {
		return clanUUID;
	}

	public void setClanUUID(UUID clanUUID) {
		this.clanUUID = clanUUID;
	}

}
