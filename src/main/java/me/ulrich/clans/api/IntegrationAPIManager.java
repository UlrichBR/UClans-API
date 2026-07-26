package me.ulrich.clans.api;

import java.util.Optional;
import java.util.UUID;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.AnvilModuleAPI;
import me.ulrich.clans.interfaces.BankAddonAPI;
import me.ulrich.clans.interfaces.BannerModuleAPI;
import me.ulrich.clans.interfaces.ChestAddonAPI;
import me.ulrich.clans.interfaces.ClaimImplement;
import me.ulrich.clans.interfaces.DiscordModuleAPI;
import me.ulrich.clans.interfaces.EventImplement;
import me.ulrich.clans.interfaces.FarmCoinsAddonAPI;
import me.ulrich.clans.interfaces.GladiatorAddonAPI;
import me.ulrich.clans.interfaces.HologramImplement;
import me.ulrich.clans.interfaces.HomeModuleAPI;
import me.ulrich.clans.interfaces.IntegrationAPI;
import me.ulrich.clans.interfaces.LandAddonAPI;
import me.ulrich.clans.interfaces.LeaderboardAddonAPI;
import me.ulrich.clans.interfaces.LeagueAddonAPI;
import me.ulrich.clans.interfaces.LevelupModuleAPI;
import me.ulrich.clans.interfaces.LoggerModuleAPI;
import me.ulrich.clans.interfaces.MailModuleAPI;
import me.ulrich.clans.interfaces.MapImplement;
import me.ulrich.clans.interfaces.MoneyImplement;
import me.ulrich.clans.interfaces.MultiserverModuleAPI;
import me.ulrich.clans.interfaces.NexusAddonAPI;
import me.ulrich.clans.interfaces.QuestAddonAPI;
import me.ulrich.clans.interfaces.RegionImplement;
import me.ulrich.clans.interfaces.RewardsModuleAPI;
import me.ulrich.clans.interfaces.RivalAllyModuleAPI;
import me.ulrich.clans.interfaces.ScoreboardImplement;
import me.ulrich.clans.interfaces.WarAddonAPI;

public class IntegrationAPIManager implements IntegrationAPI {


	public IntegrationAPIManager(Clans clans) {}

	@Override
	public void registerAnvilAPI(AnvilModuleAPI api) {
		
		
	}

	@Override
	public void unregisterAnvilAPI(AnvilModuleAPI api) {
		
		
	}

	@Override
	public void registerMultiserverAPI(MultiserverModuleAPI api) {
		
		
	}

	@Override
	public void unregisterMultiserverAPI(MultiserverModuleAPI api) {
		
		
	}

	@Override
	public void registerRewardsAPI(RewardsModuleAPI api) {
		
		
	}

	@Override
	public void unregisterRewardsAPI(RewardsModuleAPI api) {
		
		
	}

	@Override
	public void registerDiscordAPI(DiscordModuleAPI api) {
		
		
	}

	@Override
	public void unregisterDiscordAPI(DiscordModuleAPI api) {
		
		
	}

	@Override
	public void registerMailAPI(MailModuleAPI api) {
		
		
	}

	@Override
	public void unregisterMailAPI(MailModuleAPI api) {
		
		
	}

	@Override
	public void registerBannerAPI(BannerModuleAPI api) {
		
		
	}

	@Override
	public void unregisterBannerAPI(BannerModuleAPI api) {
		
		
	}

	@Override
	public void registerRivalAllyAPI(RivalAllyModuleAPI api) {
		
		
	}

	@Override
	public void unregisterRivalAllyAPI(RivalAllyModuleAPI api) {
		
		
	}

	@Override
	public void registerLoggerAPI(LoggerModuleAPI api) {
		
		
	}

	@Override
	public void unregisterLoggerAPI(LoggerModuleAPI api) {
		
		
	}

	@Override
	public void registerLevelupAPI(LevelupModuleAPI api) {
		
		
	}

	@Override
	public void unregisterLevelupAPI(LevelupModuleAPI api) {
		
		
	}

	@Override
	public void registerHomeAPI(HomeModuleAPI api) {
		
		
	}

	@Override
	public void unregisterHomeAPI(HomeModuleAPI api) {
		
		
	}

	@Override
	public String parseModulePlaceholders(UUID player, String identifier) {
		
		return null;
	}

	@Override
	public String parseAddonPlaceholders(UUID player, String identifier) {
		
		return null;
	}

	@Override
	public Optional<RivalAllyModuleAPI> getRivalAlly() {
		
		return Optional.empty();
	}

	@Override
	public Optional<LoggerModuleAPI> getLogger() {
		
		return Optional.empty();
	}

	@Override
	public Optional<LevelupModuleAPI> getLevelup() {
		
		return Optional.empty();
	}

	@Override
	public Optional<HomeModuleAPI> getHome() {
		
		return Optional.empty();
	}

	@Override
	public Optional<MailModuleAPI> getMail() {
		
		return Optional.empty();
	}

	@Override
	public Optional<BannerModuleAPI> getBanner() {
		
		return Optional.empty();
	}

	@Override
	public Optional<DiscordModuleAPI> getDiscordAPI() {
		
		return Optional.empty();
	}

	@Override
	public Optional<RewardsModuleAPI> getRewards() {
		
		return Optional.empty();
	}

	@Override
	public Optional<MultiserverModuleAPI> getMultiserverAPI() {
		
		return Optional.empty();
	}

	@Override
	public Optional<AnvilModuleAPI> getAnvilAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerScoreboardAPI(String pluginName, ScoreboardImplement api) {
		
		
	}

	@Override
	public void unregisterScoreboardAPI(String pluginName) {
		
		
	}

	@Override
	public Optional<ScoreboardImplement> getScoreboardAPI(String pluginName) {
		
		return Optional.empty();
	}

	@Override
	public Optional<ScoreboardImplement> getScoreboardAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerRegionAPI(String pluginName, RegionImplement api) {
		
		
	}

	@Override
	public void unregisterRegionAPI(String pluginName) {
		
		
	}

	@Override
	public Optional<RegionImplement> getRegionAPI(String pluginName) {
		
		return Optional.empty();
	}

	@Override
	public Optional<RegionImplement> getRegionAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerMoneyAPI(String pluginName, MoneyImplement api) {
		
		
	}

	@Override
	public void unregisterMoneyAPI(String pluginName) {
		
		
	}

	@Override
	public Optional<MoneyImplement> getMoneyAPI(String pluginName) {
		
		return Optional.empty();
	}

	@Override
	public Optional<MoneyImplement> getMoneyAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerMapAPI(String pluginName, MapImplement api) {
		
		
	}

	@Override
	public void unregisterMapAPI(String pluginName) {
		
		
	}

	@Override
	public Optional<MapImplement> getMapAPI(String pluginName) {
		
		return Optional.empty();
	}

	@Override
	public Optional<MapImplement> getMapAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerHologramAPI(String pluginName, HologramImplement api) {
		
		
	}

	@Override
	public void unregisterHologramAPI(String pluginName) {
		
		
	}

	@Override
	public Optional<HologramImplement> getHologramAPI(String pluginName) {
		
		return Optional.empty();
	}

	@Override
	public Optional<HologramImplement> getHologramAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerEventAPI(String pluginName, EventImplement api) {
		
		
	}

	@Override
	public void unregisterEventAPI(String pluginName) {
		
		
	}

	@Override
	public Optional<EventImplement> getEventAPI(String pluginName) {
		
		return Optional.empty();
	}

	@Override
	public Optional<EventImplement> getEventAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerClaimAPI(String pluginName, ClaimImplement api) {
		
		
	}

	@Override
	public void unregisterClaimAPI(String pluginName) {
		
		
	}

	@Override
	public Optional<ClaimImplement> getClaimAPI(String pluginName) {
		
		return Optional.empty();
	}

	@Override
	public Optional<ClaimImplement> getClaimAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerBankAPI(BankAddonAPI api) {
		
		
	}

	@Override
	public void unregisterBankAPI(BankAddonAPI api) {
		
		
	}

	@Override
	public Optional<BankAddonAPI> getBankAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerChestAPI(ChestAddonAPI api) {
		
		
	}

	@Override
	public void unregisterChestAPI(ChestAddonAPI api) {
		
		
	}

	@Override
	public Optional<ChestAddonAPI> getChestAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerFarmCoinAPI(FarmCoinsAddonAPI api) {
		
		
	}

	@Override
	public void unregisterFarmCoinAPI(FarmCoinsAddonAPI api) {
		
		
	}

	@Override
	public Optional<FarmCoinsAddonAPI> getFarmCoinAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerLandAPI(LandAddonAPI api) {
		
		
	}

	@Override
	public void unregisterLandAPI(LandAddonAPI api) {
		
		
	}

	@Override
	public Optional<LandAddonAPI> getLandAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerLeaderboardAPI(LeaderboardAddonAPI api) {
		
		
	}

	@Override
	public void unregisterLeaderboardAPI(LeaderboardAddonAPI api) {
		
		
	}

	@Override
	public Optional<LeaderboardAddonAPI> getLeaderboardAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerLeagueAPI(LeagueAddonAPI api) {
		
		
	}

	@Override
	public void unregisterLeagueAPI(LeagueAddonAPI api) {
		
		
	}

	@Override
	public Optional<LeagueAddonAPI> getLeagueAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerNexusAPI(NexusAddonAPI api) {
		
		
	}

	@Override
	public void unregisterNexusAPI(NexusAddonAPI api) {
		
		
	}

	@Override
	public Optional<NexusAddonAPI> getNexusAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerQuestAPI(QuestAddonAPI api) {
		
		
	}

	@Override
	public void unregisterQuestAPI(QuestAddonAPI api) {
		
		
	}

	@Override
	public Optional<QuestAddonAPI> getQuestAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerWarAPI(WarAddonAPI api) {
		
		
	}

	@Override
	public void unregisterWarAPI(WarAddonAPI api) {
		
		
	}

	@Override
	public Optional<WarAddonAPI> getWarAPI() {
		
		return Optional.empty();
	}

	@Override
	public void registerGladiatorAPI(GladiatorAddonAPI api) {
		
		
	}

	@Override
	public void unregisterGladiatorAPI(GladiatorAddonAPI api) {
		
		
	}

	@Override
	public Optional<GladiatorAddonAPI> getGladiatorAPI() {
		
		return Optional.empty();
	}



}
