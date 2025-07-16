package me.ulrich.clans.interfaces;

import java.util.HashMap;

import me.ulrich.clans.data.Addon;
import me.ulrich.clans.data.AddonInfo;

public interface AddonAPI {

	HashMap<Addon, AddonInfo> getAddonEnabledList();

	Addon getAddon(String AddonName);

	String getDefaultBanner();

	void setDefaultBanner(String defaultBanner);

}
