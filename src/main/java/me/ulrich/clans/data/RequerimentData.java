package me.ulrich.clans.data;

import java.util.List;

public class RequerimentData {


	private List<String> rewards;
	private List<String> surprise;
	private String points;
	private List<String> requires;
	private int level;
	private List<String> cost;
	private List<String> description;

	public RequerimentData(int level, String points, List<String> rewards, List<String> surprise, List<String> requires, List<String> cost, List<String> description) {

		this.setLevel(level);
		this.setRewards(rewards);
		this.setSurprise(surprise);
		this.setPoints(points);
		this.setRequires(requires);
		this.setCost(cost);
		this.setDescription(description);

	}

	public List<String> getRewards() {
		return rewards;
	}

	public void setRewards(List<String> rewards) {
		this.rewards = rewards;
	}

	public List<String> getSurprise() {
		return surprise;
	}

	public void setSurprise(List<String> surprise) {
		this.surprise = surprise;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public List<String> getRequires() {
		return requires;
	}

	public void setRequires(List<String> requires) {
		this.requires = requires;
	}

	public List<String> getCost() {
		return cost;
	}

	public void setCost(List<String> cost) {
		this.cost = cost;
	}

	public List<String> getDescription() {
		return description;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}

	
	


}

