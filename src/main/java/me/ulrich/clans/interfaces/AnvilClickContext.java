package me.ulrich.clans.interfaces;

import org.bukkit.entity.Player;

public class AnvilClickContext {

    private final Player player;
    private final String text;
    private final int slot;

    public AnvilClickContext(Player player, String text, int slot) {
        this.player = player;
        this.text = text;
        this.slot = slot;
    }

    public Player getPlayer() {
        return player;
    }

    public String getText() {
        return text;
    }

    public int getSlot() {
        return slot;
    }
}
