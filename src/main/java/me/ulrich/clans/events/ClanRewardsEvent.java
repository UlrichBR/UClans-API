package me.ulrich.clans.events;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanRewardsEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanUUID;
	private Optional<String> description;
	private List<String> rewards;

    public ClanRewardsEvent(UUID clanUUID, Optional<String> description, List<String> rewards) {

    	this.clanUUID = clanUUID;
    	this.setDescription(description);
    	this.setRewards(rewards);


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


	public List<String> getRewards() {
		return rewards;
	}

	public void setRewards(List<String> rewards) {
		this.rewards = rewards;
	}

	public Optional<String> getDescription() {
		return description;
	}

	public void setDescription(Optional<String> description) {
		this.description = description;
	}



}
