package me.ulrich.clans.data.addons;

import java.util.UUID;

import me.ulrich.clans.data.addons.AddonEnum.LeagueEventAction;


public class LeagueData {

	private UUID clanUUID;
	private double points;
	private String logger;
	private long date;
	private UUID id;
	private UUID season;
	private LeagueEventAction type;

	public LeagueData(UUID id, UUID clanUUID, double points, long date, String logger, UUID season, LeagueEventAction type) {
		this.setId(id);
		this.setClanUUID(clanUUID);
		this.setPoints(points);
		this.setDate(date);
		this.setLogger(logger);
		this.setSeason(season);
		this.setType(type);
	}

	public UUID getClanUUID() {
		return clanUUID;
	}

	public void setClanUUID(UUID clanUUID) {
		this.clanUUID = clanUUID;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public String getLogger() {
		return logger;
	}

	public void setLogger(String logger) {
		this.logger = logger;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getSeason() {
		return season;
	}

	public void setSeason(UUID season) {
		this.season = season;
	}

	public LeagueEventAction getType() {
		return type;
	}

	public void setType(LeagueEventAction type) {
		this.type = type;
	}
}
