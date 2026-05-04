package me.ulrich.clans.data;

import java.util.List;
import java.util.UUID;

public class CustomModerationData {

	private String name;
	private List<String> permissions;
	private GuiItemsData icon;
	private UUID owner;

	public CustomModerationData(UUID owner, String name, List<String> permissions, GuiItemsData icon) {
		this.setName(name);
		this.setPermissions(permissions);
		this.setIcon(icon);
		this.setOwner(owner);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	public GuiItemsData getIcon() {
		return icon;
	}

	public void setIcon(GuiItemsData icon) {
		this.icon = icon;
	}

	public UUID getOwner() {
		return owner;
	}

	public void setOwner(UUID owner) {
		this.owner = owner;
	}
}
