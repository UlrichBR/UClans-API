package me.ulrich.clans.data.addons;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import me.ulrich.clans.data.addons.AddonEnum.Coin;
import me.ulrich.clans.data.addons.AddonEnum.CoinType;

public class FarmCoinData {

	private String id;
	private String name;
	private String permission;
	private Double chance;
	private Integer minValue;
	private Integer maxValue;
	private List<String> mobs;
	private List<String> miner;
	private List<String> players;
	private FarmCoinIconData icon;
	private List<String> fishing;
	private CoinType type;
	private Coin coin;
	private List<String> enabledRegions;
	private List<String> enabledWorlds;
	private boolean league;
	private HashMap<Integer, Double> chance_level;
	private HashMap<String, Double> chance_role;
	private Optional<String> dropSound;

	public FarmCoinData(String id, String name, String permission, List<String> enabledRegions, List<String> enabledWorlds, CoinType type, Coin coin, Double chance, HashMap<Integer, Double> chance_level, HashMap<String, Double> chance_role, Integer minValue, Integer maxValue, Optional<String> dropSound, List<String> mobs, List<String> miner, List<String> players, List<String> fishing, boolean league, FarmCoinIconData icon) {
		this.setId(id);
		this.setName(name);
		this.setPermission(permission);
		this.setEnabledRegions(enabledRegions);
		this.setEnabledWorlds(enabledWorlds);
		this.setType(type);
		this.setCoin(coin);
		this.setChance(chance);
		this.setMinValue(minValue);
		this.setMaxValue(maxValue);
		this.setDropSound(dropSound);
		this.setMobs(mobs);
		this.setMiner(miner);
		this.setPlayers(players);
		this.setFishing(fishing);
		this.setLeague(league);
		this.setIcon(icon);
		this.setChance_level(chance_level);
		this.setChance_role(chance_role);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getChance() {
		return chance;
	}

	public void setChance(Double chance) {
		this.chance = chance;
	}

	public Integer getMinValue() {
		return minValue;
	}

	public void setMinValue(Integer minValue) {
		this.minValue = minValue;
	}

	public Integer getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}

	public List<String> getMobs() {
		return mobs;
	}

	public void setMobs(List<String> mobs) {
		this.mobs = mobs;
	}


	public List<String> getMiner() {
		return miner;
	}

	public void setMiner(List<String> miner) {
		this.miner = miner;
	}

	public List<String> getPlayers() {
		return players;
	}

	public void setPlayers(List<String> players) {
		this.players = players;
	}

	public FarmCoinIconData getIcon() {
		return icon;
	}

	public void setIcon(FarmCoinIconData icon) {
		this.icon = icon;
	}

	public List<String> getFishing() {
		return fishing;
	}

	public void setFishing(List<String> fishing) {
		this.fishing = fishing;
	}

	public CoinType getType() {
		return type;
	}

	public void setType(CoinType type) {
		this.type = type;
	}

	public Coin getCoin() {
		return coin;
	}

	public void setCoin(Coin coin) {
		this.coin = coin;
	}

	public List<String> getEnabledRegions() {
		return enabledRegions;
	}

	public void setEnabledRegions(List<String> enabledRegions) {
		this.enabledRegions = enabledRegions;
	}

	public List<String> getEnabledWorlds() {
		return enabledWorlds;
	}

	public void setEnabledWorlds(List<String> enabledWorlds) {
		this.enabledWorlds = enabledWorlds;
	}

	public boolean isLeague() {
		return league;
	}

	public void setLeague(boolean league) {
		this.league = league;
	}

	public HashMap<Integer, Double> getChance_level() {
		return chance_level;
	}

	public void setChance_level(HashMap<Integer, Double> chance_level) {
		this.chance_level = chance_level;
	}

	public HashMap<String, Double> getChance_role() {
		return chance_role;
	}

	public void setChance_role(HashMap<String, Double> chance_role) {
		this.chance_role = chance_role;
	}

	public Optional<String> getDropSound() {
		return dropSound;
	}

	public void setDropSound(Optional<String> dropSound) {
		this.dropSound = dropSound;
	}
}
