package me.ulrich.clans.events;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.google.common.base.Stopwatch;

import me.ulrich.clans.data.ClanEnum.ClansModules;
import me.ulrich.clans.data.ClanEnum.RepoReturn;


public class ModuleEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private RepoReturn RepoReturn;
	private CommandSender commandSender;
	private Stopwatch stopwatch;
    
    public ModuleEvent( CommandSender commandSender, RepoReturn RepoReturn, Stopwatch stopwatch, ClansModules str) {
    	this.setRepoReturn(RepoReturn);
    	this.setCommandSender(commandSender);
    	this.setStopwatch(stopwatch);
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

	public RepoReturn getRepoReturn() {
		return RepoReturn;
	}

	public void setRepoReturn(RepoReturn RepoReturn) {
		this.RepoReturn = RepoReturn;
	}

	public CommandSender getCommandSender() {
		return commandSender;
	}

	public void setCommandSender(CommandSender commandSender) {
		this.commandSender = commandSender;
	}

	public Stopwatch getStopwatch() {
		return stopwatch;
	}

	public void setStopwatch(Stopwatch stopwatch) {
		this.stopwatch = stopwatch;
	}




}
