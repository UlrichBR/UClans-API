package me.ulrich.clans.data.addons;



import org.bukkit.entity.Player;

import me.ulrich.clans.data.addons.AddonEnum.NexusDataType;


public class NexusChatData {

	private String key;
	private Object value;
	private Player player;
	private NexusDataType dataType;
	private long expires;
	private boolean reopen;

	public NexusChatData(String key, Object value, Player player, NexusDataType dataType, long expires, boolean reopen) {
		this.setKey(key);
		this.setValue(value);
		this.setPlayer(player);
		this.setDataType(dataType);
		this.setExpires(expires);
		this.setReopen(reopen);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}


	public NexusDataType getDataType() {
		return dataType;
	}

	public void setDataType(NexusDataType dataType) {
		this.dataType = dataType;
	}

	public long getExpires() {
		return expires;
	}

	public void setExpires(long expires) {
		this.expires = expires;
	}

	public boolean isReopen() {
		return reopen;
	}

	public void setReopen(boolean reopen) {
		this.reopen = reopen;
	}
}
