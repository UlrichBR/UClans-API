package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import me.ulrich.clans.data.InviteData;

public interface InviteAPI {

	

	public void saveInviteData(InviteData clan);

	public void deleteInviteData(UUID clanId);

	public void reloadInviteData(UUID clanId);

	public void loadAllInviteData();

	public boolean hasInvite(UUID playerUUID);

	public List<InviteData> getInvites(UUID playerUUID);


	public boolean hasInvite(UUID playerUUID, UUID inviteUUID);

	public Optional<InviteData> getInvite(UUID playerUUID, UUID inviteUUID);

	public boolean hasClanInvite(UUID playerUUID, UUID clanUUID);

	public boolean hasClanInvite(UUID clanUUID);

	public boolean deleteClanInviteByClanID(UUID clanUUID);




	public Optional<InviteData> getClanInvite(UUID playerUUID, UUID clanUUID);

	public boolean removeInvites(UUID playerUUID);

	public boolean removeInvites(UUID playerUUID, UUID inviteUUID);

	public boolean canReceiveInvitations(UUID playerUUID);

	public boolean createInvite(UUID playerUUID, UUID clanUUID, UUID inviter);



	public boolean inviteAccept(UUID playerUUID, UUID inviteUUID);

	public boolean inviteDeny(UUID playerUUID, UUID inviteUUID);



	public ConcurrentHashMap<UUID, List<InviteData>> getInviteData();

	public void setInviteData(ConcurrentHashMap<UUID, List<InviteData>> inviteData);
}
