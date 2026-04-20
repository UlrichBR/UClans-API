package me.ulrich.clans.interfaces;

import java.util.Optional;
import net.wesjd.anvilgui.AnvilGUI.Builder;

public interface AnvilImplement {

    boolean supports();

    Builder builder();
	
	boolean isInternal();
	
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();
}
