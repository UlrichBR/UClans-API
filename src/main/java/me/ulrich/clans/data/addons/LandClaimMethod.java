package me.ulrich.clans.data.addons;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;

public class LandClaimMethod {

	private UUID uuid;
	private Long start;
	private Location loc1;
	private Location loc2;
	private Player player;
	private BlockData data1;
	private BlockData data2;
	private List<LandBoxData> box;
	private byte legacy_data;
	private byte legacy_data2;
	private Material material1;
	private Material material2;

	public LandClaimMethod(UUID uuid, Long start, Location loc1, BlockData data1, byte legacy_data, Material material1, Location loc2, BlockData data2, byte legacy_data2, Material material2, Player player, List<LandBoxData> box) {
		this.setUuid(uuid);
		this.setStart(start);
		this.setLoc1(loc1);
		this.setData1(data1);
		this.setLegacy_data(legacy_data);
		this.setMaterial1(material1);
		this.setLoc2(loc2);
		this.setData2(data2);
		this.setLegacy_data2(legacy_data2);
		this.setMaterial2(material2);
		this.setPlayer(player);
		this.setBox(box);
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public Long getStart() {
		return start;
	}

	public void setStart(Long start) {
		this.start = start;
	}

	public Location getLoc1() {
		return loc1;
	}

	public void setLoc1(Location loc1) {
		this.loc1 = loc1;
	}

	public Location getLoc2() {
		return loc2;
	}

	public void setLoc2(Location loc2) {
		this.loc2 = loc2;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public BlockData getData1() {
		return data1;
	}

	public void setData1(BlockData data1) {
		this.data1 = data1;
	}

	public BlockData getData2() {
		return data2;
	}

	public void setData2(BlockData data2) {
		this.data2 = data2;
	}

	public List<LandBoxData> getBox() {
		return box;
	}

	public void setBox(List<LandBoxData> box) {
		this.box = box;
	}

	public byte getLegacy_data() {
		return legacy_data;
	}

	public void setLegacy_data(byte legacy_data) {
		this.legacy_data = legacy_data;
	}

	public byte getLegacy_data2() {
		return legacy_data2;
	}

	public void setLegacy_data2(byte legacy_data2) {
		this.legacy_data2 = legacy_data2;
	}

	public Material getMaterial1() {
		return material1;
	}

	public void setMaterial1(Material material1) {
		this.material1 = material1;
	}

	public Material getMaterial2() {
		return material2;
	}

	public void setMaterial2(Material material2) {
		this.material2 = material2;
	}

}
