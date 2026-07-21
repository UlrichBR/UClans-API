package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.bukkit.Location;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import me.ulrich.clans.data.ClanEnum.PlaceholderTop;
import me.ulrich.clans.data.addons.AddonEnum.BoardClickType;
import me.ulrich.clans.data.addons.AddonEnum.LookType;
import me.ulrich.clans.data.addons.LeaderboardData;

public interface LeaderboardAddonAPI {

	void saveBoardData(LeaderboardData clan);

	void deleteBoardData(String clanId);

	void reloadClanData(String clanId);

	void loadAllBoardData();

	boolean inEditMode(Player player);

	boolean hasLeaderboard(String id);

	boolean hasLeaderboard(Location location);

	Optional<LeaderboardData> getLeaderboard(String id);

	Optional<LeaderboardData> getLeaderboard(Location location);

	boolean createLeaderboard(Location location, LookType lookType, PlaceholderTop top, int number, BlockFace face) ;

	boolean deleteLeaderboard(Location location);

	boolean deleteLeaderboard(String id);

	void updateBoards(long timer);

	void updateBoard(LeaderboardData data);

	void updateBoardFolia(LeaderboardData data);

	void updateBoardOther(LeaderboardData data);

	BlockFace yawToFace(float yaw);

	//Optional<LeaderboardStandCreator> getCorpseFromArmorstand(ArmorStand armorStand);

	ItemStack getSkinBlock(String texture);

	Location expand(BlockFace dir, Location loc, double amount);

	boolean isCartesian(BlockFace dir);

	void deupdateBoard(LeaderboardData leaderboard);

	void clickAction(Player player, BoardClickType type, Location location);

	Optional<Entity> rayTraceLegacyEntities(Player player, double maxDistance, Predicate<Entity> filter);

	Optional<Entity> rayTraceEntities(Location start, Vector direction, double maxDistance, double raySize, Predicate<Entity> filter);

	HashMap<String, LeaderboardData> getLeaderboardData();

	//List<LeaderboardStandCreator> getCorpse();

	List<Player> getEditMode();



}
