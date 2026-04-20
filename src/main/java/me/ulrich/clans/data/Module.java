package me.ulrich.clans.data;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.loader.Serializer;
import me.ulrich.clans.loader.module.ModuleClassloader;

public abstract class Module {


	public boolean isEnabled() {
		return false;
	}

	public void setEnabled(boolean enabled) {

	}

	public JavaPlugin getInstance() {
		return null;
	}

	public String getName() {
		return null;
	}

	public void setName(String name) {

	}

	public ModuleClassloader getClassLoader() {
		return null;
	}

	public void setClassLoader(ModuleClassloader classLoader) {

	}

	public File getExtensionDataFolder() {
		return null;
	}

	public void enable(JavaPlugin instance, File extensionDataFolder, Serializer dataSerializer, Serializer configSerializer) {

	}

	protected boolean logThis(Exception e) {

		return false;

	}

	public void disable() {
		
	}

	public abstract void onEnable();

	public abstract void onDisable();

	public Serializer getDataSerializer() {
		return null;
	}

	public Serializer getConfigSerializer() {
		return null;
	}

	public String getAuthor() {
		return null;
	}

	public void setAuthor(String author) {
		
	}

	public String getVersion() {
		return null;
	}

	public void setVersion(String version) {
		
	}

	public String getDescription() {
		return null;
	}
	
	public void setDescription(String description) {
		
	}
	
	public HashMap<String, InputStream> getModuleFiles() {
		return null;
	}

	public void setModuleFiles(HashMap<String, InputStream> extensionFiles) {
		
	}

	public String getRequire() {
		return null;
	}

	public void setRequire(String require) {
		
	}
}

