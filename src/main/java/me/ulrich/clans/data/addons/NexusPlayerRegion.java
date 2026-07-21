package me.ulrich.clans.data.addons;

import java.util.Optional;
import java.util.UUID;

public class NexusPlayerRegion {

	private UUID player;
	private Optional<UUID> region;
	private long enter;

	public NexusPlayerRegion(UUID player, Optional<UUID> region, long enter) {
		this.setPlayer(player);
		this.setRegion(region);
		this.setEnter(enter);
	}

	public UUID getPlayer() {
		return player;
	}

	public void setPlayer(UUID player) {
		this.player = player;
	}

	public Optional<UUID> getRegion() {
		return region;
	}

	public void setRegion(Optional<UUID> region) {
		this.region = region;
	}

	public long getEnter() {
		return enter;
	}

	public void setEnter(long enter) {
		this.enter = enter;
	}
}
