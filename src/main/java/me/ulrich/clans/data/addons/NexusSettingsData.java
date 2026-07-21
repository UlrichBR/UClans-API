package me.ulrich.clans.data.addons;

public class NexusSettingsData {
	
	private boolean visitation;
	private boolean drop;
	private boolean pickup;
	private boolean itemConsume;
	private boolean otherInteract;
	private boolean entityInteract;

	public NexusSettingsData(boolean visitation, boolean drop, boolean pickup, boolean itemConsume, boolean otherInteract, boolean entityInteract) {
		this.setVisitation(visitation);
		this.setDrop(drop);
		this.setPickup(pickup);
		this.setItemConsume(itemConsume);
		this.setOtherInteract(otherInteract);
		this.setEntityInteract(entityInteract);
	}

	public boolean isVisitation() {
		return visitation;
	}

	public void setVisitation(boolean visitation) {
		this.visitation = visitation;
	}

	public boolean isDrop() {
		return drop;
	}

	public void setDrop(boolean drop) {
		this.drop = drop;
	}

	public boolean isPickup() {
		return pickup;
	}

	public void setPickup(boolean pickup) {
		this.pickup = pickup;
	}

	public boolean isItemConsume() {
		return itemConsume;
	}

	public void setItemConsume(boolean itemConsume) {
		this.itemConsume = itemConsume;
	}

	public boolean isOtherInteract() {
		return otherInteract;
	}

	public void setOtherInteract(boolean otherInteract) {
		this.otherInteract = otherInteract;
	}

	public boolean isEntityInteract() {
		return entityInteract;
	}

	public void setEntityInteract(boolean entityInteract) {
		this.entityInteract = entityInteract;
	}

}
