package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import com.github.Anon8281.universalScheduler.scheduling.schedulers.TaskScheduler;
import com.github.Anon8281.universalScheduler.scheduling.tasks.MyScheduledTask;

import dev.triumphteam.gui.builder.item.ItemBuilder;
import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.GuiItem;
import dev.triumphteam.gui.guis.PaginatedGui;
import dev.triumphteam.gui.guis.StorageGui;
import me.ulrich.clans.data.AddonGuiItemsData;
import me.ulrich.clans.data.ClanEnum.TranslatableKey;
import me.ulrich.clans.tasks.AsyncTaskExecutor;
import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import net.megavex.scoreboardlibrary.api.sidebar.Sidebar;

public interface LibAPI {

	boolean showScoreboard(Player player, String title, List<String> lines);

	void hideScoreboard(Player player);
	
	ConcurrentHashMap<UUID, Sidebar> getBoards();
	
	String getDefaultBanner();

	void setDefaultBanner(String defaultBanner);
	
	void customBossBar(Player player, BossBar.Color barcolor, BossBar.Overlay barstyle, List<BossBar.Flag> flags, String message, int seconds, boolean animated, List<String> data);

	void removeAllBar(UUID uuid);
	
	void resetTitle(Player p);
	
	void sendTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendSubTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendTitleSubTitle(Player p, String msg, String msg2, int fadeIn, int stay, int fadeOut);

	void sendActionBar(Player p, String message);

	String getPluginTag();
	
	BukkitAudiences getAdventure();

	boolean isUseGUI();

	String translate(TranslatableKey trans, String object, String... args);

	String translateOutReference(String key, String object, String... args);
	
	boolean isTaskInitialized();
	
	boolean hasBossbarTask(UUID playerUUID);
	
	Optional<MyScheduledTask> getBossbarTask(UUID playerUUID);
	
	boolean stopBossbarTask(UUID playerUUID);
	
	Optional<MyScheduledTask> createBossbarTask(UUID playerUUID, MyScheduledTask task);
	
	boolean hasLibTask(UUID playerUUID);
	
	Optional<MyScheduledTask> getLibTask(UUID playerUUID);
	
	boolean stopLibTask(UUID playerUUID);
	
	Optional<MyScheduledTask> createLibTask(UUID playerUUID, MyScheduledTask task);
	
	boolean isFolia();
	
	TaskScheduler getScheduler();
	
	AsyncTaskExecutor getAsyncTaskExecutor();
	
	ConcurrentHashMap<UUID, MyScheduledTask> getBossbarTasks();
	
	ConcurrentHashMap<UUID, MyScheduledTask> getLibTasks();

	boolean playSoundForAll(String sound);

	void playSoundForAll(List<String> sounds);

	boolean playSound(Player p, List<String> sounds);

	boolean playSound(Player p, String sound);
	
	void filler(PaginatedGui gui, AddonGuiItemsData item, GuiItem asGuiItem_item);
	
	void filler(StorageGui gui, AddonGuiItemsData item, GuiItem asGuiItem_item);
	
	void filler(Gui gui, AddonGuiItemsData item, GuiItem asGuiItem_item);
	
	ItemBuilder mountItem(AddonGuiItemsData item, UUID playerUUID, List<String> list);
	
	ItemBuilder mountItem(AddonGuiItemsData item, ItemStack base, UUID playerUUID, List<String> list);
	
	ItemBuilder createBaseItem(AddonGuiItemsData item, UUID playerUUID);
	
	ItemBuilder changeTooltip(ItemBuilder stack, boolean hideTooltip);
	
	ItemStack addItemFlag(ItemStack stack, ItemFlag flag);
	
	
	
}
