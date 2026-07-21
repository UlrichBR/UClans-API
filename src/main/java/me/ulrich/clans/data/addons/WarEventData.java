package me.ulrich.clans.data.addons;

import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;

public class WarEventData {

	private UUID clanId1;
	private UUID clanId2;
	private List<Player> clanJoined1;
	private List<Player> clanJoined2;
	private int max;
	private String arena;
	private String kit;

	public WarEventData(UUID clanSender, UUID clanReceiver, List<Player> clanJoined1, List<Player> clanJoined2, int max, String arena, String kit) {
		this.setClanId1(clanSender);
		this.setClanId2(clanReceiver);
		this.setClanJoined1(clanJoined1);
		this.setClanJoined2(clanJoined2);
		this.setMax(max);
		this.setArena(arena);
		this.setKit(kit);
	}

	public UUID getClanId1() {
		return clanId1;
	}

	public void setClanId1(UUID clanId1) {
		this.clanId1 = clanId1;
	}

	public UUID getClanId2() {
		return clanId2;
	}

	public void setClanId2(UUID clanId2) {
		this.clanId2 = clanId2;
	}

	public List<Player> getClanJoined1() {
		return clanJoined1;
	}

	public void setClanJoined1(List<Player> clanJoined1) {
		this.clanJoined1 = clanJoined1;
	}

	public List<Player> getClanJoined2() {
		return clanJoined2;
	}

	public void setClanJoined2(List<Player> clanJoined2) {
		this.clanJoined2 = clanJoined2;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public String getArena() {
		return arena;
	}

	public void setArena(String arena) {
		this.arena = arena;
	}

	public String getKit() {
		return kit;
	}

	public void setKit(String kit) {
		this.kit = kit;
	}
}
