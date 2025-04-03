package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

import org.bukkit.Location;

public interface EventAPI {

	Optional<EventImplement> getPreferentialOrFirstImplement();

	HashMap<String, EventImplement> getImplementedEvent();

	boolean addImplementation(String pluginName, EventImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	List<String> getImplementationPluginsName();
	
	List<Entry<String, EventImplement>> findEventLocationImplement(Location location);

	Optional<EventImplement> getEventImplemented(String pluginName);

	HashMap<String, EventImplement> getImplementationPluginsData();

}
