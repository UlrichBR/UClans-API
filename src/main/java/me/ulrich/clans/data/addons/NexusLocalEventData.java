package me.ulrich.clans.data.addons;

import org.bukkit.Material;
import org.bukkit.block.data.BlockData;

public class NexusLocalEventData {

	private Material material;
	private BlockData blockData;
	private Byte legacyData;

	public NexusLocalEventData(Material material, BlockData blockData, Byte legacyData) {
		this.setMaterial(material);
		this.setBlockData(blockData);
		this.setLegacyData(legacyData);
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BlockData getBlockData() {
		return blockData;
	}

	public void setBlockData(BlockData blockData) {
		this.blockData = blockData;
	}

	public Byte getLegacyData() {
		return legacyData;
	}

	public void setLegacyData(Byte legacyData) {
		this.legacyData = legacyData;
	}
}
