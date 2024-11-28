package com.di.setter.map;

import java.util.Map;

public class Shop {

	private String name;

	private Map<String, Double> items;

	public void display() {
		System.out.println("Welcome to " + name + " shop");
		System.out.println("\n---------- Items ----------");

		for (Map.Entry<String, Double> entry : items.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Double> getItems() {
		return items;
	}

	public void setItems(Map<String, Double> items) {
		this.items = items;
	}

}
