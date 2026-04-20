package me.ulrich.clans.interfaces;

import me.ulrich.clans.interfaces.AnvilAction.Type;

public class AnvilAction {

    public enum Type {
        CLOSE,
        KEEP_OPEN,
        UPDATE_TEXT
    }

    private final Type type;
    private final String text;

    public AnvilAction(Type type, String text) {
        this.type = type;
        this.text = text;
    }

    public static AnvilAction close() {
        return new AnvilAction(Type.CLOSE, null);
    }

    public static AnvilAction keep() {
        return new AnvilAction(Type.KEEP_OPEN, null);
    }

    public static AnvilAction update(String text) {
        return new AnvilAction(Type.UPDATE_TEXT, text);
    }
}