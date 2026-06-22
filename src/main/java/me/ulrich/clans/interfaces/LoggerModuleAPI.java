package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Material;

import me.ulrich.clans.data.ClanEnum.LoggerTime;
import me.ulrich.clans.data.LoggerData;

public interface LoggerModuleAPI {

	public String parseText(UUID player, String text);
	
	public void SaveLoggerData(LoggerData log);

	public void DeleteLoggerData(LoggerData log);

	public void ReloadLoggerData(UUID logID);
	
	public void ClearLoggerData(UUID clanId);

	public void LoadAllLoggerData();

	public boolean hasClanLogger(UUID clanUUID);
	
	public List<LoggerData> getClanLogger(UUID clanUUID);
	
	public List<LoggerData> getClanLoggerTimed(UUID clanUUID, LoggerTime time);
	
	public List<LoggerData> getPluginLogger(UUID clanUUID, String plugin);
	
	public Optional<LoggerData> getPluginLogger(UUID clanUUID, UUID loggerUUID);
	
	public boolean removeClanLogger(UUID clanUUID, UUID loggerUUID);
	
	public boolean removeClanPluginLogger(UUID clanUUID, String plugin);
	
	public boolean clearClanLogger(UUID clanUUID);
	
	public boolean addClanLogger(UUID clanUUID, String text, String plugin, Material material);
	
	public boolean compareEvent(LoggerTime time, long eventdate);


	public ConcurrentHashMap<UUID, List<LoggerData>> getLoggerData();
	
}
