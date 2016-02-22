package com.mark.process;

public class Snack {
	private String name;
	private String flavor;
	private boolean healthy;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public boolean isHealthy() {
		return healthy;
	}
	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}
	
	@Override
	public String toString() {
		return "Snack [name=" + name + ", flavor=" + flavor + ", healthy="
				+ healthy + "]";
	}
}
