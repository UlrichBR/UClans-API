package me.ulrich.clans.data.addons;

public class NexusStatsData {

	private long lastPVP;

	public NexusStatsData(long lastPVP) {
		this.setLastPVP(lastPVP);
	}

	public long getLastPVP() {
		return lastPVP;
	}

	public void setLastPVP(long lastPVP) {
		this.lastPVP = lastPVP;
	}
}
