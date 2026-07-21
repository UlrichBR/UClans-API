package me.ulrich.clans.data.addons;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;

public class LandsData {

	private UUID uuid;
	private UUID clanid;
	private long claimdate;
	private Location loc1;
	private Location loc2;
	private int level;
	private Location spawn;
	private List<UUID> banned;
	private long lastActivity;
	private String name;
	private List<UUID> trusted;
	private LandsData_flags flags;

	public LandsData(UUID uuid, UUID clanid, Location loc1, Location loc2, Location spawn, List<UUID> banned, List<UUID> trusted, String name, long claimdate, long lastActivity, int level, LandsData_flags flags) {
		this.setUuid(uuid);
		this.setClanid(clanid);
		this.setLoc1(loc1);
		this.setLoc2(loc2);
		this.setClaimdate(claimdate);
		this.setLevel(level);
		this.setSpawn(spawn);
		this.setBanned(banned);
		this.setTrusted(trusted);
		this.setLastActivity(lastActivity);
		this.setName(name);
		this.setFlags(flags);
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getClanid() {
		return clanid;
	}

	public void setClanid(UUID clanid) {
		this.clanid = clanid;
	}

	public long getClaimdate() {
		return claimdate;
	}

	public void setClaimdate(long claimdate) {
		this.claimdate = claimdate;
	}

	public Location getLoc1() {
		return loc1;
	}

	public void setLoc1(Location loc1) {
		this.loc1 = loc1;
	}

	public Location getLoc2() {
		return loc2;
	}

	public void setLoc2(Location loc2) {
		this.loc2 = loc2;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Location getSpawn() {
		return spawn;
	}

	public void setSpawn(Location spawn) {
		this.spawn = spawn;
	}

	public List<UUID> getBanned() {
		return banned;
	}

	public void setBanned(List<UUID> banned) {
		this.banned = banned;
	}

	public long getLastActivity() {
		return lastActivity;
	}

	public void setLastActivity(long lastActivity) {
		this.lastActivity = lastActivity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UUID> getTrusted() {
		return trusted;
	}

	public void setTrusted(List<UUID> trusted) {
		this.trusted = trusted;
	}

	public LandsData_flags getFlags() {
		return flags;
	}

	public void setFlags(LandsData_flags flags) {
		this.flags = flags;
	}
}
