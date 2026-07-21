package me.ulrich.clans.data.addons;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;

public class LandBoxData {

	private Location location;
	private BlockData data;
	private Material material;
	private byte data_legacy;

	public LandBoxData(Location location, BlockData data, Material material, byte data_legacy) {
		this.setLocation(location);
		this.setData(data);
		this.setMaterial(material);
		this.setData_legacy(data_legacy);
		
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public BlockData getData() {
		return data;
	}

	public void setData(BlockData data) {
		this.data = data;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public byte getData_legacy() {
		return data_legacy;
	}

	public void setData_legacy(byte data_legacy) {
		this.data_legacy = data_legacy;
	}
}
