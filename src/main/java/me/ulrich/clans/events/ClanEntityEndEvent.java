package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanEntityEndEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID playerSender;
	private final int entityID;

    public ClanEntityEndEvent(UUID playerSender, int entityID) {

    	this.playerSender = playerSender;
    	this.entityID = entityID;

    }
    
	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

	public UUID getPlayerSender() {
		return playerSender;
	}

	public int getEntityID() {
		return entityID;
	}



}
