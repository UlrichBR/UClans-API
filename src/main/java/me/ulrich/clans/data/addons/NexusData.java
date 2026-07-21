package me.ulrich.clans.data.addons;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;

public class NexusData {


	private UUID terrainUUID;
	private Location location;
	private Integer structureId;
	private List<Location> structureBlocks;
	private double currentLife;
	private long shield;
	private long lastDamage;

	public NexusData(UUID terrainUUID, Location location, int structureId, List<Location> structureBlocks, double currentLife, long shield, long lastDamage) {
		
		this.setTerrainUUID(terrainUUID);
		this.setLocation(location);
		this.setStructureId(structureId);
		this.setStructureBlocks(structureBlocks);
		this.setCurrentLife(currentLife);
		this.setShield(shield);
		this.setLastDamage(lastDamage);


	}

	

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Integer getStructureId() {
		return structureId;
	}

	public void setStructureId(Integer structureId) {
		this.structureId = structureId;
	}

	public List<Location> getStructureBlocks() {
		return structureBlocks;
	}

	public void setStructureBlocks(List<Location> structureBlocks) {
		this.structureBlocks = structureBlocks;
	}

	public double getCurrentLife() {
		return currentLife;
	}

	public void setCurrentLife(double currentLife) {
		this.currentLife = currentLife;
	}

	public long getShield() {
		return shield;
	}

	public void setShield(long shield) {
		this.shield = shield;
	}



	public UUID getTerrainUUID() {
		return terrainUUID;
	}



	public void setTerrainUUID(UUID terrainUUID) {
		this.terrainUUID = terrainUUID;
	}



	public long getLastDamage() {
		return lastDamage;
	}



	public void setLastDamage(long lastDamage) {
		this.lastDamage = lastDamage;
	}

}
