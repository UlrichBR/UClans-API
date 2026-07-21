package me.ulrich.clans.api;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.PaginatedGui;
import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.PlaceholderPlayerTop;
import me.ulrich.clans.data.ClanEnum.PlaceholderTop;
import me.ulrich.clans.data.GuiData;
import me.ulrich.clans.interfaces.GuiAPI;

public class GuiAPIManager implements GuiAPI {
	
	public GuiAPIManager(Clans clans) {}
	
	@Override
	public ConcurrentHashMap<String, GuiData> getInsertGui() {
		return null;
	}
	
	@Override
	public List<Player> getOpenedGuiPlayers() {
		return null;
	}
	
	@Override
	public void closeAllOpened() {}

	@Override
	public void insertItens(Gui gui, String string, String string2, Player player) {
		
	}

	@Override
	public void insertItens(PaginatedGui gui, String string, String string2, Player player) {
		
	}

	@Override
	public void close(Player player) {
		
	}

	@Override
	public boolean useTitleAlerts() {
		return false;
	}

	@Override
	public void openChangeLeaderConfirm(Player player, UUID newLEader, String title) {
		
	}

	@Override
	public void openNoClanHome(Player player) {
		
	}

	@Override
	public void openClanHome(Player player) {
		
	}

	@Override
	public void openClanMembersInvite(Player player, String timed) {
		
	}

	@Override
	public void openClanSearchMembersInvite(Player player, String search, String timed) {
		
	}

	@Override
	public void openClanStats(Player player, ClanData clan, String timed) {
		
	}

	@Override
	public void openClansListMembers(Player player, UUID clanUUID, boolean onlines) {
		
	}

	@Override
	public void openClanTop(Player player, PlaceholderTop top, int page, boolean only_open) {
		
	}

	@Override
	public void openPlayerTop(Player player, PlaceholderPlayerTop top, int page, boolean online, boolean whitout) {
		
	}

	@Override
	public void openProfileInvites(Player player, String timed) {
		
	}

	@Override
	public void openPlayerProfile(Player player, UUID uuid, String timed) {
		
	}

	@Override
	public void openPlayerPermissions(Player player, UUID profileUUID, Optional<String> timed) {
		
	}

	@Override
	public void openPlayerProfileSettings(Player player, String timed) {
		
	}

	@Override
	public void openPlayerLanguages(Player player, Optional<String> timed) {
		
	}

	@Override
	public void openClanSettings(Player player, String timed) {
		
	}

	@Override
	public void openBannedMembers(Player player, String timed) {
		
	}

	@Override
	public void openClanActions(Player player, String timed) {
		
	}

	@Override
	public void openDisbandConfirm(Player player, String title) {
		
	}

	@Override
	public void openClanRoles(Player player, String timed) {
		
	}

	@Override
	public void openClanRolesEditor(Player player, int page, String id, String timed) {
		
	}
}
