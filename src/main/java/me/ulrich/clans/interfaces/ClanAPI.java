package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.PlaceholderTop;
import me.ulrich.clans.data.ClanEnum.SettingsFlagsAccept;
import me.ulrich.clans.data.ClanEnum.SettingsType;
import me.ulrich.clans.data.EncodedLocationData;
import me.ulrich.clans.data.ModerationData;

public interface ClanAPI {

	void saveClanData(ClanData clan);

	void deleteClanData(UUID clanUUID);

	void reloadClanData(UUID clanUUID);

	void loadAllClanData();

	ConcurrentHashMap<UUID, ClanData> getClanData();

	Optional<UUID> getClanByTag(String tag);

	Optional<ClanData> getClanDataByTag(String tag);

	boolean tagExists(String tag);

	boolean clanExists(UUID clanUUID);

	Optional<ClanData> getClan(UUID clanUUID);

	boolean verifyClan(UUID clanUUID);

	void clanMessageSend(UUID id, String text);

	boolean promotePlayer(UUID id, UUID promoted, Optional<ModerationData> mod);

	boolean demotePlayer(UUID id, UUID demoted, Optional<ModerationData> mod);

	boolean banPlayer(UUID clanUUID, UUID playerUUID, UUID sender);

	boolean unbanPlayer(UUID clanUUID, UUID playerUUID);

	boolean kickPlayer(UUID clanUUID, UUID playerUUID, UUID sender);

	boolean changeLeader(UUID clanUUID, Player player);

	boolean changeLeader(UUID clanUUID, UUID playerUUID);

	boolean modTag(ClanData clan, String tag, Player sender);

	boolean modDesc(ClanData clan, String desc, Player sender);

	boolean changeSetting(ClanData clan, SettingsType type, SettingsFlagsAccept value);

	boolean toggleFF(ClanData clan);

	boolean deleteClan(UUID uuid);

	boolean deletePlayerClan(UUID player);

	Optional<ClanData> createNewClan(Player player, String tag, String desc, long date);
	
	Optional<ClanData> createNewClan(UUID player, String tag, String desc, long date);

	void teleportDelay(Player player, Optional<EncodedLocationData> encodedLocation, boolean checkcooldown);

	List<ClanData> getAllClansData();

	List<String> getAllClansTags();

	List<UUID> getAllClansUUID();

	List<ClanData> getTopClansData(PlaceholderTop top);

	HashMap<UUID, Float> getTopClans(PlaceholderTop top);

	void sort(List<ClanData> clans, PlaceholderTop top);

	double getClanKDR(UUID clanUUID);

	boolean resetClanKDR(ClanData clan);

	boolean resetClanKDR(UUID clanUUID);

	boolean addExtraChest(UUID clanUUID, int amount, CommandSender sender);

	boolean addSlot(String tag, int amount, CommandSender sender);

	boolean addSlot(UUID clanUUID, int amount, CommandSender sender);

	boolean removeSlot(String tag, int amount, CommandSender sender);

	boolean removeSlot(UUID clanUUID, int amount, CommandSender sender);

	boolean setSlot(String tag, int amount, CommandSender sender);

	boolean setSlot(UUID clanUUID, int amount, CommandSender sender);

	boolean canMemberJoin(UUID clanUUID);

	boolean hasClanModerationOnline(UUID clanUUID);

	String parseText(UUID player, String text);

	List<ClanData> getRivalries(UUID clanUUID);

	List<ClanData> getAlliances(UUID clanUUID);

	boolean tryChangeModtag(Player player, String tag);

	boolean tryChangeDesc(Player player, String desc);

	boolean tryCreateClan(Player player, String tag);

	boolean hasAddonEnabled(String name);

	boolean hasExtensionEnabled(String name);

	boolean toggleGlobalFF(CommandSender player);

	boolean isGlobalFF();

	boolean setJsonMeta(UUID clanUUID, String jsonMetaString);

	Optional<String> getJsonMeta(UUID clanUUID);





}