package me.ulrich.clans.data;

import java.util.concurrent.CompletableFuture;

import org.bukkit.entity.Player;

public interface AnvilSession {

    void close();

    boolean isOpen();

    Player getPlayer();

    CompletableFuture<AnvilResult> getFuture();
}