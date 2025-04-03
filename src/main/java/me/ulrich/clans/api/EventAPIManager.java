package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

import org.bukkit.Location;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.EventAPI;
import me.ulrich.clans.interfaces.EventImplement;

public class EventAPIManager implements EventAPI {

	private Clans plugin;
	
	public EventAPIManager(Clans plugin) {
		this.plugin = plugin;
	}
	
	public Clans getPlugin() {
		return plugin;
	}

	@Override
	public Optional<EventImplement> getPreferentialOrFirstImplement() {
		return Optional.empty();
	}

	@Override
	public HashMap<String, EventImplement> getImplementedEvent() {
		return null;
	}

	@Override
	public boolean addImplementation(String pluginName, EventImplement region) {
		return false;
	}

	@Override
	public boolean hasPluginImplemented(String pluginName) {
		return false;
	}

	@Override
	public boolean removeImplementation(String pluginName) {
		return false;
	}

	@Override
	public List<String> getImplementationPluginsName() {
		return null;
	}

	@Override
	public List<Entry<String, EventImplement>> findEventLocationImplement(Location location) {
		return null;
	}

	@Override
	public Optional<EventImplement> getEventImplemented(String pluginName) {
		return Optional.empty();
	}

	@Override
	public HashMap<String, EventImplement> getImplementationPluginsData() {
		return null;
	}

}
