package me.ulrich.clans.data;

import java.util.List;
import java.util.UUID;

public class MailData {

	private UUID id;
	private UUID from;
	private UUID sender;
	private String text;
	private long date;
	private UUID to;
	private List<UUID> readBy;

	public MailData(UUID id, UUID from, UUID to, UUID sender, String text, long date, List<UUID> readBy) {
		this.setId(id);
		this.setFrom(from);
		this.setTo(to);
		this.setSender(sender);
		this.setText(text);
		this.setDate(date);
		this.setReadBy(readBy);
		
	
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}


	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public UUID getTo() {
		return to;
	}

	public void setTo(UUID to) {
		this.to = to;
	}

	public UUID getFrom() {
		return from;
	}

	public void setFrom(UUID from) {
		this.from = from;
	}

	public List<UUID> getReadBy() {
		return readBy;
	}

	public void setReadBy(List<UUID> readBy) {
		this.readBy = readBy;
	}

	public UUID getSender() {
		return sender;
	}

	public void setSender(UUID sender) {
		this.sender = sender;
	}


}
