package me.ulrich.clans.api;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import me.ulrich.clans.data.InviteData;
import me.ulrich.clans.interfaces.InviteAPI;

public class PlayerInviteAPIManager implements InviteAPI {

	@Override
	public void saveInviteData(InviteData clan) {
		
	}

	@Override
	public void deleteInviteData(UUID clanId) {
		
	}

	@Override
	public void reloadInviteData(UUID clanId) {
		
	}

	@Override
	public void loadAllInviteData() {
		
	}

	@Override
	public boolean hasInvite(UUID playerUUID) {
		return false;
	}

	@Override
	public List<InviteData> getInvites(UUID playerUUID) {
		return null;
	}

	@Override
	public boolean hasInvite(UUID playerUUID, UUID inviteUUID) {
		return false;
	}

	@Override
	public Optional<InviteData> getInvite(UUID playerUUID, UUID inviteUUID) {
		return Optional.empty();
	}

	@Override
	public boolean hasClanInvite(UUID playerUUID, UUID clanUUID) {
		return false;
	}

	@Override
	public boolean hasClanInvite(UUID clanUUID) {
		return false;
	}

	@Override
	public boolean deleteClanInviteByClanID(UUID clanUUID) {
		return false;
	}

	@Override
	public Optional<InviteData> getClanInvite(UUID playerUUID, UUID clanUUID) {
		return Optional.empty();
	}

	@Override
	public boolean removeInvites(UUID playerUUID) {
		return false;
	}

	@Override
	public boolean removeInvites(UUID playerUUID, UUID inviteUUID) {
		return false;
	}

	@Override
	public boolean canReceiveInvitations(UUID playerUUID) {
		return false;
	}

	@Override
	public boolean createInvite(UUID playerUUID, UUID clanUUID, UUID inviter) {
		return false;
	}

	@Override
	public boolean inviteAccept(UUID playerUUID, UUID inviteUUID) {
		return false;
	}

	@Override
	public boolean inviteDeny(UUID playerUUID, UUID inviteUUID) {
		return false;
	}

	@Override
	public ConcurrentHashMap<UUID, List<InviteData>> getInviteData() {
		return null;
	}

	@Override
	public void setInviteData(ConcurrentHashMap<UUID, List<InviteData>> inviteData) {
		
	}

}
