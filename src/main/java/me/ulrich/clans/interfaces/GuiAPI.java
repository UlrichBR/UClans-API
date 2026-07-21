package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.PaginatedGui;
import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.GuiData;
import me.ulrich.clans.data.ClanEnum.PlaceholderPlayerTop;
import me.ulrich.clans.data.ClanEnum.PlaceholderTop;

public interface GuiAPI {

	ConcurrentHashMap<String, GuiData> getInsertGui();

	List<Player> getOpenedGuiPlayers();

	void closeAllOpened();

	void insertItens(Gui gui, String string, String string2, Player player);

	void insertItens(PaginatedGui gui, String string, String string2, Player player);

	void close(Player player);

	boolean useTitleAlerts();

	
	//GENERAL
	void openChangeLeaderConfirm(final Player player, UUID newLEader, String title);

	void openNoClanHome(final Player player);

	void openClanHome(Player player);

	void openClanMembersInvite(Player player, String timed);

	void openClanSearchMembersInvite(Player player, String search, String timed);

	void openClanStats(Player player, ClanData clan, String timed);
	
	//PAGINATION
	void openClansListMembers(Player player, UUID clanUUID, boolean onlines);
	
	void openClanTop(final Player player, PlaceholderTop top, int page, boolean only_open);
	
	void openPlayerTop(final Player player, PlaceholderPlayerTop top, int page, boolean online, boolean whitout);
	
	//PROFILE
	void openProfileInvites(Player player, String timed);
	
	void openPlayerProfile(final Player player, UUID uuid, String timed);
	
	void openPlayerPermissions(Player player, UUID profileUUID, Optional<String> timed);
	
	void openPlayerProfileSettings(final Player player, String timed);
	
	void openPlayerLanguages(Player player, Optional<String> timed);
	
	//SETTINGS
	void openClanSettings(Player player, String timed);
	
	void openBannedMembers(Player player, String timed);
	
	void openClanActions(Player player, String timed);

	void openDisbandConfirm(final Player player, String title);
	
	void openClanRoles(Player player, String timed);
	
	void openClanRolesEditor(Player player, int page, String id, String timed);
}
