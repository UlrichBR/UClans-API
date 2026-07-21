package me.ulrich.clans.data.addons;

public class LandsData_flags {

	
	private boolean monster_spawn;
	private boolean animal_spawn;
	private boolean leaf_decay;
	private boolean pvp;
	private boolean lava_flow;
	private boolean water_flow;
	private boolean tnt;
	private boolean mob_grief;

	/*
	 * monster_spawn
	 * animal_spawn
	 * leaf_decay
	 * pvp
	 * water_flow
	 * lava_flow
	 * tnt
	 * mob_grief
	 * */
	
	public LandsData_flags(boolean monster_spawn, boolean animal_spawn, boolean leaf_decay, boolean pvp, boolean water_flow, boolean lava_flow, boolean tnt, boolean mob_grief) {
		
		this.setMonster_spawn(monster_spawn);
		this.setAnimal_spawn(animal_spawn);
		this.setLeaf_decay(leaf_decay);
		this.setPvp(pvp);
		this.setWater_flow(water_flow);
		this.setLava_flow(lava_flow);
		this.setTnt(tnt);
		this.setMob_grief(mob_grief);
	}

	public boolean isMonster_spawn() {
		return monster_spawn;
	}

	public void setMonster_spawn(boolean monster_spawn) {
		this.monster_spawn = monster_spawn;
	}

	public boolean isAnimal_spawn() {
		return animal_spawn;
	}

	public void setAnimal_spawn(boolean animal_spawn) {
		this.animal_spawn = animal_spawn;
	}

	public boolean isLeaf_decay() {
		return leaf_decay;
	}

	public void setLeaf_decay(boolean leaf_decay) {
		this.leaf_decay = leaf_decay;
	}

	public boolean isPvp() {
		return pvp;
	}

	public void setPvp(boolean pvp) {
		this.pvp = pvp;
	}

	public boolean isLava_flow() {
		return lava_flow;
	}

	public void setLava_flow(boolean lava_flow) {
		this.lava_flow = lava_flow;
	}

	public boolean isTnt() {
		return tnt;
	}

	public void setTnt(boolean tnt) {
		this.tnt = tnt;
	}

	public boolean isWater_flow() {
		return water_flow;
	}

	public void setWater_flow(boolean water_flow) {
		this.water_flow = water_flow;
	}

	public boolean isMob_grief() {
		return mob_grief;
	}

	public void setMob_grief(boolean mob_grief) {
		this.mob_grief = mob_grief;
	}
}
