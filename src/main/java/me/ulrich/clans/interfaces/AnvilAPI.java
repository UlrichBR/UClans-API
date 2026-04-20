package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;


public interface AnvilAPI {

	Optional<AnvilImplement> getPreferentialOrFirstImplement();

	HashMap<String, AnvilImplement> getImplementedAnvil();

	boolean addImplementation(String pluginName, AnvilImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	Optional<AnvilImplement> getAnvilImplemented(String pluginName);

	List<String> getImplementationPluginsNames();
	
	HashMap<String, AnvilImplement> getImplementationPluginsData();
    
    
    
}
