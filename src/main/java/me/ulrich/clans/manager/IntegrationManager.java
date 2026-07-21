package me.ulrich.clans.manager;

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

public class IntegrationManager {

    public IntegrationManager(Clans plugin) {
        
    }
    
    public void registerAnvilAPI(AnvilModuleAPI api) {

    }
    
    public void unregisterAnvilAPI(AnvilModuleAPI api) {
        
    }
    
    public void registerMultiserverAPI(MultiserverModuleAPI api) {
    	
    }
    
    public void unregisterMultiserverAPI(MultiserverModuleAPI api) {

    }
    
    public void registerRewardsAPI(RewardsModuleAPI api) {
        
    }
    
    public void unregisterRewardsAPI(RewardsModuleAPI api) {
        
    }
    
    public void registerDiscordAPI(DiscordModuleAPI api) {
       
    }
    
    public void unregisterDiscordAPI(DiscordModuleAPI api) {
   
    }

    public void registerMailAPI(MailModuleAPI api) {
        
    }
    
    public void unregisterMailAPI(MailModuleAPI api) {
        
    }
    
    public void registerBannerAPI(BannerModuleAPI api) {

    }
    
    public void unregisterBannerAPI(BannerModuleAPI api) {
        
    }

    public void registerRivalAllyAPI(RivalAllyModuleAPI api) {

    }

    public void unregisterRivalAllyAPI(RivalAllyModuleAPI api) {

    }

    public void registerLoggerAPI(LoggerModuleAPI api) {

    }

    public void unregisterLoggerAPI(LoggerModuleAPI api) {

    }

    public void registerLevelupAPI(LevelupModuleAPI api) {

    }

    public void unregisterLevelupAPI(LevelupModuleAPI api) {

    }

    public void registerHomeAPI(HomeModuleAPI api) {

    }

    public void unregisterHomeAPI(HomeModuleAPI api) {

    }
    
    public String parseModulePlaceholders(UUID player, String identifier) {
    	return null;
    }

    public Optional<RivalAllyModuleAPI> getRivalAlly() {
        return Optional.empty();
    }

    public Optional<LoggerModuleAPI> getLogger() {
    	return Optional.empty();
    }

    public Optional<LevelupModuleAPI> getLevelup() {
    	return Optional.empty();
    }

    public Optional<HomeModuleAPI> getHome() {
    	return Optional.empty();
    }
    
    public Optional<MailModuleAPI> getMail() {
    	return Optional.empty();
    }
    
    public Optional<BannerModuleAPI> getBanner() {
    	return Optional.empty();
    }
    
    public Optional<DiscordModuleAPI> getDiscordAPI() {
    	return Optional.empty();
    }
    
    public Optional<RewardsModuleAPI> getRewards() {
        return Optional.empty();
    }

    public Optional<MultiserverModuleAPI> getMultiserverAPI() {
        return Optional.empty();
    }
    
	public Optional<AnvilModuleAPI> getAnvilAPI() {
		return Optional.empty();
	}
	
	

	// ==========================================
	// SCOREBOARD
	// ==========================================

	public void registerScoreboardAPI(String pluginName, ScoreboardImplement api) {

	}

	public void unregisterScoreboardAPI(String pluginName) {

	}
	
	public Optional<ScoreboardImplement> getScoreboardAPI(String pluginName) {
		return Optional.empty();
	}

	public Optional<ScoreboardImplement> getScoreboardAPI() {
		return Optional.empty();
	}

	// ==========================================
	// REGION
	// ==========================================

	public void registerRegionAPI(String pluginName, RegionImplement api) {

	}

	public void unregisterRegionAPI(String pluginName) {

	}
	
	public Optional<RegionImplement> getRegionAPI(String pluginName) {
		return Optional.empty();
	}

	public Optional<RegionImplement> getRegionAPI() {
		return Optional.empty();
	}

	// ==========================================
	// MONEY
	// ==========================================


	public void registerMoneyAPI(String pluginName, MoneyImplement api) {
		
	}

	public void unregisterMoneyAPI(String pluginName) {

	}

	public Optional<MoneyImplement> getMoneyAPI(String pluginName) {
		return Optional.empty();
	}
	
	public Optional<MoneyImplement> getMoneyAPI() {
		return Optional.empty();
	}

	// ==========================================
	// MAP
	// ==========================================


	public void registerMapAPI(String pluginName, MapImplement api) {

	}

	public void unregisterMapAPI(String pluginName) {

	}
	
	public Optional<MapImplement> getMapAPI(String pluginName) {
		return Optional.empty();
	}

	public Optional<MapImplement> getMapAPI() {
		return Optional.empty();
	}

	// ==========================================
	// HOLOGRAM
	// ==========================================


	public void registerHologramAPI(String pluginName, HologramImplement api) {

	}

	public void unregisterHologramAPI(String pluginName) {

	}
	
	public Optional<HologramImplement> getHologramAPI(String pluginName) {
		return Optional.empty();
	}

	public Optional<HologramImplement> getHologramAPI() {
		return Optional.empty();
	}

	// ==========================================
	// EVENT
	// ==========================================

	public void registerEventAPI(String pluginName, EventImplement api) {

	}

	public void unregisterEventAPI(String pluginName) {

	}
	
	public Optional<EventImplement> getEventAPI(String pluginName) {
		return Optional.empty();
	}

	public Optional<EventImplement> getEventAPI() {
		return Optional.empty();
	}

	// ==========================================
	// CLAIM
	// ==========================================


	public void registerClaimAPI(String pluginName, ClaimImplement api) {

	}

	public void unregisterClaimAPI(String pluginName) {

	}
	
	public Optional<ClaimImplement> getClaimAPI(String pluginName) {
		return Optional.empty();
	}

	public Optional<ClaimImplement> getClaimAPI() {
		return Optional.empty();
	}

	// ADDONS

	// ==========================================
	// BANK
	// ==========================================
	public void registerBankAPI(BankAddonAPI api) {
	
	}

	public void unregisterBankAPI(BankAddonAPI api) {
		
	}

	public Optional<BankAddonAPI> getBankAPI() {
		return Optional.empty();
	}

	// ==========================================
	// CHEST
	// ==========================================
	public void registerChestAPI(ChestAddonAPI api) {
		
	}

	public void unregisterChestAPI(ChestAddonAPI api) {
		
	}

	public Optional<ChestAddonAPI> getChestAPI() {
		return Optional.empty();
	}

	// ==========================================
	// FARM COINS
	// ==========================================
	public void registerFarmCoinAPI(FarmCoinsAddonAPI api) {
		
	}

	public void unregisterFarmCoinAPI(FarmCoinsAddonAPI api) {

	}

	public Optional<FarmCoinsAddonAPI> getFarmCoinAPI() {
		return Optional.empty();
	}

	// ==========================================
	// LAND
	// ==========================================
	public void registerLandAPI(LandAddonAPI api) {
		
	}

	public void unregisterLandAPI(LandAddonAPI api) {

	}

	public Optional<LandAddonAPI> getLandAPI() {
		return Optional.empty();
	}

	// ==========================================
	// LEADERBOARD
	// ==========================================
	public void registerLeaderboardAPI(LeaderboardAddonAPI api) {

	}

	public void unregisterLeaderboardAPI(LeaderboardAddonAPI api) {

	}

	public Optional<LeaderboardAddonAPI> getLeaderboardAPI() {
		return Optional.empty();
	}

	// ==========================================
	// LEAGUE
	// ==========================================
	public void registerLeagueAPI(LeagueAddonAPI api) {
		
	}

	public void unregisterLeagueAPI(LeagueAddonAPI api) {
		
	}

	public Optional<LeagueAddonAPI> getLeagueAPI() {
		return Optional.empty();
	}

	// ==========================================
	// NEXUS
	// ==========================================
	public void registerNexusAPI(NexusAddonAPI api) {

	}

	public void unregisterNexusAPI(NexusAddonAPI api) {

	}

	public Optional<NexusAddonAPI> getNexusAPI() {
		return Optional.empty();
	}

	// ==========================================
	// QUEST
	// ==========================================
	public void registerQuestAPI(QuestAddonAPI api) {
		
	}

	public void unregisterQuestAPI(QuestAddonAPI api) {
		
	}

	public Optional<QuestAddonAPI> getQuestAPI() {
		return Optional.empty();
	}

	// ==========================================
	// WAR
	// ==========================================
	public void registerWarAPI(WarAddonAPI api) {

	}

	public void unregisterWarAPI(WarAddonAPI api) {

	}

	public Optional<WarAddonAPI> getWarAPI() {
		return Optional.empty();
	}
	
	// ==========================================
	// GLADIADOR
	// ==========================================
	public void registerGladiatorAPI(GladiatorAddonAPI api) {

	}

	public void unregisterGladiatorAPI(GladiatorAddonAPI api) {
		
	}

	public Optional<GladiatorAddonAPI> getGladiatorAPI() {
		return Optional.empty();
	}
	
}
