package me.ulrich.clans.api;

import java.util.HashMap;
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
import me.ulrich.clans.Clans;
import me.ulrich.clans.data.AddonGuiItemsData;
import me.ulrich.clans.data.BossBarData;
import me.ulrich.clans.data.ClanEnum.TranslatableKey;
import me.ulrich.clans.data.CustomChatPrompt;
import me.ulrich.clans.interfaces.LibAPI;
import me.ulrich.clans.tasks.AsyncTaskExecutor;
import net.kyori.adventure.bossbar.BossBar.Color;
import net.kyori.adventure.bossbar.BossBar.Flag;
import net.kyori.adventure.bossbar.BossBar.Overlay;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import net.megavex.scoreboardlibrary.api.sidebar.Sidebar;

public class LibAPIManager implements LibAPI {


	public LibAPIManager(Clans clans) {}
	
	@Override
	public BukkitAudiences getAdventure() {
		return null;
	}
	
	@Override
	public boolean isUseGUI() {
		return false;
	}
	
	@Override
	public String getPluginTag() {
		return null;
	}
	
	public Clans getPlugin() {
		return null;
	}

	@Override
	public String translate(TranslatableKey trans, String object, String... args) {
		return null;
	}
	
	@Override
	@Deprecated
	public String translateOutReference(String key, String object, String... args) {
		return null;
	}

	@Override
	public boolean isTaskInitialized() {
		
		return false;
	}


	@Override
	public boolean hasLibTask(UUID playerUUID) {
		
		return false;
	}

	@Override
	public Optional<MyScheduledTask> getLibTask(UUID playerUUID) {
		
		return Optional.empty();
	}

	@Override
	public boolean stopLibTask(UUID playerUUID) {
		
		return false;
	}

	@Override
	public Optional<MyScheduledTask> createLibTask(UUID playerUUID, MyScheduledTask task) {
		
		return Optional.empty();
	}

	@Override
	public boolean isFolia() {
		
		return false;
	}

	@Override
	public TaskScheduler getScheduler() {
		
		return null;
	}

	@Override
	public ConcurrentHashMap<UUID, MyScheduledTask> getBossbarTasks() {
		
		return null;
	}

	@Override
	public ConcurrentHashMap<UUID, MyScheduledTask> getLibTasks() {
		
		return null;
	}

	@Override
	public boolean playSoundForAll(String sound) {
		return false;
	}

	@Override
	public void playSoundForAll(List<String> sounds) {
		
	}

	@Override
	public boolean playSound(Player p, List<String> sounds) {
		return false;
	}

	@Override
	public boolean playSound(Player p, String sound) {
		return false;
	}

	@Override
	public AsyncTaskExecutor getAsyncTaskExecutor() {
		return null;
	}

	@Override
	public String getDefaultBanner() {
		return null;
	}

	@Override
	public void setDefaultBanner(String defaultBanner) {
		
	}


	@Override
	public void removeAllBar(UUID uuid) {
		
	}

	@Override
	public boolean showScoreboard(Player player, String title, List<String> lines) {
		return false;
	}

	@Override
	public void hideScoreboard(Player player) {
		
	}

	@Override
	public ConcurrentHashMap<UUID, Sidebar> getBoards() {
		return null;
	}

	@Override
	public void filler(PaginatedGui gui, AddonGuiItemsData item, GuiItem asGuiItem_item) {
		
		
	}

	@Override
	public void filler(StorageGui gui, AddonGuiItemsData item, GuiItem asGuiItem_item) {
		
		
	}

	@Override
	public void filler(Gui gui, AddonGuiItemsData item, GuiItem asGuiItem_item) {
		
		
	}

	@Override
	public ItemBuilder mountItem(AddonGuiItemsData item, UUID playerUUID, List<String> list) {
		
		return null;
	}

	@Override
	public ItemBuilder mountItem(AddonGuiItemsData item, ItemStack base, UUID playerUUID, List<String> list) {
		
		return null;
	}

	@Override
	public ItemBuilder createBaseItem(AddonGuiItemsData item, UUID playerUUID) {
		
		return null;
	}

	@Override
	public ItemBuilder changeTooltip(ItemBuilder stack, boolean hideTooltip) {
		
		return null;
	}

	@Override
	public ItemStack addItemFlag(ItemStack stack, ItemFlag flag) {
		
		return null;
	}

	@Override
	public HashMap<UUID, BossBarData> getBossBarData() {
		
		return null;
	}

	@Override
	public void removeBar(UUID barUUID) {
		
		
	}

	@Override
	public void removeAllBar(Player player) {
		
		
	}

	@Override
	public void removeAllBar() {
		
		
	}

	@Override
	public UUID customBossBar(Player player, Color barcolor, Overlay barstyle, List<Flag> flags, String message,
			int seconds, boolean animated, List<String> data) {
		
		return null;
	}

	@Override
	public HashMap<UUID, MyScheduledTask> getActivetasks() {
		
		return null;
	}

	@Override
	public boolean hasChat(Player player) {
		return false;
	}

	@Override
	public boolean startChat(Player player, CustomChatPrompt prompt) {
		return false;
	}

	@Override
	public void handleInput(Player player, String rawMessage) {
		
	}

	@Override
	public boolean cancelChat(Player player) {
		return false;
	}

	@Override
	public boolean cancelChat(Player player, boolean triggerTimeoutCallback) {
		return false;
	}

}
