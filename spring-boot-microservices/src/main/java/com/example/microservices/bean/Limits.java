package com.example.microservices.bean;

public class Limits {
	int minimun;
	int maximum;
	public Limits() {
		// TODO Auto-generated constructor stub
	}
	
	public Limits(int minimun, int maximum) {
		super();
		this.minimun = minimun;
		this.maximum = maximum;
	}

	public int getMinimun() {
		return minimun;
	}
	public void setMinimun(int minimun) {
		this.minimun = minimun;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	

}
