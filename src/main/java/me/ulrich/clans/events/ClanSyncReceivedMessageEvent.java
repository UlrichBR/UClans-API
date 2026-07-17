package me.ulrich.clans.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.ulrich.clans.data.ClanEnum.DebugType;


public class ClanSyncReceivedMessageEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	
	private String data;
	private DebugType type;

    public ClanSyncReceivedMessageEvent(DebugType type, String data) {
    	this.setType(type);
    	this.setData(data);

    }
 
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public DebugType getType() {
		return type;
	}

	public void setType(DebugType type) {
		this.type = type;
	}


}
