package me.ulrich.clans.events;

import java.util.Optional;
import java.util.UUID;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanPlayerKickedEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	private final UUID playerKicked;
	private final UUID clanID;
	private final Optional<UUID> sender;
	private Optional<String> reason;

    public ClanPlayerKickedEvent(UUID playerKicked, UUID clanID, Optional<UUID> sender, Optional<String> reason) {
    	this.playerKicked = playerKicked;
    	this.clanID = clanID;
    	this.sender = sender;
    	this.setReason(reason);
    }

	
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

	public UUID getClanID() {
		return clanID;
	}

	public UUID getPlayerKicked() {
		return playerKicked;
	}

	public Optional<UUID> getSender() {
		return sender;
	}

	public Optional<String> getReason() {
		return reason;
	}

	public void setReason(Optional<String> reason) {
		this.reason = reason;
	}




}
