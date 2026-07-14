package me.ulrich.clans.interfaces;

import java.util.UUID;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.AllyInviteReturn;
import me.ulrich.clans.data.ClanEnum.RivalAllyCount;
import me.ulrich.clans.data.ClanEnum.RivalRemoveReturn;

public interface RivalAllyModuleAPI {

	public String parseText(UUID player, String text);
	
	public int allyRivalCount(ClanData clan, RivalAllyCount type);
	
	public AllyInviteReturn allySend(UUID senderid1, UUID receiverid2, boolean mult);
	
	public boolean allyAdd(UUID clanid1, UUID clanid2);
	
	public boolean allyRemove(UUID clanid1, UUID clanid2);

	public RivalRemoveReturn rivalRemoveSend(UUID senderid1, UUID receiverid2, boolean mult);

	public boolean rivalAdd(UUID clanid1, UUID clanid2);

	public boolean rivalRemove(UUID clanid1, UUID clanid2);

	public boolean isClanAlly(UUID clan1UUID, UUID clan2UUID);

	public boolean isClanRival(UUID clan1UUID, UUID clan2UUID);
	
	public boolean isRival(UUID playerUUID1, UUID playerUUID2);

	public boolean isAlly(UUID player1, UUID player2);

	
}
