package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.EventState;
import me.ulrich.clans.data.ClanEnum.WarReturn;
import me.ulrich.clans.data.addons.AddonEnum.ArenaMode;
import me.ulrich.clans.data.addons.AddonEnum.EventPoint;
import me.ulrich.clans.data.addons.WarArenaData;
import me.ulrich.clans.data.addons.WarEventData;
import me.ulrich.clans.data.addons.WarInvite;
import me.ulrich.clans.data.addons.WarKitData;

public interface WarAddonAPI {

	boolean hasClanInviter(UUID clanUUID);
	
	WarInvite getClanInvite(UUID clanid);
	
	boolean removeWarInvite(UUID clanid);

	WarReturn warSend(UUID senderid1, UUID receiverid2, String arena, int max, Player player2, WarKitData kit);

	String parseText(UUID player, String text);

	HashMap<ClanData, WarInvite> getWarinvites();
	
	boolean arenaExists(String arena);

	WarArenaData getArena(String arena);

	WarArenaData getArena(Location loc);

	WarArenaData getInGameArena(Location loc);

	boolean isArenaEnabled(String arena);

	boolean createArena(String arena, Location leftAction, Location rightAction);

	boolean addArenaPoint(String arena, EventPoint point, Location location);

	boolean toggleArena(String arena);

	boolean startArena(Player sender, String arena, UUID clanReceiver, UUID clanSender, int max, Player player, String kit);

	boolean playerJoinArena(Player player, String arena);

	void playerExitArena(Player player, boolean teleport);

	void exitAllPlayers();

	WarEventData getPlayerArena(Player player);

	WarEventData getPlayerArena(UUID playerUUID);

	String getPlayerEvent(Player player);

	String getClanEvent(UUID id);

	boolean playerIsInWar(Player player);

	boolean playerIsInWar(UUID player);

	boolean clanIsInWar(UUID clanid);

	boolean playerClanIsInWar(Player player);

	boolean changeArenaState(WarArenaData arenaData, EventState state);

	boolean teleportPlayerTo(List<Player> players, String arena, EventPoint point);

	boolean clearPlayer(Player player, WarEventData arenaevent);

	Location getArenaLocal(String arena, EventPoint point);

	HashMap<String, WarEventData> getEvent();

	void loadArenas();

	void loadArena(String arena);

	void saveArena(WarArenaData arenaData);

	boolean descArena(String arena, StringBuilder desc);

	boolean spectatorArena(String arena, Location loc);

	boolean modeArena(String arena, ArenaMode mode);

	boolean iconArena(String arena, Material icon);

	boolean deleteArena(String arena);

	String encodeLocation(Location loc);

	Location decodeLocation(String located);
	
	ItemStack getWand();

	boolean clearWand();

	boolean checkWand();

	boolean isPlayerSpectator(Player player);

	void setPlayerSpectator(Player player, String arenaName);

	void removePlayerSpectator(Player player, boolean teleport);

	void removeAllSpectator();

	void removeArenaSpectators(String arena, boolean teleport);

	HashMap<String, WarArenaData> getArenaData();

	Location getLeftAction();

	Location getRightAction();

	HashMap<Player, String> getSpectator();

	HashMap<Location, Player> getPlacedLocations();






	
}
