package me.ulrich.clans.data.addons;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;

public class NexusLandData {

	private UUID uuid;
	private UUID clanUUID;
	private String name;
	private NexusStatsData stats;
	private List<UUID> bannedPlayers;
	private NexusSettingsData landSettings;
	private List<NexusTerrainData> terrains;
	private List<UUID> trustedPlayers;
	private Location home;
	private Long creationDate;
	private Optional<NexusData> nexus;

	public NexusLandData(UUID uuid, UUID clanUUID, String name, List<UUID> bannedPlayers, NexusSettingsData landSettings, NexusStatsData stats, List<NexusTerrainData> terrains, List<UUID> trustedPlayers, Location home, Long creationDate, Optional<NexusData> nexus) {
		this.setUuid(uuid);
		this.setClanUUID(clanUUID);
		this.setName(name);
		this.setBannedPlayers(bannedPlayers);
		this.setLandSettings(landSettings);
		this.setStats(stats);
		this.setTerrains(terrains);
		this.setTrustedPlayers(trustedPlayers);
		this.setHome(home);
		this.setCreationDate(creationDate);
		this.setNexus(nexus);
	

	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getClanUUID() {
		return clanUUID;
	}

	public void setClanUUID(UUID clanUUID) {
		this.clanUUID = clanUUID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NexusStatsData getStats() {
		return stats;
	}

	public void setStats(NexusStatsData stats) {
		this.stats = stats;
	}

	public List<UUID> getBannedPlayers() {
		return bannedPlayers;
	}

	public void setBannedPlayers(List<UUID> bannedPlayers) {
		this.bannedPlayers = bannedPlayers;
	}

	public NexusSettingsData getLandSettings() {
		return landSettings;
	}

	public void setLandSettings(NexusSettingsData landSettings) {
		this.landSettings = landSettings;
	}

	public List<NexusTerrainData> getTerrains() {
		return terrains;
	}

	public void setTerrains(List<NexusTerrainData> terrains) {
		this.terrains = terrains;
	}

	public List<UUID> getTrustedPlayers() {
		return trustedPlayers;
	}

	public void setTrustedPlayers(List<UUID> trustedPlayers) {
		this.trustedPlayers = trustedPlayers;
	}

	public Location getHome() {
		return home;
	}

	public void setHome(Location home) {
		this.home = home;
	}

	public Long getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Long creationDate) {
		this.creationDate = creationDate;
	}

	public Optional<NexusData> getNexus() {
		return nexus;
	}

	public void setNexus(Optional<NexusData> nexus) {
		this.nexus = nexus;
	}


}
