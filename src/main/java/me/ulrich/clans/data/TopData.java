package me.ulrich.clans.data;

import java.util.UUID;

public class TopData {

	private UUID uuid;
	private Float value;

	public TopData(UUID uuid, Float value) {
		this.setUuid(uuid);
		this.setValue(value);	
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}
}
