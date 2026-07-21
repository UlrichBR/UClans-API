package me.ulrich.clans.data.addons;

import org.bukkit.entity.Player;

public class NexusPlayerMapData {

	private Player player;
	private long time;

	public NexusPlayerMapData(Player player, long time) {
		this.setPlayer(player);
		this.setTime(time);
	}



	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}



	public Player getPlayer() {
		return player;
	}



	public void setPlayer(Player player) {
		this.player = player;
	}
}
