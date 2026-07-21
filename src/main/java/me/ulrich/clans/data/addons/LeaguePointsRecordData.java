package me.ulrich.clans.data.addons;

public class LeaguePointsRecordData {
    private double added;
    private double removed;

    public LeaguePointsRecordData(double added, double removed) {
        this.added = added;
        this.removed = removed;
    }

    public double getAdded() {
        return added;
    }

    public double getRemoved() {
        return removed;
    }

    public double getTotal() {
        return added - removed;
    }
}