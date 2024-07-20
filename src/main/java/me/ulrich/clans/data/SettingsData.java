package me.ulrich.clans.data;

import java.util.Optional;



public class SettingsData {

	private boolean warInvite;
	private boolean allySharedChat;
	private boolean joinLeave;
	private boolean allySharedHome;
	private boolean opened;
	private boolean publicHomes;
	private boolean receveMailAllies;
	private boolean receiveMailAll;
	private Optional<String> jsonMeta;

	public SettingsData(Optional<String> jsonMeta, boolean warInvite, boolean allySharedChat, boolean joinLeave, boolean allySharedHome, boolean opened, boolean publicHomes, boolean receveMailAllies, boolean receiveMailAll) {
		this.setWarInvite(warInvite);
		this.setAllySharedChat(allySharedChat);
		this.setJoinLeave(joinLeave);
		this.setAllySharedHome(allySharedHome);
		this.setOpened(opened);
		this.setPublicHomes(publicHomes);
		this.setReceveMailAllies(receveMailAllies);
		this.setReceiveMailAll(receiveMailAll);
		this.setJsonMeta(jsonMeta);

	}

	public boolean isWarInvite() {
		return warInvite;
	}

	public void setWarInvite(boolean warInvite) {
		this.warInvite = warInvite;
	}

	public boolean isAllySharedChat() {
		return allySharedChat;
	}

	public void setAllySharedChat(boolean allySharedChat) {
		this.allySharedChat = allySharedChat;
	}

	public boolean isJoinLeave() {
		return joinLeave;
	}

	public void setJoinLeave(boolean joinLeave) {
		this.joinLeave = joinLeave;
	}

	public boolean isAllySharedHome() {
		return allySharedHome;
	}

	public void setAllySharedHome(boolean allySharedHome) {
		this.allySharedHome = allySharedHome;
	}


	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	public boolean isPublicHomes() {
		return publicHomes;
	}

	public void setPublicHomes(boolean publicHomes) {
		this.publicHomes = publicHomes;
	}

	public boolean isReceveMailAllies() {
		return receveMailAllies;
	}

	public void setReceveMailAllies(boolean receveMailAllies) {
		this.receveMailAllies = receveMailAllies;
	}

	public boolean isReceiveMailAll() {
		return receiveMailAll;
	}

	public void setReceiveMailAll(boolean receiveMailAll) {
		this.receiveMailAll = receiveMailAll;
	}

	public Optional<String> getJsonMeta() {
		return jsonMeta;
	}

	public void setJsonMeta(Optional<String> jsonMeta) {
		this.jsonMeta = jsonMeta;
	}
}
