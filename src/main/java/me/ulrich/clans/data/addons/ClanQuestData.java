package me.ulrich.clans.data.addons;

import java.util.UUID;

import me.ulrich.clans.data.addons.AddonEnum.QuestStatus;



public class ClanQuestData {

	private UUID islandUuid;
	private String quest;
	private QuestStatus status;
	private UUID player;
	private Long start;
	private int earned;

	public ClanQuestData(UUID islandUuid, String quest, QuestStatus status, UUID player, Long start, int earned) {
		this.setIslandUuid(islandUuid);
		this.setQuest(quest);
		this.setStatus(status);
		this.setPlayer(player);
		this.setStart(start);
		this.setEarned(earned);
	}



	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	public QuestStatus getStatus() {
		return status;
	}

	public void setStatus(QuestStatus status) {
		this.status = status;
	}

	public UUID getPlayer() {
		return player;
	}

	public void setPlayer(UUID player) {
		this.player = player;
	}

	public Long getStart() {
		return start;
	}

	public void setStart(Long start) {
		this.start = start;
	}



	public UUID getIslandUuid() {
		return islandUuid;
	}



	public void setIslandUuid(UUID islandUuid) {
		this.islandUuid = islandUuid;
	}



	public int getEarned() {
		return earned;
	}



	public void setEarned(int earned) {
		this.earned = earned;
	}
}

