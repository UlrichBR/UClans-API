package me.ulrich.clans.api;

import java.util.List;

import me.ulrich.clans.interfaces.ColorAPI;
import net.kyori.adventure.text.Component;

public class ColorAPIManager implements ColorAPI {

	@Override
	public String removeDecoration(String msg, List<String> decoration) {
		return null;
	}

	@Override
	public Component addMiniColor(String msg) {
		return null;
	}

	@Override
	public Component addMiniColor(String msg, boolean limite) {
		return null;
	}

	@Override
	public String toLegacyColor(String msg) {
		return null;
	}

	@Override
	public String toCodeColor(String msg) {
		return null;
	}

	@Override
	public String removeColor(String msg) {
		return null;
	}

	@Override
	public String parseLegacytoCode(String msg) {
		return null;
	}

	@Override
	public String parseCodeToLegacy(String msg) {
		return null;
	}

}
