package me.ulrich.clans.manager;

import java.util.Optional;
import java.util.UUID;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.BannerModuleAPI;
import me.ulrich.clans.interfaces.DiscordModuleAPI;
import me.ulrich.clans.interfaces.HomeModuleAPI;
import me.ulrich.clans.interfaces.LevelupModuleAPI;
import me.ulrich.clans.interfaces.LoggerModuleAPI;
import me.ulrich.clans.interfaces.MailModuleAPI;
import me.ulrich.clans.interfaces.MultiserverModuleAPI;
import me.ulrich.clans.interfaces.RewardsModuleAPI;
import me.ulrich.clans.interfaces.RivalAllyModuleAPI;

public class IntegrationManager {

    public IntegrationManager(Clans plugin) {
        
    }
    
    public void registerRewardsAPI(MultiserverModuleAPI api) {
    }
    
    public void unregisterRewardsAPI(MultiserverModuleAPI api) {

        
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
    

}
