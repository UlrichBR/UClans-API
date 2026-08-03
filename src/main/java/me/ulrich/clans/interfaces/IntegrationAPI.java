package me.ulrich.clans.interfaces;

import java.util.Optional;
import java.util.UUID;

public interface IntegrationAPI {
 
    void registerAnvilAPI(AnvilModuleAPI api);
    
    void unregisterAnvilAPI(AnvilModuleAPI api);
    
    void registerMultiserverAPI(MultiserverModuleAPI api);
    
    void unregisterMultiserverAPI(MultiserverModuleAPI api);
    
    void registerRewardsAPI(RewardsModuleAPI api);
    
    void unregisterRewardsAPI(RewardsModuleAPI api);
    
    void registerDiscordAPI(DiscordModuleAPI api);
    
    void unregisterDiscordAPI(DiscordModuleAPI api);

    void registerMailAPI(MailModuleAPI api);
    
    void unregisterMailAPI(MailModuleAPI api);
    
    void registerBannerAPI(BannerModuleAPI api);
    
    void unregisterBannerAPI(BannerModuleAPI api);

    void registerRivalAllyAPI(RivalAllyModuleAPI api);

    void unregisterRivalAllyAPI(RivalAllyModuleAPI api);
    
    void registerLoggerAPI(LoggerModuleAPI api);

    void unregisterLoggerAPI(LoggerModuleAPI api);

    void registerLevelupAPI(LevelupModuleAPI api);

    void unregisterLevelupAPI(LevelupModuleAPI api);

    void registerHomeAPI(HomeModuleAPI api);

    void unregisterHomeAPI(HomeModuleAPI api);
    
    String parseModulePlaceholders(UUID player, String identifier);
    
    String parseAddonPlaceholders(UUID player, String identifier);

    Optional<RivalAllyModuleAPI> getRivalAlly();

    Optional<LoggerModuleAPI> getLogger();

    Optional<LevelupModuleAPI> getLevelup();

    Optional<HomeModuleAPI> getHome();
    
    Optional<MailModuleAPI> getMail();
    
    Optional<BannerModuleAPI> getBanner();
    
    Optional<DiscordModuleAPI> getDiscordAPI();
    
    Optional<RewardsModuleAPI> getRewards();
    
    Optional<MultiserverModuleAPI> getMultiserverAPI();
    
	Optional<AnvilModuleAPI> getAnvilAPI();
	
	
	// ==========================================
	// ITEMP ARSE
	// ==========================================

	void registerItemParseAPI(String pluginName, ItemParseImplement api);

	void unregisterItemParseAPI(String pluginName);
	
	Optional<ItemParseImplement> getItemParseAPI(String pluginName);

	Optional<ItemParseImplement> getItemParseAPI();


	// ==========================================
	// SCOREBOARD
	// ==========================================

	void registerScoreboardAPI(String pluginName, ScoreboardImplement api);

	void unregisterScoreboardAPI(String pluginName);
	
	Optional<ScoreboardImplement> getScoreboardAPI(String pluginName);

	Optional<ScoreboardImplement> getScoreboardAPI();

	// ==========================================
	// REGION
	// ==========================================

	void registerRegionAPI(String pluginName, RegionImplement api);

	void unregisterRegionAPI(String pluginName);
	
	Optional<RegionImplement> getRegionAPI(String pluginName);

	Optional<RegionImplement> getRegionAPI();

	// ==========================================
	// MONEY
	// ==========================================


	void registerMoneyAPI(String pluginName, MoneyImplement api);

	void unregisterMoneyAPI(String pluginName);

	Optional<MoneyImplement> getMoneyAPI(String pluginName);
	
	Optional<MoneyImplement> getMoneyAPI();

	// ==========================================
	// MAP
	// ==========================================


	void registerMapAPI(String pluginName, MapImplement api);

	void unregisterMapAPI(String pluginName);
	
	Optional<MapImplement> getMapAPI(String pluginName);

	Optional<MapImplement> getMapAPI();

	// ==========================================
	// HOLOGRAM
	// ==========================================


	void registerHologramAPI(String pluginName, HologramImplement api);

	void unregisterHologramAPI(String pluginName);
	
	Optional<HologramImplement> getHologramAPI(String pluginName);

	Optional<HologramImplement> getHologramAPI();

	// ==========================================
	// EVENT
	// ==========================================

	void registerEventAPI(String pluginName, EventImplement api);

	void unregisterEventAPI(String pluginName);
	
	Optional<EventImplement> getEventAPI(String pluginName);

	Optional<EventImplement> getEventAPI();

	// ==========================================
	// CLAIM
	// ==========================================


	void registerClaimAPI(String pluginName, ClaimImplement api);

	void unregisterClaimAPI(String pluginName);
	
	Optional<ClaimImplement> getClaimAPI(String pluginName);

	Optional<ClaimImplement> getClaimAPI();

	// ADDONS

	// ==========================================
	// BANK
	// ==========================================
	void registerBankAPI(BankAddonAPI api);

	void unregisterBankAPI(BankAddonAPI api);

	Optional<BankAddonAPI> getBankAPI();

	// ==========================================
	// CHEST
	// ==========================================
	void registerChestAPI(ChestAddonAPI api);

	void unregisterChestAPI(ChestAddonAPI api);

	Optional<ChestAddonAPI> getChestAPI();

	// ==========================================
	// FARM COINS
	// ==========================================
	void registerFarmCoinAPI(FarmCoinsAddonAPI api);

	void unregisterFarmCoinAPI(FarmCoinsAddonAPI api);

	Optional<FarmCoinsAddonAPI> getFarmCoinAPI();

	// ==========================================
	// LAND
	// ==========================================
	void registerLandAPI(LandAddonAPI api);

	void unregisterLandAPI(LandAddonAPI api);

	Optional<LandAddonAPI> getLandAPI();

	// ==========================================
	// LEADERBOARD
	// ==========================================
	void registerLeaderboardAPI(LeaderboardAddonAPI api);

	void unregisterLeaderboardAPI(LeaderboardAddonAPI api);

	Optional<LeaderboardAddonAPI> getLeaderboardAPI();

	// ==========================================
	// LEAGUE
	// ==========================================
	void registerLeagueAPI(LeagueAddonAPI api);

	void unregisterLeagueAPI(LeagueAddonAPI api);

	Optional<LeagueAddonAPI> getLeagueAPI();

	// ==========================================
	// NEXUS
	// ==========================================
	void registerNexusAPI(NexusAddonAPI api);

	void unregisterNexusAPI(NexusAddonAPI api);

	Optional<NexusAddonAPI> getNexusAPI();

	// ==========================================
	// QUEST
	// ==========================================
	void registerQuestAPI(QuestAddonAPI api);

	void unregisterQuestAPI(QuestAddonAPI api);

	Optional<QuestAddonAPI> getQuestAPI();

	// ==========================================
	// WAR
	// ==========================================
	void registerWarAPI(WarAddonAPI api);

	void unregisterWarAPI(WarAddonAPI api);

	Optional<WarAddonAPI> getWarAPI();
	
	// ==========================================
	// GLADIADOR
	// ==========================================
	void registerGladiatorAPI(GladiatorAddonAPI api);

	void unregisterGladiatorAPI(GladiatorAddonAPI api);

	Optional<GladiatorAddonAPI> getGladiatorAPI();
	
}
