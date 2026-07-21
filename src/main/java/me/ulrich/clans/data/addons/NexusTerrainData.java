package me.ulrich.clans.data.addons;

import java.util.UUID;

import org.bukkit.Chunk;
import org.bukkit.World;

public class NexusTerrainData {

	private Chunk chunk;
	private World world;
	private UUID landUUID;
	private UUID terrainUUID;

	public NexusTerrainData(UUID terrainUUID, UUID landUUID, World world, Chunk chunk) {
		this.setTerrainUUID(terrainUUID);
		this.setLandUUID(landUUID);
		this.setWorld(world);
		this.setChunk(chunk);
	}

	public Chunk getChunk() {
		return chunk;
	}

	public void setChunk(Chunk chunk) {
		this.chunk = chunk;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public UUID getLandUUID() {
		return landUUID;
	}

	public void setLandUUID(UUID landUUID) {
		this.landUUID = landUUID;
	}

	public UUID getTerrainUUID() {
		return terrainUUID;
	}

	public void setTerrainUUID(UUID terrainUUID) {
		this.terrainUUID = terrainUUID;
	}

}
