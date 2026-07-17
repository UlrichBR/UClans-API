package me.ulrich.clans.events;

import java.util.Optional;
import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanMultiserverPingEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private String type;
	private UUID uuid;
	private Optional<Object> out;

	

    public ClanMultiserverPingEvent(String type, UUID uuid, Optional<Object> out) {

    this.setType(type);
    this.setUuid(uuid);
    this.setOut(out);

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public Optional<Object> getOut() {
		return out;
	}

	public void setOut(Optional<Object> out) {
		this.out = out;
	}




}
