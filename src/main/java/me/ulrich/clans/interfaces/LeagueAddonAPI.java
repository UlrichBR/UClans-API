package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.data.addons.AddonEnum.LeagueEventAction;
import me.ulrich.clans.data.addons.AddonEnum.LeagueStatus;
import me.ulrich.clans.data.addons.AddonEnum.LeagueTime;
import me.ulrich.clans.data.addons.LeagueData;
import me.ulrich.clans.data.addons.LeaguePointsRecordData;
import me.ulrich.clans.data.addons.LeagueSeasonData;

public interface LeagueAddonAPI {

	void SaveLeagueData(LeagueData log, boolean async);

	void DeleteLeagueData(UUID logID, boolean async);

	void ReloadLeagueData(UUID logID, boolean async);

	void ClearLeagueData(UUID clanId, boolean async);

	void LoadAllLeagueData(boolean async);

	boolean hasClanLeague(UUID clanUUID);

	List<LeagueData> getClanLeague(UUID clanUUID);

	Optional<LeagueData> getLeagueById(UUID id);

	List<LeagueData> getClanLeagueSeason(UUID clanUUID, UUID seasonUUID);

	double getMergedClanPoints(UUID clanUUID, UUID seasonUUID);

	double getMergedClanPointsOLD(UUID clanUUID, UUID seasonUUID);

	Map<UUID, LeaguePointsRecordData> getAllLeagueTimed(UUID seasonUUID);

	HashMap<UUID, Double> getAllLeagueTimedOLD(UUID seasonUUID);

	boolean removeClanLeague(UUID clanUUID, UUID id);
	
	List<LeagueSeasonData> findUnclaimed(UUID playerUUID);

	boolean clearClanLeague(UUID clanUUID);

	boolean addClanLeague(UUID clanUUID, double points, String plugin, LeagueEventAction action);

	boolean compareEvent(LeagueTime time, long eventdate);

	String parseText(UUID player, String identifier);

	ConcurrentHashMap<UUID, List<LeagueData>> getLeagueData();

	// SEASON
	
	public void SaveLeagueSeasonData(LeagueSeasonData log);

	public void DeleteLeagueSeasonData(UUID logID);

	public void ReloadLeagueSeasonData(UUID logID);

	public void LoadAllLeagueSeasonData();

	public boolean hasSeason(String name);

	public boolean hasSeason(UUID id);

	public Optional<LeagueSeasonData> getSeason(String name);

	public Optional<LeagueSeasonData> getSeason(UUID id);

	public List<LeagueSeasonData> findSeasonsPeriod(long date);

	public boolean hasSeasonInDates(long start, long end);

	public Optional<LeagueSeasonData> getSeasonsCurrent(long date);

	public List<LeagueSeasonData> getSeasonsCurrentOrGreater(long date);

	public List<LeagueSeasonData> getSeasonsByStatus(LeagueStatus status);

	public boolean deleteSeason(UUID id);

	public Optional<LeagueSeasonData> createNewSeason(String name, long start, long end);

	public boolean setSeasonIcon(UUID seasonUUID, Material icon);

	public boolean setSeasonStatus(UUID seasonUUID,  LeagueStatus status);

	public boolean setSeasonDesc(UUID seasonUUID,  String desc);

	public boolean setSeasonWinner(UUID seasonUUID,  Optional<UUID> winner);

	public boolean setSeasonStart(UUID seasonUUID, long agora);

	public boolean setSeasonStop(UUID seasonUUID, long agora);

	public boolean addSeasonItem(UUID seasonUUID, ItemStack item);

	public boolean isSeasonCollectedPlayer(UUID seasonUUID, UUID player);

	public boolean addSeasonCollectedPlayer(UUID seasonUUID, UUID player);

	public boolean removeSeasonItem(UUID seasonUUID, int num);

	public boolean addSeasonCommand(UUID seasonUUID, String command);

	public boolean removeSeasonCommand(UUID seasonUUID, int num);

	public void initializeSeason(UUID seasonUUID, long date);

	public void finalizeSeason(UUID seasonUUID, long date);

	public ConcurrentHashMap<UUID, LeagueSeasonData> getLeagueSeasonData();
}
