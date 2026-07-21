package me.ulrich.clans.data.addons;

import org.bukkit.Location;
import org.bukkit.block.BlockFace;

import me.ulrich.clans.data.ClanEnum.PlaceholderTop;
import me.ulrich.clans.data.addons.AddonEnum.LookType;

public class LeaderboardData {

	private String id;
	private LookType lookType;
	private PlaceholderTop placeholderTop;
	private int num;
	private Location location;
	private BlockFace face;

	public LeaderboardData(String id, Location location, LookType lookType, PlaceholderTop placeholderTop, int num, BlockFace face) {
		this.setId(id);
		this.setLookType(lookType);
		this.setPlaceholderTop(placeholderTop);
		this.setNum(num);
		this.setLocation(location);
		this.setFace(face);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LookType getLookType() {
		return lookType;
	}

	public void setLookType(LookType lookType) {
		this.lookType = lookType;
	}

	public PlaceholderTop getPlaceholderTop() {
		return placeholderTop;
	}

	public void setPlaceholderTop(PlaceholderTop placeholderTop) {
		this.placeholderTop = placeholderTop;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public BlockFace getFace() {
		return face;
	}

	public void setFace(BlockFace face) {
		this.face = face;
	}
}
