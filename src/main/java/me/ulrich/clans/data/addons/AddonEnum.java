package me.ulrich.clans.data.addons;

public class AddonEnum {

	public enum CoinType{
		POINT, MONEYBANK, LEAGUEPOINT;
	}
	
	public enum Coin{
		VIRTUAL, PHYSICAL;
	}
	
	public enum FarmAction{
		MINER, FISHING, MOB, PLAYER;
	}
	
	public enum ArenaMode{
		FFA, NORMAL;
	}
	
	public enum EventPoint {
		NULLED, SPAWN1, SPAWN2, EXIT, LOBBY;
	}
	
	public enum EventCause{
		NULLED, LESS_THAN_2, WINNER, LESS_PLAYERS_DIFFERENCE, CLAN_NOT_FOUND, CONTINUE;
	}
	
	// QUEST
	public enum QuestMode{
		PLAYER, CLAN;
	}
	
	public enum QuestMissionType {
		DAILY, ONCE;
	}
	
	public enum WeekDayType {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	public enum QuestStatus{
		FINISHED, INCOURSE;
	}
	
	public enum QuestWarn {
		EXPIRED, FINISHED, EARNED,
		;
	}
	
	public enum QuestType {
		BREAK,
		PLACE,
		FISHING,
		CRAFTING,
		SMELT,
		EAT,
		ENCHANTING,
		REPAIR,
		KILL,
		KILL_ENTITY,
		DYE,
		SHEAR,
		TAME,
		BREED,
		MILK,
		COLLECT,
		BAKE,
		STRIPLOGS,
		PICKUP,
		EXPLODE,
		CLANWAR,
		CLANLEVEL,
		EXP,
		MYTHIC,
		TELEPORT,
		THROWN,
		ELYTRA,
		EXPLORE,
		LEVELLED,
		CMI_ANVIL,
		VTRADE2,
		KOTH,
		OUTPOST
		;
	}
	// QUEST
	
	
	// LEAGUE
	public enum LeagueEventAction {
		ADD, REMOVE, CLEAR;
	}
	
	public enum LeagueStatus{
		FINISHED, STARTED, WAITING;
	}
	
	public enum LeagueTime {
		ALL, DAILY, WEEKLY, MONTHLY, YEARLY;
	}
	
	public enum ClaimRewards{
		CLAN, LEADER, PERMISSION;
	}
	

	public enum LeagueDataType{
		LEAGUEPOINTRECEIVED, LEAGUEPOINTLOST, LEAGUECLANWINNER, LEAGUESTARTED, LEAGUEFINISH_NOWINNER, LEAGUEFINISHWINNER;
	}
	
	// LEAGUE
	
	
	//LEADERBOARD
	public enum LookType{
		SIGN, ARMOR_STAND;
	}
	
	public enum UpType{
		HEAD, WALL_HEAD, ARMOR_STAND;
	}
	
	public enum UpLoc{
		CIMA, ATRAS;
	}
	
	public enum BoardClickType{
		SKULL, SIGN, STAND;
	}
	
	public enum BoardClickAction{
		CHAT, GUI;
	}
	//LEADERBOARD
	
	//LAND
	public enum ClaimResponse{
		HASLAND, ERRORCLAIM, SUCCESSCLAIM, VERYCLOSE, NOCLAN, NOBANNER, DISABLEDREGION;
	}
	
	public enum ClaimChanges{
		TELEPORT, START, VERYFARAWAY, VERYCLOSE, TINY, FINISH, CANCELED, CLAIMED, NEARLAND, VIEW;
	}
	
	public enum MovementWay {
		MOVE, TELEPORT, SPAWN, DISCONNECT, CHANGEWORLD;
	}
	
	public enum LandFlags {
		monster_spawn, animal_spawn, leaf_decay, pvp, water_flow, lava_flow, tnt, mob_grief;
	}

	public enum LandExpandDirection {
		UP, DOWN, VERT;
	}
	
	public enum LandHoloOrientation{
		SW, NE, CENTER;
	}
	
	public enum EconUse{
		CLANBASE, BANK;
	}
	
	public enum ClaimMode{
		CUBOID, SELECT, CHUNK;
	}
	//LAND
	
	//NEXUS
	
	public enum NexusClaimResponse{
		HASLAND, ERRORCLAIM, SUCCESSCLAIM, VERYCLOSE, NOCLAN, NOBANNER, DISABLEDREGION, COLLIDINGTERRAIN;
	}

	public enum NexusAlert{
		UNDERATTACK, NEXUSREGENERATED, ATTACKSTOPPED, NEXUSDOWN, SHIELDDOWN, CREATE, 
	}
	
	public enum NexusSettings{
		VISITATION,
		PICKUP,
		DROP,
		ENTITY_INTERACT,
		ENTITY_DAMAGE,
		OTHER_INTERACT,
		BREAK,
		PLACE,
		ITEM_CONSUME;
	}
	
	public enum NexusVerifyEvent{
	
		PICKUP,
		DROP,
		ENTITY_INTERACT,
		ENTITY_DAMAGE,
		OTHER_INTERACT,
		BREAK,
		PLACE,
		ITEM_CONSUME;
		
	}
	
	public enum InteractionType {
	    INTERACT_GENERAL,
	    INTERACT_CONTAINER,
	    INTERACT_DOOR,
	    INTERACT_TRAPDOOR,
	    INTERACT_MECHANISM,
	    INTERACT_VILLAGER, 
	    INTERACT_PAINTING
	}
	
	public enum NexusEffect{
		DAMAGE, REGENERATE, SHIELDDOWN, NEXUSDOWN, CREATED, FEED;
	}
	


	public enum StructureSettingsBooleans{
		
		ENABLED, PLAYERCANUSE,REPLACEAIR, REPLACEBUSY;
	}
	
	public enum StructureSettingsStrings{
		
		PERMISSION, NAME;
	}
	
	public enum NexusDataType{
		WILDERNESSENTER, NEXUSENTER, NEXUSCREATE, NEXUSBANNED, NEXUSINSIDE;
	}
	
	public enum NexusPowerMode{
		KDR, LEVEL, ENTITY;
	}
	
	public enum NexusChargeFrom{
		PLAYER, BANK;
	}
	//NEXUS
	
}
