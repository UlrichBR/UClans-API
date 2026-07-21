package me.ulrich.clans.data.addons;

import java.util.List;

import me.ulrich.clans.data.addons.AddonEnum.QuestType;




public class QuestData_mission {

	private QuestType type;
	private int amount;
	private List<String> whitelist;

	public QuestData_mission(QuestType type, int amount, List<String> whitelist) {
		this.setType(type);
		this.setAmount(amount);
		this.setWhitelist(whitelist);
	}

	public QuestType getType() {
		return type;
	}

	public void setType(QuestType type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public List<String> getWhitelist() {
		return whitelist;
	}

	public void setWhitelist(List<String> whitelist2) {
		this.whitelist = whitelist2;
	}
}
