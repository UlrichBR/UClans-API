package me.ulrich.clans.data.addons;

public class NexusPowerData {

	private int power;
	private int claimGain;
	private int powerLoseAmount;
	private int finalPower;
	private int max;

	public NexusPowerData(int power, int claimGain, int powerLoseAmount, int finalPower, int max) {
		this.setPower(power);
		this.setClaimGain(claimGain);
		this.setPowerLoseAmount(powerLoseAmount);
		this.setFinalPower(finalPower);
		this.setMax(max);
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getClaimGain() {
		return claimGain;
	}

	public void setClaimGain(int claimGain) {
		this.claimGain = claimGain;
	}

	public int getPowerLoseAmount() {
		return powerLoseAmount;
	}

	public void setPowerLoseAmount(int powerLoseAmount) {
		this.powerLoseAmount = powerLoseAmount;
	}

	public int getFinalPower() {
		return finalPower;
	}

	public void setFinalPower(int finalPower) {
		this.finalPower = finalPower;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
}
