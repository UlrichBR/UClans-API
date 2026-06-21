package me.ulrich.clans.manager;

import java.util.Optional;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.MailModuleAPI;

public class IntegrationManager {

    public IntegrationManager(Clans plugin) {
        
    }

    public void registerMailAPI(MailModuleAPI api) {

    }
    
    public void unregisterMailAPI(MailModuleAPI api) {
        
    }

    public Optional<MailModuleAPI> getMail() {
        return Optional.empty();
    }
}
