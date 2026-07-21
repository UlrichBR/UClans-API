package me.ulrich.clans.data.addons;

import org.bukkit.Location;
import org.bukkit.Material;

import me.ulrich.clans.data.ClanEnum.EventState;
import me.ulrich.clans.data.addons.AddonEnum.ArenaMode;

public class WarArenaData {

	private String name;
	private EventState state;
	private boolean enabled;
	private Location spawn2;
	private Location spawn1;
	private Location lobby;
	private Location exit;
	private Location point1;
	private Location point2;
	private Material icon;
	private String desc;
	private Location spectator;
	private ArenaMode mode;

	public WarArenaData(String name, EventState state, boolean enabled ,Location spawn1, Location spawn2, Location lobby, Location exit, Location point1, Location point2, Material icon, String desc, Location spectator, ArenaMode mode) {
		this.setName(name);
		this.setState(state);
		this.setEnabled(enabled);
		this.setSpawn1(spawn1);
		this.setSpawn2(spawn2);
		this.setLobby(lobby);
		this.setExit(exit);
		this.setPoint1(point1);
		this.setPoint2(point2);
		this.setIcon(icon);
		this.setDesc(desc);
		this.setSpectator(spectator);
		this.setMode(mode);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EventState getState() {
		return state;
	}

	public void setState(EventState state) {
		this.state = state;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Location getSpawn2() {
		return spawn2;
	}

	public void setSpawn2(Location spawn2) {
		this.spawn2 = spawn2;
	}

	public Location getSpawn1() {
		return spawn1;
	}

	public void setSpawn1(Location spawn1) {
		this.spawn1 = spawn1;
	}

	public Location getLobby() {
		return lobby;
	}

	public void setLobby(Location lobby) {
		this.lobby = lobby;
	}

	public Location getExit() {
		return exit;
	}

	public void setExit(Location exit) {
		this.exit = exit;
	}

	public Location getPoint1() {
		return point1;
	}

	public void setPoint1(Location point1) {
		this.point1 = point1;
	}

	public Location getPoint2() {
		return point2;
	}

	public void setPoint2(Location point2) {
		this.point2 = point2;
	}

	public Material getIcon() {
		return icon;
	}

	public void setIcon(Material icon) {
		this.icon = icon;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Location getSpectator() {
		return spectator;
	}

	public void setSpectator(Location spectator) {
		this.spectator = spectator;
	}

	public ArenaMode getMode() {
		return mode;
	}

	public void setMode(ArenaMode mode) {
		this.mode = mode;
	}
}
