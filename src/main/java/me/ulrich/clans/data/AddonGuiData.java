package me.ulrich.clans.data;

import java.util.HashMap;

public class AddonGuiData {

	private String id;
	private String title;
	private String opensound;
	private HashMap<String, AddonGuiItemsData> items;
	private int rows;
	private int pageSize;

	public AddonGuiData(String id, String title, int rows, int pageSize, String opensound, HashMap<String, AddonGuiItemsData> items) {
		this.setId(id);
		this.setTitle(title);
		this.setPageSize(pageSize);
		this.setOpensound(opensound);
		this.setRows(rows);
		this.setItems(items);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOpensound() {
		return opensound;
	}

	public void setOpensound(String opensound) {
		this.opensound = opensound;
	}

	public HashMap<String, AddonGuiItemsData> getItems() {
		return items;
	}

	public void setItems(HashMap<String, AddonGuiItemsData> items) {
		this.items = items;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}

