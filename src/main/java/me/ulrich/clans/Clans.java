package me.ulrich.clans;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.api.AddonAPIManager;
import me.ulrich.clans.api.AnvilAPIManager;
import me.ulrich.clans.api.BossBarAPIManager;
import me.ulrich.clans.api.ClaimAPIManager;
import me.ulrich.clans.api.ClanAPIManager;
import me.ulrich.clans.api.ColorAPIManager;
import me.ulrich.clans.api.CommandAPIManager;
import me.ulrich.clans.api.DiscordAPIManager;
import me.ulrich.clans.api.EntityAPIManager;
import me.ulrich.clans.api.EventAPIManager;
import me.ulrich.clans.api.GuiAPIManager;
import me.ulrich.clans.api.HologramAPIManager;
import me.ulrich.clans.api.HooksAPIManager;
import me.ulrich.clans.api.LevelAPIManager;
import me.ulrich.clans.api.LibAPIManager;
import me.ulrich.clans.api.LoggerAPIManager;
import me.ulrich.clans.api.MapAPIManager;
import me.ulrich.clans.api.ModerationAPIManager;
import me.ulrich.clans.api.MoneyAPIManager;
import me.ulrich.clans.api.PlayerAPIManager;
import me.ulrich.clans.api.RegionAPIManager;
import me.ulrich.clans.api.RewardsAPIManager;
import me.ulrich.clans.api.ScoreboardAPIManager;
import me.ulrich.clans.api.SyncAPIManager;
import me.ulrich.clans.data.Addon;
import me.ulrich.clans.data.AddonInfo;
import me.ulrich.clans.data.Extension;
import me.ulrich.clans.data.Module;
import me.ulrich.clans.interfaces.UClans;
import me.ulrich.clans.manager.DatabaseManager.DataEnum;

public final class Clans extends JavaPlugin implements UClans{

	private String buildVersion = "V9";
	private String memberVersion = "NONE";
	private boolean entity = false;
	private DataEnum databaseType = DataEnum.YAML;
	private boolean title_alerts = true;
	
	//addon usage
	private HashMap<Addon, AddonInfo> addonEnabledList = new HashMap<Addon, AddonInfo>();
	private HashMap<Extension, Boolean> extensionEnabledList = new HashMap<Extension, Boolean>();
	private HashMap<Module, Boolean> moduleEnabledList = new HashMap<Module, Boolean>();

	private final ClanAPIManager ClanAPI;
	private final PlayerAPIManager PlayerAPI;
	private final MoneyAPIManager MoneyAPI;
	private final HooksAPIManager HooksAPI;
	private final BossBarAPIManager BossBarAPI;
	private final LibAPIManager libAPI;
	private final AddonAPIManager AddonAPI;
	private final ModerationAPIManager modAPI;
	private final LevelAPIManager levelAPI;
	private final CommandAPIManager commandAPI;
	private final LoggerAPIManager loggerAPI;
	private final DiscordAPIManager discordAPI;
	private final SyncAPIManager syncAPI;
	private final RegionAPIManager regionAPI;
	private final ClaimAPIManager claimAPI;
	private final EventAPIManager eventAPI;
	private final HologramAPIManager hologramAPI;
	private final MapAPIManager mapAPI;
	private final ScoreboardAPIManager scoreboardAPI;
	private final GuiAPIManager guiAPI;
	private RewardsAPIManager rewardsAPI;
	private EntityAPIManager entityAPI;
	private AnvilAPIManager anvilAPI;
	private ColorAPIManager colorAPI;


	public Clans() {
		
		this.ClanAPI = null;
		this.PlayerAPI = null;
		this.MoneyAPI = null;
		this.HooksAPI = null;
		this.BossBarAPI = null;
		this.AddonAPI = null;
		this.libAPI = null;
		this.modAPI = null;
		this.levelAPI = null;
		this.commandAPI = null;
		this.loggerAPI = null;
		this.discordAPI = null;
		this.syncAPI = null;
		this.regionAPI = null;
		this.claimAPI = null;
		this.eventAPI = null;
		this.hologramAPI = null;
		this.mapAPI = null;
		this.scoreboardAPI = null;
		this.guiAPI = null;
		this.rewardsAPI = null;
		this.entityAPI = null;
		this.anvilAPI = null;
		this.colorAPI = null;

	}
	
	@Override
	public JavaPlugin getPlugin() {
		return null;
	}

	@Override
	public ClanAPIManager getClanAPI() {
		return null;
	}

	@Override
	public PlayerAPIManager getPlayerAPI() {
		return null;
	}

	@Override
	public LibAPIManager getLibAPI() {
		return null;
	}
	
	@Override
	public MoneyAPIManager getMoneyAPI() {
		return null;
	}

	@Override
	public HooksAPIManager getHooksAPI() {
		return null;
	}

	@Override
	public BossBarAPIManager getBossBarAPI() {
		return null;
	}
	
	@Override
	public AddonAPIManager getAddonAPI() {
		return null;
	}
	
	public HashMap<Addon, AddonInfo> getAddonEnabledList() {
		return null;
	}

	public HashMap<Extension, Boolean> getExtensionEnabledList() {
		return null;
	}
	
	public HashMap<Module, Boolean> getModuleEnabledList() {
		return null;
	}

	@Override
	public void loadAddons() {}

	@Override
	public void startTasks() {}

	@Override
	public void registerEvents() {}

	@Override
	public LevelAPIManager getLevelAPI() {
		return null;
	}

	@Override
	public ModerationAPIManager getModAPI() {
		return null;
	}

	public boolean isUseGUI() {
		return false;
	}

	public CommandAPIManager getCommandAPI() {
		return null;
	}
	
	public LoggerAPIManager getLoggerAPI() {
		return null;
	}
	public DiscordAPIManager getDiscordAPI() {
		return null;
	}

	public SyncAPIManager getSyncAPI() {
		return null;
	}
	public RegionAPIManager getRegionAPI() {
		return null;
	}
	
	public ClaimAPIManager getClaimAPI() {
		return null;
	}
	
	public EventAPIManager getEventAPI() {
		return null;
	}

	@Override
	public HologramAPIManager getHologramAPI() {
		return null;
	}
	
	@Override
	public MapAPIManager getMapAPI() {
		return null;
	}

	@Override
	public void loadExtensions() {		
	}
	
	public ScoreboardAPIManager getScoreboardAPI() {
		return null;
	}
	
	public GuiAPIManager getGuiAPI() {
		return null;
	}

	public RewardsAPIManager getRewardsAPI() {
		return null;
	}
	
	public EntityAPIManager getEntityAPI() {
		return null;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public boolean isEntity() {
		return entity;
	}

	public String getMemberVersion() {
		return memberVersion;
	}

	public DataEnum getDatabaseType() {
		return databaseType;
	}

	public boolean isTitleAlerts() {
		return title_alerts;
	}

	@Override
	public AnvilAPIManager getAnvilAPI() {
		return null;
	}

	public ColorAPIManager getColorAPI() {
		return colorAPI;
	}

	@Override
	public void loadModules() {
		
	}

}
