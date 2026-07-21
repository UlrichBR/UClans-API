package me.ulrich.clans.data.addons;

import java.util.List;

import org.bukkit.Material;

public class FarmCoinIconData {

	private Material material;
	private String name;
	private List<String> lore;
	private List<String> nbts;
	private Integer model;

	public FarmCoinIconData(Material material, String name, List<String> lore, List<String> nbts, Integer model) {
		this.setMaterial(material);
		this.setName(name);
		this.setLore(lore);
		this.setNbts(nbts);
		this.setModel(model);
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLore() {
		return lore;
	}

	public void setLore(List<String> lore) {
		this.lore = lore;
	}

	public List<String> getNbts() {
		return nbts;
	}

	public void setNbts(List<String> nbts) {
		this.nbts = nbts;
	}

	public Integer getModel() {
		return model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}
}
