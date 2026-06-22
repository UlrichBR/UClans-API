package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import me.ulrich.clans.data.ClanEnum.MailTime;
import me.ulrich.clans.data.MailData;

public interface MailModuleAPI {
	
	public String parseText(UUID player, String text);
	
	public void SaveMailData(MailData log);

	public void DeleteMailData(UUID logID);

	public void ReloadMailData(UUID logID);
	
	public void ClearMailData(UUID clanId);

	public void LoadAllMailData();

	public boolean hasClanMail(UUID clanUUID);
	
	public List<MailData> getClanMail(UUID clanUUID);
	
	public Optional<MailData> getMailById(UUID id);
	
	public List<MailData> getClanMailTimed(UUID to, UUID playerUUID, MailTime time);
	
	public List<MailData> getFromToMail(UUID from, UUID to);
	
	public boolean removeClanMail(UUID to);
	
	public boolean addReadmail(UUID to, UUID playerUUID);
	
	public boolean clearClanMail(UUID to);

	public boolean addClanMail(UUID sender, UUID from, UUID to, String text);
    
}