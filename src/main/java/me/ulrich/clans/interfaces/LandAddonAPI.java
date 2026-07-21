package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.PlayerData;
import me.ulrich.clans.data.addons.AddonEnum.ClaimChanges;
import me.ulrich.clans.data.addons.AddonEnum.LandExpandDirection;
import me.ulrich.clans.data.addons.AddonEnum.LandFlags;
import me.ulrich.clans.data.addons.IslandJoinLeaveData;
import me.ulrich.clans.data.addons.LandBoxData;
import me.ulrich.clans.data.addons.LandClaimMethod;
import me.ulrich.clans.data.addons.LandsData;
import me.ulrich.clans.manager.utils.Cuboid;

public interface LandAddonAPI {

	ItemStack getBanner(UUID playerUUID);

	boolean landExists(UUID landUUID);

	Optional<LandsData> getLandData(UUID landUUID);

	void finalizeFakePoints(Player player);

	void putFakeBlock(Player player, Location loc, Material material);

	void removeFakeBlock(Player player, Location loc, LandBoxData data);

	void clearFakeBox(Player player, List<LandBoxData> box);

	void deleteFakes();

	void updateFakePoints(Player player);

	void sendClaimChanges(Player player, ClaimChanges changes);

	List<LandBoxData> getHollowCube(Location corner1, Location corner2);

	List<LandBoxData> getBoxCube(Location corner1, Location corner2);

	List<Location> getHollowCube(Location corner1, Location corner2, double particleDistance);

	List<Location> getHollowCube(Location loc1, Location loc2, boolean top_and_bottom);

	List<Location> getHollowCube2(Location loc1, Location loc2, boolean top_and_bottom);

	void createBox(Player player, Location normalized);

	boolean checkColision(Player player, Optional<Location> loc1, Optional<Location> loc2);

	boolean checkChunkCornersInClaim(Optional<ClaimImplement> pluginimp, List<Chunk> chunks);
	
	boolean checkChunkCornersInClaim(List<Chunk> chunks);

	List<Block> getCubeEdges(Cuboid cuboid);

	boolean checkClose(Player player, Location normalized);

	boolean intersectsCuboid(Cuboid a, Cuboid b);

	boolean checkCurrentSize(Player player, Location loc1, Location loc2);

	boolean expandLand(Player player, LandExpandDirection direction, int num);

	void effectCunk(Cuboid cub, Chunk chunk, Player player, Material material, int time, boolean randomize_stay, boolean randomize_out);

	boolean deleteClanLands(UUID clanID);

	boolean deleteLand(UUID clanUUID, UUID landUUID, Player player);

	Optional<LandsData> createNewClaim(Player player, LandClaimMethod claim);

	Optional<LandsData> getLand(Location location);

	boolean hasPlayerLand(UUID playerUUID);

	List<LandsData> getPlayerLands(UUID playerUUID);

	boolean hasClanLand(UUID clainid);

	List<LandsData> getClanLands(UUID clainid);

	boolean isMemberOfLand(UUID playerUUID, LandsData land);
	
	boolean isTrustOfLand(UUID playerUUID, LandsData land);

	boolean banPlayerLand(PlayerData playerData, LandsData land);

	boolean unbanPlayerLand(PlayerData playerData, LandsData land);

	boolean trustPlayerLand(PlayerData playerData, LandsData land);

	boolean untrustPlayerLand(PlayerData playerData, LandsData land);

	boolean setSpawnLand(LandsData land, Location location);
	
	boolean setFlagLand(LandsData land, LandFlags flag, boolean value);

	boolean setNameLand(LandsData land, String name);

	void teleportDelay(Player player, Location new_location, boolean checkcooldown);

	String parseText(UUID landUUID, String text);

	int clanLandLimit(ClanData clan);

	HashMap<UUID, LandClaimMethod> getClaim();

	void setClaim(HashMap<UUID, LandClaimMethod> claim);

	HashMap<UUID, LandsData> getLandsData();

	HashMap<Player, IslandJoinLeaveData> getPlayerRegion();

	
}
