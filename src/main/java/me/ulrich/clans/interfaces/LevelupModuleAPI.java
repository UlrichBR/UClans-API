package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.command.CommandSender;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.ClanActions;
import me.ulrich.clans.data.ClanEnum.UnlockerTypes;
import me.ulrich.clans.data.PatentData;
import me.ulrich.clans.data.RequerimentData;
import me.ulrich.clans.data.RequerimentData_Return;

public interface LevelupModuleAPI {

	public String parseText(UUID player, String text);
	
	public void LoadRequeriments();

	public boolean hasRequeriment(int level);

	public Optional<RequerimentData> getRequeriment(int level);

	public boolean isRequerimentSurprise(int req);

	public Optional<Integer> clanCurrentLevel(UUID clanUUID);

	public Optional<Integer> clanNextLevel(UUID clanUUID);

	public boolean clanInLevelSurprise(UUID clanUUID);

	public boolean clanIsLevelPassed(UUID clanUUID, int level);

	public Optional<Integer> clanMaxLevelReached(UUID clanUUID);

	public List<RequerimentData_Return> getClanRequeriments(UUID clanUUID);

	public List<RequerimentData_Return> getPlayerClanRequeriments(UUID playerUUID);

	public boolean hasPlayerClanRequeriments(UUID playerUUID);

	public boolean hasClanRequeriments(UUID clanUUID);

	//NEW METHOD
	public boolean checkUpgradeLevel(UUID senderUUID);

	//NEW METHOD
	public boolean checkDowngradeLevel(UUID clanUUID);

	///////////////////////////////////// PATENTS /////////////////////////////////////

	public void LoadAllPatents();

	public boolean patentExists(String patentID);

	public Optional<PatentData> getPatent(String patentID);

	public Optional<PatentData> getFirstPatent();

	public Optional<PatentData> getLevelCurrentPatent(int level);

	public Optional<PatentData> getClanCurrentPatent(UUID clanUUID);

	public double calcXpForLevel(int level);

	public int calculateFullTargetXp(int level);

	public int calculateLevel(double xp);

	public int getPointsNextLevel(ClanData clanData);

	public void check_actions(ClanActions action, UUID clanid);

	public boolean addPoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason);

	public boolean removePoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason);

	public boolean setPoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason);

	public int slotsCount(ClanData clan);

	public boolean hasUnlocked(UUID clanUUID, UnlockerTypes type);

	public int getUnlocked(UnlockerTypes type);

	public ConcurrentHashMap<String, PatentData> getPatentData();

	public ConcurrentHashMap<Integer, RequerimentData> getRequerimentData();


}
