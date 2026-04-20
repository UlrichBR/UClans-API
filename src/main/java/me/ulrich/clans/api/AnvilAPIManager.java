package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.AnvilAPI;
import me.ulrich.clans.interfaces.AnvilImplement;

public class AnvilAPIManager implements AnvilAPI {

	public AnvilAPIManager(Clans clans) {}
	


	public Clans getPlugin() {
		return null;
	}



	@Override
	public Optional<AnvilImplement> getPreferentialOrFirstImplement() {
		return Optional.empty();
	}



	@Override
	public HashMap<String, AnvilImplement> getImplementedAnvil() {
		return null;
	}



	@Override
	public boolean addImplementation(String pluginName, AnvilImplement region) {
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
	public Optional<AnvilImplement> getAnvilImplemented(String pluginName) {
		return Optional.empty();
	}



	@Override
	public List<String> getImplementationPluginsNames() {
		return null;
	}



	@Override
	public HashMap<String, AnvilImplement> getImplementationPluginsData() {
		return null;
	}
}
