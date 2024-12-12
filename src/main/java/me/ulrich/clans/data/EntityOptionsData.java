package me.ulrich.clans.data;

public class EntityOptionsData {

	private boolean baby;
	private boolean glowing;
	private boolean invisible;
	private boolean base;
	private boolean arms;
	private boolean tamed;

	public EntityOptionsData(boolean baby, boolean glowing, boolean invisible, boolean base, boolean arms, boolean tamed) {
		this.setBaby(baby);
		this.setGlowing(glowing);
		this.setInvisible(invisible);
		this.setBase(base);
		this.setArms(arms);
		this.setTamed(tamed);
	}

	public boolean isBaby() {
		return baby;
	}

	public void setBaby(boolean baby) {
		this.baby = baby;
	}

	public boolean isInvisible() {
		return invisible;
	}

	public void setInvisible(boolean invisible) {
		this.invisible = invisible;
	}

	public boolean isGlowing() {
		return glowing;
	}

	public void setGlowing(boolean glowing) {
		this.glowing = glowing;
	}

	public boolean isBase() {
		return base;
	}

	public void setBase(boolean base) {
		this.base = base;
	}

	public boolean isTamed() {
		return tamed;
	}

	public void setTamed(boolean tamed) {
		this.tamed = tamed;
	}

	public boolean isArms() {
		return arms;
	}

	public void setArms(boolean arms) {
		this.arms = arms;
	}
}
