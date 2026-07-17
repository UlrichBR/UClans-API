package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.ulrich.clans.data.ClanEnum.RedisType;

public class ClanMultiserverPingEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private RedisType type;
	private UUID uuid;

	

    public ClanMultiserverPingEvent(RedisType type, UUID uuid) {

    this.setType(type);
    this.setUuid(uuid);

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

	public RedisType getType() {
		return type;
	}

	public void setType(RedisType type) {
		this.type = type;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}




}
