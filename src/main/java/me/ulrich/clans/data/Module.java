package me.ulrich.clans.data;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.loader.Serializer;
import me.ulrich.clans.loader.module.ModuleClassloader;


public abstract class Module {
	private boolean enabled;
	private Serializer dataSerializer;
	private Serializer configSerializer;
	private JavaPlugin instance;
	private String name;
	private String author;
	private String version;
	private String require;
	private String description;
	private ModuleClassloader classLoader;
	private File extensionDataFolder;
	private HashMap<String, InputStream> extensionFiles;

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

	public ModuleClassloader getClassLoader() {
		return this.classLoader;
	}

	public void setClassLoader(ModuleClassloader classLoader) {
		this.classLoader = classLoader;
	}

	public File getExtensionDataFolder() {
		return this.extensionDataFolder;
	}

	public void enable(JavaPlugin instance, File extensionDataFolder, Serializer dataSerializer,
			Serializer configSerializer) {


	}

	protected boolean logThis(Exception e) {


		return false;
	}

	public void disable() {
		if (!isEnabled())
			throw new IllegalStateException("Cannot disable the extension when it isn't enabled");
		onDisable();
		setEnabled(false);
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

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public HashMap<String, InputStream> getModuleFiles() {
		return extensionFiles;
	}

	public void setModuleFiles(HashMap<String, InputStream> extensionFiles) {
		this.extensionFiles = extensionFiles;
	}

	public String getRequire() {
		return require;
	}

	public void setRequire(String require) {
		this.require = require;
	}
}

