package me.ulrich.clans.data;

public class AddonInfo {
    private boolean enabled;
    private String data;

    public AddonInfo(boolean enabled, String data) {
        this.enabled = enabled;
        this.data = data;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getData() {
        return data;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setData(String data) {
        this.data = data;
    }
}
