package me.ulrich.clans.manager;

import java.util.Optional;
import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.BannerModuleAPI;
import me.ulrich.clans.interfaces.HomeModuleAPI;
import me.ulrich.clans.interfaces.LevelupModuleAPI;
import me.ulrich.clans.interfaces.LoggerModuleAPI;
import me.ulrich.clans.interfaces.MailModuleAPI;
import me.ulrich.clans.interfaces.RivalAllyModuleAPI;

public class IntegrationManager {

    public IntegrationManager(Clans plugin) {
        
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


}
