package me.ulrich.clans.data;

import me.ulrich.clans.manager.utils.VersionUtil;

public class ClanEnum {

	public enum MailTime{
		ALL, READ, UNREAD,
	}
	
	public enum ClansModules {
	    // Módulos específicos por versão (Anvil)
	    Anvil_26("Anvil_26", VersionUtil.VersionEnum.V261),
	    Anvil_1_21("Anvil_1_21", VersionUtil.VersionEnum.V121), // Ou mapeie para V1211 se preferir
	    Anvil_1_20("Anvil_1_20", VersionUtil.VersionEnum.V120),
	    Anvil_1_19("Anvil_1_19", VersionUtil.VersionEnum.V119),
	    Anvil_1_18("Anvil_1_18", VersionUtil.VersionEnum.V118),
	    
	    // Módulos universais (sem versão atrelada)
	    Chat("Chat", null);

	    private final String pluginName;
	    private final VersionUtil.VersionEnum targetVersion;

	    ClansModules(String pluginName, VersionUtil.VersionEnum targetVersion) {
	        this.pluginName = pluginName;
	        this.targetVersion = targetVersion;
	    }

	    public String getPluginName() {
	        return this.pluginName;
	    }

	    public VersionUtil.VersionEnum getTargetVersion() {
	        return this.targetVersion;
	    }
	    
	    /**
	     * Verifica se este módulo é compatível com a versão atual do servidor.
	     */
	    public boolean isCompatibleWithServer() {
	        // Se não tem versão alvo (null), significa que é universal (Banner, Home, etc)
	        if (this.targetVersion == null) {
	            return true; 
	        }
	        
	        // Se for um módulo de Anvil, verifica se a versão limpa do servidor bate com a do enum
	        return VersionUtil.is(this.targetVersion);
	    }
	}
	
	public enum ClansExtensions {
	    CMIHolograms("CMI"),
	    DecentHolograms("DecentHolograms"),
	    Dynmap("dynmap"),
	    ElementalGems("ElementalGems"),
	    Holograms("Holograms"),
	    HolographicDisplays("HolographicDisplays"),
	    PlayerPoints("PlayerPoints"),
	    TokenEnchantMoney("TokenEnchant"),
	    Vault("Vault"),
	    WorldGuardRegion("WorldGuard"),
	    FancyHolograms("FancyHolograms"),
	    GriefPrevention("GriefPrevention"),
	    GriefDefender("GriefDefender"),
	    TAB("TAB"),
	    CMIScoreboard("CMI"),
	    FeatherBoard("FeatherBoard"),
	    SternalBoard("SternalBoard"),
	    SimpleScore("SimpleScore"),
	    BlueMap("BlueMap"),
	    AnimatedScoreboard("AnimatedScoreboard"),
	    Eco("eco"),
	    ProtectionStones("ProtectionStones"),
	    HuskClaims("HuskClaims");

	    private final String pluginName;

	    ClansExtensions(String pluginName) {
	        this.pluginName = pluginName;
	    }

	    public String getPluginName() {
	        return this.pluginName;
	    }
	}
	
	
	public enum ClansAddons{
		ClanBank,
		ClanChest,
		ClanQuest,
		ClanWar,
		ClanGladiator,
		ClanLand,
		ClanLeaderboard,
		ClanNexus,
		ClanLeague,
		ClanFarmCoins;
		
		
	}
	
	public enum ReloadType {
		ALL, ADDONS, CONFIGURATIONS
		
		
	}
	
	public enum RepoReturn {
		ERROR_REPO, ALREADY_UPDATED, ERROR_DOWNLOAD, SUCCESS_DOWNLOAD, SUCCESS_DOWNLOAD_RELOAD, ALREADY_EXISTS, NEED_RELOAD_ADDONS, GENERAL_ERROR
		
		
	}
	
	public enum ClanLangs{
		EN, PL, TR, RU, ES, HU, GE, BR, FR;
	}
	
	
	public enum LoggerTime{
		ALL, DAILY, WEEKLY, MONTHLY, YEARLY,
	}
	

	public enum PlayerLeaveReaction{
		KICK, LEAVE;
	}
	

	
	public enum BannerFilter{
		COMMON, BANNER, HEAD;
	}
	
	public enum EnumExpand {
		VERT, UP, DOWN;
	}
	
	public enum TranslatableKey{
		block, entity, item, biome, color, enchantment, gameMode;
	}
	
	public enum MoneyType{
		VAULT, PLAYERPOINTS, CLANSOULS, TOKENENCHANT, DISABLED, ULTRAECONOMY, ELEMENTALGEMS;
	}
	public enum ImportStorage{
		MYSQL, SQLITE;
	}

	public enum ClanStorage{
		MYSQL, SQLITE, YAML, H2;
	}
	
	public enum MsgUsage{
		help, usage, error, success;
	}

	
	public enum SyncName {
		NULL, UPDATE, CHEST, BROADCAST, CLANCHAT, INVITE, ALLYINVITE, RIVALREMOVE;
	}
	
	public enum AllyInviteReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_INVITED;
	}
	public enum RivalRemoveReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_SENDED;
	}
	public enum WarReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_INVITED;
	}
	public enum EventState {
		STOPED, INLOBBY, STARTED, ENDING, CANCELED, INWAIT;
	}
	
	public enum BuyChestResponse {
		NEEDMONEY, ERROR, SUCCESS;
	}

	public enum PlaceholderTop{
		KILL, DEATH, KDR, MEMBER, BANK, LEVEL, WAR, ALL, POINT, PATENT, SOULS;
	}
	
	public enum PlaceholderPlayerTop{
		ALL, KDR, SOULS;
	}
	
	public enum ClanActions{
		CREATE, NEWMEMBER, REMOVEMEMBER, WARWIN, WARLOSE, NEWALLIANCE, REMOVEALLIANCE, NEWRIVAL, REMOVERIVAL, PROMOTEMEMBER, DEMOTEMEMBER, DEATHMEMBER, KILLMEMBER, CLANVERIFY;
	}
	
	public enum KdrChangeType{
		RESET, KILL, DEATH;
	}
	
	public enum SoulsChangeType{
		RESET, KILL, DEATH;
	}
	
	public enum RivalAllyCount{
		RIVAL, ALLY;
	}
	
	public enum SettingsType{
		WARINVITE, ALLYSHAREDCHAT, JOINLEAVE, ALLYSHAREDHOME, CLANFF, OPENED, PUBLICHOMES, RECEIVEMAILALLIES, RECEIVEMAILALL, ALLYPVP;
	}
	
	public enum PlayerSettingsType{
		INVITATIONS;
	}
	
	public enum RedisType{
		EMPTY, CLANUPDATEUUID, PLAYERUPDATEUUID, INVITEUPDATEUUID, MODERATIONUPDATEUUID, PLAYERTELEPORT, CLANCHAT, CUSTOM, CLEARPRORYEDPLAYERS, PROXYEDPLAYERS, EVENTMESSAGES, CLANREWARDS, CLANMAILS, CLANLOGGER;
	}
	
	public enum SettingsFlagsAccept {
		TRUE, FALSE, TOGGLE;
	}
	
	public enum ClanCommandActions{
		CREATE, DELETE, JOIN, LEAVE, MODTAG;
	}
	
	public enum HoloPreference{
		ANY, CMI, HOLOGRAPHICDISPLAYS, HOLOGRAMS, DECENTHOLOGRAMS;
	}
	
	public enum ChatDataType {
		CHANGENICKNAME, COMMANDUNKNOWNPLAYER, COMMANDUNKNOWNADMIN, CLANLEVELRECEIVED, CLANPATENTRECEIVED, CLANHOMECREATE, CLANCREATE, CLANMODTAG, CLANDESC, INVITERECEIVE, CLANREGROUPRECEIVE, CLANINVITE, CLANALLYRECEIVE, CLANRIVALREMOVE, CLANDISCORDCREATEWEBHOOK;
	}
	
	public enum QueueSync{
		Moderation, ClanAndPlayers, GetInvite, ClanData, UpdateClanPlayers, PlayerData
	}
	
}
