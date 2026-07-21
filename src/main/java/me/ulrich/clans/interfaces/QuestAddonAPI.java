package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanEnum.TranslatableKey;
import me.ulrich.clans.data.addons.AddonEnum.QuestMissionType;
import me.ulrich.clans.data.addons.AddonEnum.QuestType;
import me.ulrich.clans.data.addons.AddonEnum.QuestWarn;
import me.ulrich.clans.data.addons.ClanQuestData;
import me.ulrich.clans.data.addons.QuestData;

public interface QuestAddonAPI {
	
	void saveAllQueue();

	Optional<UUID> getPlayerMode(UUID playerUUID);

	boolean removePlayerCourse(Player player);

	boolean removePlayerCourse(UUID playerUUID);

	boolean addPlayerCourse(Player player, QuestData value);

	boolean islandInQuest(UUID uuid);

	boolean islandInQuest(UUID uuid, String quest);

	Optional<ClanQuestData> getIslandInQuest(UUID uuid, String quest);

	boolean playerIsInQUest(Player player, String quest);

	QuestMissionType getPlayerQuestType(Player player);

	QuestMissionType getPlayerQuestType(UUID playerUuid);

	Optional<ClanQuestData> getPlayerQuest(Player player);

	Optional<ClanQuestData> getPlayerQuest(UUID player);

	Optional<ClanQuestData> getPlayerQuest(UUID player, String questName);

	Optional<ClanQuestData> isPlayerFinishedQuest(UUID player, String questName);

	Optional<ClanQuestData> getPlayerClanQuest(UUID player, String questname);

	//////////////////////////////////////// ISLAND QUESTS

	void finishQuest(Player player, String quest);

	void updatePlayerQuest(Player player, String quest, int newEarned);
	
	boolean questExists(String name);

	boolean questHasType(String name, QuestType type);

	boolean questHasTypeWhitelist(String name, QuestType type, String whitelist);

	QuestData getQuestByName(String name);

	boolean checkWhitelistItem(String whitelist, QuestType type);

	void sendWarning(QuestWarn warn, List<Player> players, QuestData questData, int amount);

	String parseText(UUID playerUUID, String text);

	HashMap<Player, Location> getLocFly();

	////////////////////////////////////////  ALL QUESTS

	void loadAllQuests();

	void loadQuest(String quest);

	String translateOptional(QuestType type, String object);

	Optional<TranslatableKey> findTranslateType(QuestType type);

	HashMap<String, QuestData> getQuestData();

	HashMap<UUID, List<ClanQuestData>> getIslandQuest();

	HashMap<UUID, String> getRemoveDaily();

	HashMap<QuestType, List<String>> getQuestFollow();

	HashMap<Player, List<Location>> getQuestFollower();

	HashMap<Player, Location> getLocWalk();

	HashMap<Player, ClanQuestData> getQuestToSave();
	
}
