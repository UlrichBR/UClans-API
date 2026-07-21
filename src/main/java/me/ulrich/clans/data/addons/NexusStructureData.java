package me.ulrich.clans.data.addons;

import java.io.File;
import java.util.Optional;

import org.bukkit.Material;

public class NexusStructureData {

	private boolean playerCanUse;
	private boolean replaceAir;
	private boolean enabled;
	private String name;
	private Optional<String> usePermission;
	private Material icon;
	private String filename;
	private boolean replaceBusy;
	private int sizeX;
	private int sizeY;
	private int sizeZ;
	private File file;

	public NexusStructureData(File file, String filename, String name, Optional<String> optional, Material icon, boolean playerCanUse, boolean enabled, boolean replaceAir, boolean replaceBusy, int sizeX, int sizeY, int sizeZ) {
		this.setFile(file);
		this.setFilename(filename);
		this.setName(name);
		this.setEnabled(enabled);
		this.setPlayerCanUse(playerCanUse);
		this.setReplaceAir(replaceAir);
		this.setReplaceBusy(replaceBusy);
		this.setUsePermission(optional);
		this.setIcon(icon);
		this.setSizeX(sizeX);
		this.setSizeY(sizeY);
		this.setSizeZ(sizeZ);
	}

	public boolean isReplaceAir() {
		return replaceAir;
	}

	public void setReplaceAir(boolean replaceAir) {
		this.replaceAir = replaceAir;
	}

	public boolean isPlayerCanUse() {
		return playerCanUse;
	}

	public void setPlayerCanUse(boolean playerCanUse) {
		this.playerCanUse = playerCanUse;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<String> getUsePermission() {
		return usePermission;
	}

	public void setUsePermission(Optional<String> optional) {
		this.usePermission = optional;
	}

	public Material getIcon() {
		return icon;
	}

	public void setIcon(Material icon) {
		this.icon = icon;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public boolean isReplaceBusy() {
		return replaceBusy;
	}

	public void setReplaceBusy(boolean replaceBusy) {
		this.replaceBusy = replaceBusy;
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeZ() {
		return sizeZ;
	}

	public void setSizeZ(int sizeZ) {
		this.sizeZ = sizeZ;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
}
