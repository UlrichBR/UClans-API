package me.ulrich.clans.data;

import org.bukkit.entity.Player;
import net.kyori.adventure.bossbar.BossBar;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CustomChatPrompt {

    private final int durationSeconds;
    private final boolean alertOnly;
    private final List<String> chatMessages;
    private final String actionBar;
    private final String title;
    private final String subtitle;
    
    private final String bossBarText;
    private final BossBar.Color bossBarColor;
    private final BossBar.Overlay bossBarOverlay;
    private final List<BossBar.Flag> bossBarFlags;
    private final boolean bossBarAnimated;
    
    // Novas variáveis da Scoreboard
    private final String scoreboardTitle;
    private final List<String> scoreboardLines;
    
    private final String sound;
    private final BiConsumer<Player, String> onInputReceived;
    private final Consumer<Player> onTimeoutOrCancel;

    private CustomChatPrompt(Builder builder) {
        this.durationSeconds = builder.durationSeconds;
        this.alertOnly = builder.alertOnly;
        this.chatMessages = builder.chatMessages;
        this.actionBar = builder.actionBar;
        this.title = builder.title;
        this.subtitle = builder.subtitle;
        this.bossBarText = builder.bossBarText;
        this.bossBarColor = builder.bossBarColor;
        this.bossBarOverlay = builder.bossBarOverlay;
        this.bossBarFlags = builder.bossBarFlags;
        this.bossBarAnimated = builder.bossBarAnimated;
        
        // Atribuição da Scoreboard
        this.scoreboardTitle = builder.scoreboardTitle;
        this.scoreboardLines = builder.scoreboardLines;
        
        this.sound = builder.sound;
        this.onInputReceived = builder.onInputReceived;
        this.onTimeoutOrCancel = builder.onTimeoutOrCancel;
    }

    // Getters
    public int getDurationSeconds() { return durationSeconds; }
    public boolean isAlertOnly() { return alertOnly; }
    public List<String> getChatMessages() { return chatMessages; }
    public String getActionBar() { return actionBar; }
    public String getTitle() { return title; }
    public String getSubtitle() { return subtitle; }
    public String getBossBarText() { return bossBarText; }
    public BossBar.Color getBossBarColor() { return bossBarColor; }
    public BossBar.Overlay getBossBarOverlay() { return bossBarOverlay; }
    public List<BossBar.Flag> getBossBarFlags() { return bossBarFlags; }
    public boolean isBossBarAnimated() { return bossBarAnimated; }
    
    // Getters da Scoreboard
    public String getScoreboardTitle() { return scoreboardTitle; }
    public List<String> getScoreboardLines() { return scoreboardLines; }
    
    public String getSound() { return sound; }
    public BiConsumer<Player, String> getOnInputReceived() { return onInputReceived; }
    public Consumer<Player> getOnTimeoutOrCancel() { return onTimeoutOrCancel; }

	public static class Builder {
        private int durationSeconds = 30;
        private boolean alertOnly = false;
        private List<String> chatMessages = new ArrayList<>();
        private String actionBar, title, subtitle, bossBarText, sound;
        private BossBar.Color bossBarColor = BossBar.Color.RED;
        private BossBar.Overlay bossBarOverlay = BossBar.Overlay.PROGRESS;
        private List<BossBar.Flag> bossBarFlags = new ArrayList<>();
        private boolean bossBarAnimated = false;
        
        // Variáveis no Builder
        private String scoreboardTitle;
        private List<String> scoreboardLines = new ArrayList<>();
        
        private BiConsumer<Player, String> onInputReceived;
        private Consumer<Player> onTimeoutOrCancel;

        public Builder setDuration(int seconds) { this.durationSeconds = seconds; return this; }
        public Builder setAlertOnly(boolean alertOnly) { this.alertOnly = alertOnly; return this; }
        public Builder addChatMessage(String msg) { this.chatMessages.add(msg); return this; }
        public Builder setChatMessages(List<String> msgs) { this.chatMessages = msgs; return this; }
        public Builder setActionBar(String actionBar) { this.actionBar = actionBar; return this; }
        public Builder setTitle(String title, String subtitle) { this.title = title; this.subtitle = subtitle; return this; }
        public Builder setSound(String sound) { this.sound = sound; return this; }
        
        public Builder setBossBar(String text, BossBar.Color color, BossBar.Overlay overlay, List<BossBar.Flag> flags, boolean animated) {
            this.bossBarText = text;
            if (color != null) this.bossBarColor = color;
            if (overlay != null) this.bossBarOverlay = overlay;
            if (flags != null) this.bossBarFlags = flags;
            this.bossBarAnimated = animated;
            return this;
        }

        // Método para definir a Scoreboard
        public Builder setScoreboard(String title, List<String> lines) {
            this.scoreboardTitle = title;
            this.scoreboardLines = lines;
            return this;
        }

        public Builder onResponse(BiConsumer<Player, String> callback) { this.onInputReceived = callback; return this; }
        public Builder onCancel(Consumer<Player> callback) { this.onTimeoutOrCancel = callback; return this; }

        public CustomChatPrompt build() {
            if (!alertOnly && onInputReceived == null) {
                throw new IllegalStateException("O prompt precisa de uma ação de resposta quando não for configurado como alertOnly!");
            }
            return new CustomChatPrompt(this);
        }
    }
}