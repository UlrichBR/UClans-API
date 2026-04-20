package me.ulrich.clans.data;

public class AnvilResult {

    public enum Type {
        CLOSE,
        CANCELLED,
        COMPLETED,
        REPLACED
    }

    private final Type type;
    private final String input;

    public AnvilResult(Type type, String input) {
        this.type = type;
        this.input = input;
    }

    public Type getType() {
        return type;
    }

    public String getInput() {
        return input;
    }

    public static AnvilResult close(String input) {
        return new AnvilResult(Type.CLOSE, input);
    }

    public static AnvilResult completed(String input) {
        return new AnvilResult(Type.COMPLETED, input);
    }
}
