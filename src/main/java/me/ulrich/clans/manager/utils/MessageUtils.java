package me.ulrich.clans.manager.utils;

import java.util.List;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.ChatDataType;
import me.ulrich.clans.data.ClanEnum.MsgUsage;
import me.ulrich.clans.data.CommandData;
import net.kyori.adventure.text.Component;


public class MessageUtils {

	public static void sendCommandJson(CommandSender player, CommandData comander, MsgUsage key, List<String> data) {

	}

	public static void sendSubCommandJson(CommandSender player, CommandData comander, String sub, MsgUsage key, List<String> data) {

	}

	public static void sendText(UUID playerUUID, String text) {

	}

	public static void sendText(CommandSender sender, String text) {

	}

	public static void sendText(CommandSender sender, Component text) {

	}

	public static void sendBroadcast(String text) {

	}

	public static String formatClanChat(UUID playerUUID, String message) {
		return null;
	}

	public static void allOnlineMessage(String message, List<String> data, List<Player> excludeplayers) {

	}

	public static void clanMessageJson(ClanData clan, ChatDataType clanlevelreceived, List<String> data) {

	}

	public static void clanMessageSend(ClanData clan, String message) {

	}

	public static void clanMessageSend(ClanData clan, String message, List<UUID> exclude) {

	}

	public static void clanModerationMessageSend(ClanData clan, String message) {

	}


}
