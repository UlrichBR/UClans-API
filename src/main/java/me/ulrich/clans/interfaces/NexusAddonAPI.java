package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.addons.AddonEnum.NexusSettings;
import me.ulrich.clans.data.addons.AddonEnum.NexusVerifyEvent;
import me.ulrich.clans.data.addons.NexusLandData;
import me.ulrich.clans.data.addons.NexusPowerData;
import me.ulrich.clans.data.addons.NexusStatsData;
import me.ulrich.clans.data.addons.NexusTerrainData;

public interface NexusAddonAPI {

	void SaveNexus(NexusLandData land);

	void DeleteNexus(UUID landUUID);

	void DeleteTerrain(UUID landUUID, UUID terrainUUID);

	void LoadAllNexus();

	boolean isLand(Location loc);
	
	boolean isLand(Chunk chunk);

	Optional<NexusLandData> getLand(Location loc);

	Optional<NexusLandData> getLand(Chunk chunk);

	Optional<NexusLandData> getLand(UUID landUUID);

	Optional<NexusLandData> getClanLand(UUID clanUUID);

	List<NexusTerrainData> getAllClanTerrains(UUID clanUUID);

	List<Chunk> getAllClanChunks(UUID clanUUID);
	
	Optional<ClanData> getLandClan(Location loc);

	Optional<ClanData> getLandClan(Chunk chunk);

	Optional<ClanData> getLandClan(UUID landUUID);

	boolean isBanned(Player player, Chunk chunk);

	boolean isLandMember(UUID playerUUID, UUID landUUID);

	boolean canBuildLand(Player player, Location loc);

	boolean terrainHasNexus(Location loc);

	boolean terrainHasNexus(Chunk chunk);

	boolean terrainHasNexus(UUID landUUID);

	Optional<NexusTerrainData> getTerrainNexus(Location loc);

	Optional<NexusTerrainData> getTerrainNexus(Chunk chunk);

	Optional<NexusTerrainData> getTerrainNexus(UUID landUUID);

	boolean changeEntityLife(UUID landUUID, double life);

	boolean addNexusEntity(UUID landUUID, UUID terrain, int entityID);

	boolean isNexusEntity(int entityID);

	Optional<NexusLandData> getNexusEntity(int entityID);

	boolean updateNexusEntity(UUID landUUID);

	boolean hasBuildPermission(UUID playerUUID);

	boolean hasBuildPermission(Player player);

	boolean changeLandHome(UUID landUUID, Location loc);

	boolean changeLandName(UUID landUUID, String name);

	boolean addLandBannedPlayer(UUID landUUID, UUID bannedUUID);

	boolean removeLandBannedPlayer(UUID landUUID, UUID bannedUUID);

	boolean addLandTrustedPlayer(UUID landUUID, UUID trustedUUID);

	boolean removeLandTrustedPlayer(UUID landUUID, UUID bannedUUID);

	boolean changeLandStats(UUID landUUID, NexusStatsData stats);

	boolean changeLandSettings(UUID landUUID, Optional<NexusSettings> key, boolean value);

	///////////////////////////////////////////////// CLAIM / UNCLAIM /////////////////////////////////////////////

	boolean unclaimClanLand(UUID player, UUID clanID);

	boolean unclaimChunkTerrain(Player player, Location loc);

	boolean checkLocationIsDisabled(Location loc);

	Optional<Chunk> checkColision(Location loc, Optional<UUID> clanUUID);

	Optional<NexusLandData> claimNewChunk(Player player, Location loc);

	Optional<NexusLandData> createNewLand(Player player, Location loc);

	Optional<NexusPowerData> getLandPower(UUID landUUID);

	///////////////////////////////// CLAIM - UNCLAIM ////////////////////////////////////////////////////////

	int clanLandLimit(UUID clanUUID);

	void teleportDelay(Player player, Location new_location, boolean checkcooldown);

	String parseText(UUID player, String text);

	boolean verify(Player attacker, Location location, NexusVerifyEvent verifyEvent);

	ConcurrentHashMap<UUID, NexusLandData> getLands();
	
}
