package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.ulrich.clans.data.ClanEnum.SoulsChangeType;

public class ClanSoulsChangeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanUUID;
	private final SoulsChangeType type;
	private final int souls;

    public ClanSoulsChangeEvent(UUID clanUUID, SoulsChangeType type, int souls) {

    	this.clanUUID = clanUUID;
    	this.type = type;
    	this.souls = souls;

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



	public UUID getClanUUID() {
		return clanUUID;
	}



	public SoulsChangeType getType() {
		return type;
	}



	public int getSouls() {
		return souls;
	}




}
