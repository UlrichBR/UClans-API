package me.ulrich.clans.data.addons;

import org.bukkit.Material;

public class WarKitData {

	private String name;
	private String desc;
	private String serialized;
	private long creationDate;
	private Material icon;

	public WarKitData(String name, String desc, String serialized, long creationDate, Material icon) {
		this.setName(name);
		this.setDesc(desc);
		this.setSerialized(serialized);
		this.setCreationDate(creationDate);
		this.setIcon(icon);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSerialized() {
		return serialized;
	}

	public void setSerialized(String serialized) {
		this.serialized = serialized;
	}

	public long getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(long creationDate) {
		this.creationDate = creationDate;
	}

	public Material getIcon() {
		return icon;
	}

	public void setIcon(Material icon) {
		this.icon = icon;
	}
}
