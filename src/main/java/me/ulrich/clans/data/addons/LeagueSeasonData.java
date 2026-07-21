package me.ulrich.clans.data.addons;

import java.util.Optional;
import java.util.UUID;

import org.bukkit.Material;

import me.ulrich.clans.data.addons.AddonEnum.LeagueStatus;


public class LeagueSeasonData {

	private UUID id;
	private String name;
	private Material icon;
	private String desc;
	private long start;
	private long end;
	private String rawname;
	private Optional<UUID> winner;
	private Optional<LeagueRewardsData> rewards;
	private LeagueStatus status;

	public LeagueSeasonData(UUID id, String rawName, String name, Material icon, String desc, long start, long end, Optional<UUID>winner, Optional<LeagueRewardsData> rewards, LeagueStatus status) {
		this.setId(id);
		this.setRawname(rawName);
		this.setName(name);
		this.setIcon(icon);
		this.setDesc(desc);
		this.setStart(start);
		this.setEnd(end);
		this.setWinner(winner);
		this.setRewards(rewards);
		this.setStatus(status);
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Material getIcon() {
		return icon;
	}

	public void setIcon(Material icon) {
		this.icon = icon;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		this.end = end;
	}

	public String getRawname() {
		return rawname;
	}

	public void setRawname(String rawname) {
		this.rawname = rawname;
	}

	public Optional<UUID> getWinner() {
		return winner;
	}

	public void setWinner(Optional<UUID> winner) {
		this.winner = winner;
	}

	public Optional<LeagueRewardsData> getRewards() {
		return rewards;
	}

	public void setRewards(Optional<LeagueRewardsData> rewards) {
		this.rewards = rewards;
	}

	public LeagueStatus getStatus() {
		return status;
	}

	public void setStatus(LeagueStatus status) {
		this.status = status;
	}
	
}
