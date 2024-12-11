package me.ulrich.clans.data;

public class SpawnedEntityData {

	private int id;
	private long lastMove;
	private boolean afk;
	private int passager;

	public SpawnedEntityData(int id, long lastMove, boolean afk, int passager) {
		this.setId(id);
		this.setLastMove(lastMove);
		this.setAfk(afk);
		this.setPassager(passager);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getLastMove() {
		return lastMove;
	}

	public void setLastMove(long lastMove) {
		this.lastMove = lastMove;
	}

	public boolean isAfk() {
		return afk;
	}

	public void setAfk(boolean afk) {
		this.afk = afk;
	}

	public int getPassager() {
		return passager;
	}

	public void setPassager(int passager) {
		this.passager = passager;
	}
}
