package me.ulrich.clans.data;

import java.util.Optional;

public class HomesData {

	private String server;
	private String loc;
	private String name;
	private Optional<String> password;

	public HomesData(String server, String name, String loc, Optional<String> password) {
		this.setServer(server);
		this.setName(name);
		this.setLoc(loc);
		this.setPassword(password);
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<String> getPassword() {
		return password;
	}

	public void setPassword(Optional<String> password) {
		this.password = password;
	}
	
}
