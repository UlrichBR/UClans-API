package me.ulrich.clans.data;

import java.util.Optional;

public class RequerimentData_Return {

	private String requiredValue;
	private Optional<String> trueMessage;
	private Optional<String> falseMessage;

	public RequerimentData_Return(String requiredValue, Optional<String> trueMessage, Optional<String> falseMessage) {
		this.setRequiredValue(requiredValue);
		this.setTrueMessage(trueMessage);
		this.setFalseMessage(falseMessage);
	}


	public Optional<String> getTrueMessage() {
		return trueMessage;
	}

	public void setTrueMessage(Optional<String> trueMessage) {
		this.trueMessage = trueMessage;
	}

	public Optional<String> getFalseMessage() {
		return falseMessage;
	}

	public void setFalseMessage(Optional<String> falseMessage) {
		this.falseMessage = falseMessage;
	}


	public String getRequiredValue() {
		return requiredValue;
	}


	public void setRequiredValue(String requiredValue) {
		this.requiredValue = requiredValue;
	}
}
