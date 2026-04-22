package me.ulrich.clans.interfaces;

import java.util.List;

import net.kyori.adventure.text.Component;

public interface ColorAPI {

	String removeDecoration(String msg, List<String> decoration);
	Component addMiniColor(String msg);
	Component addMiniColor(String msg, boolean limite);
	String toLegacyColor(String msg);
	String toCodeColor(String msg);
	String removeColor(String msg);
	String parseLegacytoCode(String msg);
	String parseCodeToLegacy(String msg);
}
