package me.ulrich.clans.data.addons;

import java.util.UUID;

import org.bukkit.entity.Player;

public class WarInvite {

	private UUID clanSender;
	private UUID clanReceiver;
	private Long expires;
	private String arena;
	private int max;
	private Player player;
	private String kit;

	public WarInvite(UUID clanSender, UUID clanReceiver, Long expires, String arena, int max, Player player, String kit) {
		this.setClanSender(clanSender);
		this.setClanReceiver(clanReceiver);
		this.setExpires(expires);
		this.setArena(arena);
		this.setMax(max);
		this.setPlayer(player);
		this.setKit(kit);
	}

	public UUID getClanSender() {
		return clanSender;
	}

	public void setClanSender(UUID clanSender) {
		this.clanSender = clanSender;
	}

	public UUID getClanReceiver() {
		return clanReceiver;
	}

	public void setClanReceiver(UUID clanReceiver) {
		this.clanReceiver = clanReceiver;
	}

	public Long getExpires() {
		return expires;
	}

	public void setExpires(Long expires) {
		this.expires = expires;
	}

	public String getArena() {
		return arena;
	}

	public void setArena(String arena) {
		this.arena = arena;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getKit() {
		return kit;
	}

	public void setKit(String kit) {
		this.kit = kit;
	}
}
