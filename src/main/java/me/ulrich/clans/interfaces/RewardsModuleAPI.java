package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Material;

import me.ulrich.clans.data.RewardsData;

public interface RewardsModuleAPI {
	
	public String parseText(UUID player, String text);

	public void SaveRewardsData(RewardsData reward);
	
	public void DeleteRewardsData(UUID rewardUUID);
	
	public void ReloadRewardsData(UUID rewardUUID);
	
	public void ClearRewardsData(UUID clanUUID);

	public void LoadAllRewardsData();
	
	public boolean hasClanRewards(UUID clanUUID);
	
	public List<RewardsData> getClanRewards(UUID clanUUID);
	
	public boolean hasClanCollectedSurprise(UUID clanUUID, int level);
	
	public boolean hasPlayerRewards(UUID playerUUID);
	
	public List<RewardsData> getPlayerRewards(UUID playerUUID);
	
	public boolean playerCollectReward(UUID playerUUID, UUID rewardUUID);
	
	public boolean addClanReward(UUID clanUUID, UUID senderUUID, Optional<String> description, Optional<Material> icon, List<String> rewards, Optional<String> complement);
	
	public ConcurrentHashMap<UUID, RewardsData> getRewardsData();


}
