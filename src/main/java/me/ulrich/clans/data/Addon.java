package me.ulrich.clans.data;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.loader.Serializer;
import me.ulrich.clans.loader.addon.AddonClassloader;

public abstract class Addon {
	private boolean enabled;
	private Serializer dataSerializer;
	private Serializer configSerializer;
	private JavaPlugin instance;
	private String name;
	private String author;
	private String version;
	private String require;
	private AddonClassloader classLoader;
	private File addonDataFolder;
	private HashMap<String, InputStream> addonFiles;

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public JavaPlugin getInstance() {
		return this.instance;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddonClassloader getClassLoader() {
		return this.classLoader;
	}

	public void setClassLoader(AddonClassloader classLoader) {
		this.classLoader = classLoader;
	}

	public File getAddonDataFolder() {
		return this.addonDataFolder;
	}

	public void enable(JavaPlugin instance, File addonDataFolder, Serializer dataSerializer,
			Serializer configSerializer) {

	}

	protected boolean logThis(Exception e) {

		return false;

	}

	public void disable() {

	}

	public abstract void onEnable();

	public abstract void onDisable();

	public Serializer getDataSerializer() {
		return this.dataSerializer;
	}

	public Serializer getConfigSerializer() {
		return this.configSerializer;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public HashMap<String, InputStream> getAddonFiles() {
		return addonFiles;
	}

	public void setAddonFiles(HashMap<String, InputStream> addonFiles) {
		this.addonFiles = addonFiles;
	}

	public String getRequire() {
		return require;
	}

	public void setRequire(String require) {
		this.require = require;
	}
}

